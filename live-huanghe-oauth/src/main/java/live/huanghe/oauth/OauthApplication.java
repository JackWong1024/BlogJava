package live.huanghe.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @description
 * @Autor JackWong
 */
@SpringBootApplication( exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@EnableAuthorizationServer
public class OauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class,args);
    }
}
