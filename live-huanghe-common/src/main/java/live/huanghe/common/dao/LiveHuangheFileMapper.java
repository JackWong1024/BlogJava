package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheFile;
import live.huanghe.common.domain.LiveHuangheFileExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheFileMapper {
    long countByExample(LiveHuangheFileExample example);

    int deleteByExample(LiveHuangheFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(LiveHuangheFile record);

    int insertSelective(LiveHuangheFile record);

    List<LiveHuangheFile> selectByExample(LiveHuangheFileExample example);

    LiveHuangheFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") LiveHuangheFile record, @Param("example") LiveHuangheFileExample example);

    int updateByExample(@Param("record") LiveHuangheFile record, @Param("example") LiveHuangheFileExample example);

    int updateByPrimaryKeySelective(LiveHuangheFile record);

    int updateByPrimaryKey(LiveHuangheFile record);
}