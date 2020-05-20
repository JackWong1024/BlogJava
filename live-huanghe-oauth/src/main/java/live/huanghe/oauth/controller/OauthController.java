package live.huanghe.oauth.controller;


import live.huanghe.common.domain.JsonRet;
import live.huanghe.oauth.service.OauthService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/oauth")
@Log4j2
@EnableFeignClients
public class OauthController {
    @Autowired
    OauthService oauthService;

    @GetMapping("loadUserByUsername")
    public JsonRet<?> getUserInfoByUserName() {
        return JsonRet.buildSuccRet(oauthService.loadUserByUsername("hello"));
    }

}
