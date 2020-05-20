package live.huanghe.zuul.config;

import live.huanghe.zuul.exception.AuthExceptionEntryPoint;
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
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http
                .authorizeRequests();
        //经过oauth服务的连接全部放行,不然token会获取不到
        registry.antMatchers("/oauth/**").permitAll();
        //任何连接只要认证后放行
//        registry.anyRequest().authenticated();
        registry.anyRequest().permitAll();
        //权限控制
//        registry.anyRequest().access("@permissionService.hasPermission(request,authentication)");
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        //跟oauth中的值必须一样
        resources.resourceId("huanghe");
        resources.authenticationEntryPoint(new AuthExceptionEntryPoint());
    }
}
