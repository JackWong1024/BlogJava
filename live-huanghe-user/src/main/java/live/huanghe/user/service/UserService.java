package live.huanghe.user.service;

import live.huanghe.common.domain.LiveHuangheUser;
import org.apache.ibatis.annotations.Select;

public interface UserService {

//    @Select("select * from live_huanghe_user where user_id=ifnull(#{userId},1,#{userId}) ")
    LiveHuangheUser getUserInfoByUserId(int userId);
}
