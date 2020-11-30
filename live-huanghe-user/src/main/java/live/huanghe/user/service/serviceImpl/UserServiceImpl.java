package live.huanghe.user.service.serviceImpl;

import live.huanghe.common.dao.LiveHuangheUserMapper;
import live.huanghe.common.domain.JsonRet;
import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.common.domain.LiveHuangheUserExample;
import live.huanghe.user.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    LiveHuangheUserMapper liveHuangheUserMapper;

    @Override
    public LiveHuangheUser getUserInfoByUserId(String userName, Integer userId) {
        LiveHuangheUserExample example = new LiveHuangheUserExample();
        if (userId != null) example.or().andUserIdEqualTo(userId);
        if (userName != null) example.or().andUserNameEqualTo(userName);
        List<LiveHuangheUser> liveHuangheUserList = liveHuangheUserMapper.selectByExample(example);
        //获取用户的其他信息
        return liveHuangheUserList.size() > 0 ? liveHuangheUserList.get(0) : null;
    }


    @Override
    public JsonRet addUser(LiveHuangheUser liveHuangheUser) {
        try {
            int insert = liveHuangheUserMapper.insert(liveHuangheUser);
            if (insert == 1) {
                return JsonRet.message(0, "创建用户成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonRet.message(-1, "创建用户失败");
    }
}
