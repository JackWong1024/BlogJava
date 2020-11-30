package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheBlogSkill;
import live.huanghe.common.domain.LiveHuangheBlogSkillExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheBlogSkillMapper {
    long countByExample(LiveHuangheBlogSkillExample example);

    int deleteByExample(LiveHuangheBlogSkillExample example);

    int deleteByPrimaryKey(Integer blogSkillId);

    int insert(LiveHuangheBlogSkill record);

    int insertSelective(LiveHuangheBlogSkill record);

    List<LiveHuangheBlogSkill> selectByExample(LiveHuangheBlogSkillExample example);

    LiveHuangheBlogSkill selectByPrimaryKey(Integer blogSkillId);

    int updateByExampleSelective(@Param("record") LiveHuangheBlogSkill record, @Param("example") LiveHuangheBlogSkillExample example);

    int updateByExample(@Param("record") LiveHuangheBlogSkill record, @Param("example") LiveHuangheBlogSkillExample example);

    int updateByPrimaryKeySelective(LiveHuangheBlogSkill record);

    int updateByPrimaryKey(LiveHuangheBlogSkill record);
}