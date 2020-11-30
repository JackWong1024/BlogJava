package live.huanghe.user.service;

import io.swagger.models.auth.In;
import live.huanghe.common.domain.JsonRet;
import live.huanghe.common.domain.LiveHuangheUser;
import org.apache.ibatis.annotations.Select;

public interface UserService {

//    @Select("select * from live_huanghe_user where user_id=ifnull(#{userId},1,#{userId}) ")
    LiveHuangheUser getUserInfoByUserId(String  userName, Integer userId);

    JsonRet addUser(LiveHuangheUser liveHuangheUser);

}
