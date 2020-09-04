package live.huanghe.oauth.config;

import live.huanghe.oauth.service.OauthService;
import live.huanghe.oauth.service.serviceImpl.OauthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@EnableWebSecurity//开启权限验证
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    OauthService oauthService;


    //配置安全拦截机制.

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.requestMatchers()//使HttpSecurity接收以"/login/","/oauth/"开头请求。 认证通过.
              .antMatchers("/oauth/**", "/login/**", "/logout/**")
              .and()
              .authorizeRequests()
              .antMatchers("/user/**").authenticated()
              .and()
              .authorizeRequests()
              .antMatchers("/**")
              .permitAll()
              .and()
              .formLogin()  //允许标单输入.用用户名和密码输入.
              .successForwardUrl("/login_susscess")  //登录成功跳转

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
    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题...这里可以用来做自定义的登录界面..替换默认的登录界面
        web.ignoring().antMatchers("/asserts/**");
        //web.ignoring().antMatchers("/favicon.ico");

    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(oauthService).passwordEncoder(passwordEncoder());
    }
    //自定义密码编码器
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

    //原有的密码编码器
    @Bean
    protected PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}