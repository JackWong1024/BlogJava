package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheLabel;
import live.huanghe.common.domain.LiveHuangheLabelExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheLabelMapper {
    long countByExample(LiveHuangheLabelExample example);

    int deleteByExample(LiveHuangheLabelExample example);

    int deleteByPrimaryKey(Integer labelId);

    int insert(LiveHuangheLabel record);

    int insertSelective(LiveHuangheLabel record);

    List<LiveHuangheLabel> selectByExample(LiveHuangheLabelExample example);

    LiveHuangheLabel selectByPrimaryKey(Integer labelId);

    int updateByExampleSelective(@Param("record") LiveHuangheLabel record, @Param("example") LiveHuangheLabelExample example);

    int updateByExample(@Param("record") LiveHuangheLabel record, @Param("example") LiveHuangheLabelExample example);

    int updateByPrimaryKeySelective(LiveHuangheLabel record);

    int updateByPrimaryKey(LiveHuangheLabel record);
}