package live.huanghe.user.service.serviceImpl;

import live.huanghe.common.dao.LiveHuangheUserMapper;
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
    public LiveHuangheUser getUserInfoByUserId(String userName) {
        LiveHuangheUserExample  example=new LiveHuangheUserExample();
        example.or().andUserNameEqualTo(userName);
        List<LiveHuangheUser> liveHuangheUsers = liveHuangheUserMapper.selectByExample(example);

        return  liveHuangheUsers.size()>0?liveHuangheUsers.get(0):null;

    }
}
