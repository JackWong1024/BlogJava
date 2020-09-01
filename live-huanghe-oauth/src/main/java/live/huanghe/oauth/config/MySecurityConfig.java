package live.huanghe.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity//开启权限验证
public class MySecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.requestMatchers()//使HttpSecurity接收以"/login/","/oauth/"开头请求。
              .antMatchers("/oauth/**", "/login/**", "/logout/**")
              .and()
              .authorizeRequests()
              .antMatchers("/oauth/**").authenticated()
              .and()
              .authorizeRequests()
              .antMatchers("/**")
              .permitAll()
              .and()
              .formLogin()

              ;
        http.csrf().disable();
    }

    /**
     * 配置这个bean会在做AuthorizationServerConfigurer配置的时候使用
     *
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 配置用户
     * 使用内存中的用户，实际项目中，一般使用的是数据库保存用户，具体的实现类可以使用JdbcDaoImpl或者JdbcUserDetailsManager
     *
     * @return
     */
//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        manager.createUser(User.withUsername("admin")
//////                .password(PasswordEncoderFactories.createDelegatingPasswordEncoder()
//////                        .encode("admin"))
////                .password(new MyPasswordEncoder().encode("admin"))
////                .authorities("USER").build());
////        return manager;
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService());
        auth.inMemoryAuthentication()
                .withUser("zhangsan").password("12345").roles("SuperAdmin")
                .and()
                .withUser("admin").password("admin").roles("Admin")
                .and()
                .withUser("wangwu").password("12345").roles("Employee")
                .and()
                .passwordEncoder(new CustomPasswordEncoder());
    }
    public class CustomPasswordEncoder implements PasswordEncoder {

        @Override
        public String encode(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override
        public boolean matches(CharSequence charSequence, String s) {
            return s.equals(charSequence.toString());
        }
    }

}