package live.huanghe.oauth.feign.fallback;


import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.oauth.feign.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public LiveHuangheUser getUserInfoByUserName(String userName) {
        return null;
    }
}
