package live.huanghe.oauth.service.serviceImpl;


import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.oauth.domain.UserVoDetail;
import live.huanghe.oauth.feign.UserService;
import live.huanghe.oauth.service.OauthService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("OauthService")
@Log4j2

public class OauthServiceImpl implements OauthService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserVoDetail userVoDetail = new UserVoDetail();
        LiveHuangheUser userInfoByUserName = userService.getUserInfoByUserName(s);
        userVoDetail.setUsername(userInfoByUserName.getUserName());
        userVoDetail.setPassword(userInfoByUserName.getPassWord());
        userVoDetail.setUserId(userInfoByUserName.getUserId());
        return  userVoDetail;
    }
}
