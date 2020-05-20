package live.huanghe.zuul.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface PerssionService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
