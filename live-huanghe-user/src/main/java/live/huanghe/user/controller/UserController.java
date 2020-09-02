package live.huanghe.user.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import live.huanghe.common.domain.JsonRet;
import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.user.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Api(description = "用户-控制器",value = "用户-控制器")
@RequestMapping("/user")
@RestController
@Log4j2
@EnableFeignClients
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获取用户信息,如果登录了,就获取登录用户的id")
    @GetMapping("/getUserInfoByUserName")
    public LiveHuangheUser getUserInfoByUserId(@RequestParam("userName")String userName ){
      LiveHuangheUser user=  userService.getUserInfoByUserId(userName);
      return user;

    }

    @ApiOperation("获取用户认证信息")
    @GetMapping("/getAuthentication")
    public JsonRet<Authentication> getAuthentication(Authentication authentication){

        return JsonRet.buildSuccRet(authentication);

    }

    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("M月dd日 H时mm分");
        String format = sdf.format(new Date());
        System.out.printf(format);
    }

}
