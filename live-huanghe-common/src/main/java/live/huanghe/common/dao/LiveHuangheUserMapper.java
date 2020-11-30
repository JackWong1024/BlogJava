package live.huanghe.common.dao;

import java.util.Date;
import java.util.List;
import live.huanghe.common.domain.LiveHuangheUser;
import live.huanghe.common.domain.LiveHuangheUserExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheUserMapper {
    long countByExample(LiveHuangheUserExample example);

    int deleteByExample(LiveHuangheUserExample example);

    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("userCreateTime") Date userCreateTime);

    int insert(LiveHuangheUser record);

    int insertSelective(LiveHuangheUser record);

    List<LiveHuangheUser> selectByExample(LiveHuangheUserExample example);

    LiveHuangheUser selectByPrimaryKey(@Param("userId") Integer userId, @Param("userCreateTime") Date userCreateTime);

    int updateByExampleSelective(@Param("record") LiveHuangheUser record, @Param("example") LiveHuangheUserExample example);

    int updateByExample(@Param("record") LiveHuangheUser record, @Param("example") LiveHuangheUserExample example);

    int updateByPrimaryKeySelective(LiveHuangheUser record);

    int updateByPrimaryKey(LiveHuangheUser record);

    int deleteByPrimaryKey(Integer userId);

    LiveHuangheUser selectByPrimaryKey(Integer userId);

    int insertOrUpdate(LiveHuangheUser record);

    int insertOrUpdateSelective(LiveHuangheUser record);

    int updateBatch(List<LiveHuangheUser> list);

    int batchInsert(@Param("list") List<LiveHuangheUser> list);
}