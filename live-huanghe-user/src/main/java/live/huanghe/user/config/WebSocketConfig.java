package live.huanghe.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.config.annotation.*;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.OnMessage;
import java.util.List;


@Component
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * ServerEndpointExporter 作用
     *
     * 这个Bean会自动注册使用@ServerEndpoint注解声明的websocket endpoint
     *
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }








}