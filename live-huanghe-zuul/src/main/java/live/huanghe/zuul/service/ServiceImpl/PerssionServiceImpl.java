package live.huanghe.zuul.service.ServiceImpl;

import live.huanghe.zuul.service.PerssionService;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import javax.servlet.http.HttpServletRequest;

public class PerssionServiceImpl implements PerssionService {
    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }
        if (!(authentication instanceof OAuth2Authentication)) {
            return false;
        }
        return this.checkUserPermission(request, authentication);

    }

    private boolean checkUserPermission(HttpServletRequest request, Authentication authentication) {
        return true;
    }
}
