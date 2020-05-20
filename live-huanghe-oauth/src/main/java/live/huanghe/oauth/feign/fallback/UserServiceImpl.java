package live.huanghe.oauth.feign.fallback;


import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.oauth.feign.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public LiveHuangheUser getUserInfoByUserName(String userName) {
        return null;
    }
}
