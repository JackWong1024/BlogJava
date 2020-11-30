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
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Api(description = "用户-控制器", value = "用户-控制器")
@RequestMapping("/user")
@RestController
@Log4j2
@EnableFeignClients
public class UserController {

    @Autowired
    private UserService userService;



    @ApiOperation("获取用户信息,如果登录了,就获取登录用户的id")
    @GetMapping("/getUserInfoByUserName")
    public JsonRet<LiveHuangheUser>  getUserInfoByUserId(@RequestParam(value = "userName", required = false) String userName, @RequestParam(value = "userId", required = false) Integer userId) {
        LiveHuangheUser user = userService.getUserInfoByUserId(userName, userId);
        return JsonRet.buildSuccRet(user);
    }


    @ApiOperation("新建用户")
    @GetMapping("/addUser")
    public JsonRet addUser(@RequestBody LiveHuangheUser liveHuangheUser) {
        return userService.addUser(liveHuangheUser);
    }


    @ApiOperation("获取用户认证信息")
    @GetMapping("/getAuthentication")
    public JsonRet<Authentication> getAuthentication(Authentication authentication) {
        return JsonRet.buildSuccRet(authentication);

    }




}
