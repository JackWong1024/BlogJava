package live.huanghe.user.service.serviceImpl;

import live.huanghe.common.dao.LiveHuangheUserMapper;
import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.common.domain.LiveHuangheUserExample;
import live.huanghe.user.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    LiveHuangheUserMapper userMapper;
    @Override
    public LiveHuangheUser getUserInfoByUserId(int userId) {
      return   userMapper.selectByPrimaryKey(userId);

    }
}
