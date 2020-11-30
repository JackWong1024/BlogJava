package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheJob;
import live.huanghe.common.domain.LiveHuangheJobExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheJobMapper {
    long countByExample(LiveHuangheJobExample example);

    int deleteByExample(LiveHuangheJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(LiveHuangheJob record);

    int insertSelective(LiveHuangheJob record);

    List<LiveHuangheJob> selectByExample(LiveHuangheJobExample example);

    LiveHuangheJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") LiveHuangheJob record, @Param("example") LiveHuangheJobExample example);

    int updateByExample(@Param("record") LiveHuangheJob record, @Param("example") LiveHuangheJobExample example);

    int updateByPrimaryKeySelective(LiveHuangheJob record);

    int updateByPrimaryKey(LiveHuangheJob record);
}