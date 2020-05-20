package live.huanghe.oauth.feign;

import live.huanghe.common.domain.LiveHuangheUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//, fallback = UserServiceImpl.class
@FeignClient(value = "user-server")
public interface UserService {


    @GetMapping("/user/getUserInfoByUserName")
    LiveHuangheUser getUserInfoByUserName(@RequestParam(required = false) String userName);
}
