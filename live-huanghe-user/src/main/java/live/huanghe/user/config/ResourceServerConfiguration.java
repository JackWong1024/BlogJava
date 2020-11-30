package live.huanghe.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
//        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http
//                .authorizeRequests();
//        //经过oauth服务的连接全部放行,不然token会获取不到
//        registry.antMatchers("/oauth/**","/login").permitAll();
//        //任何连接只要认证后放行

        http.csrf().disable()//禁用了 csrf 功能
                .authorizeRequests()//限定签名成功的请求
                .antMatchers("/oauth/**","/login","/**/**").permitAll()
                .antMatchers("/decision/**","/govern/**").hasAnyRole("USER","ADMIN")
//                .antMatchers("/user/**","/admin/**").authenticated()//签名成功后可访问，不受role限制
                .anyRequest().permitAll()//其他没有限定的请求，允许访问
                .and().anonymous()//对于没有配置权限的其他请求允许匿名访问
                .and().formLogin()//使用 spring security 默认登录页面
                .and().httpBasic();//启用http 基础验证
    }


}
