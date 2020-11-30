package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheProfessionSkill;
import live.huanghe.common.domain.LiveHuangheProfessionSkillExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheProfessionSkillMapper {
    long countByExample(LiveHuangheProfessionSkillExample example);

    int deleteByExample(LiveHuangheProfessionSkillExample example);

    int deleteByPrimaryKey(Integer skillId);

    int insert(LiveHuangheProfessionSkill record);

    int insertSelective(LiveHuangheProfessionSkill record);

    List<LiveHuangheProfessionSkill> selectByExample(LiveHuangheProfessionSkillExample example);

    LiveHuangheProfessionSkill selectByPrimaryKey(Integer skillId);

    int updateByExampleSelective(@Param("record") LiveHuangheProfessionSkill record, @Param("example") LiveHuangheProfessionSkillExample example);

    int updateByExample(@Param("record") LiveHuangheProfessionSkill record, @Param("example") LiveHuangheProfessionSkillExample example);

    int updateByPrimaryKeySelective(LiveHuangheProfessionSkill record);

    int updateByPrimaryKey(LiveHuangheProfessionSkill record);
}