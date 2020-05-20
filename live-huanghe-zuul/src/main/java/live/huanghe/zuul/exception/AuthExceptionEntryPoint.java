package live.huanghe.zuul.exception;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//自定义Token异常信息,用于token校验失败返回信息,比如token过期/验证错误
public class AuthExceptionEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        Map map =new HashMap();
        map.put("code","-1");
        map.put("message","token非法");
        httpServletResponse.setContentType(MediaType.APPLICATION_PROBLEM_JSON_VALUE);
        httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(httpServletResponse.getOutputStream(),map);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
