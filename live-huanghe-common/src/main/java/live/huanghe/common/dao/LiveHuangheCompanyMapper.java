package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheCompany;
import live.huanghe.common.domain.LiveHuangheCompanyExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheCompanyMapper {
    long countByExample(LiveHuangheCompanyExample example);

    int deleteByExample(LiveHuangheCompanyExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(LiveHuangheCompany record);

    int insertSelective(LiveHuangheCompany record);

    List<LiveHuangheCompany> selectByExample(LiveHuangheCompanyExample example);

    LiveHuangheCompany selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") LiveHuangheCompany record, @Param("example") LiveHuangheCompanyExample example);

    int updateByExample(@Param("record") LiveHuangheCompany record, @Param("example") LiveHuangheCompanyExample example);

    int updateByPrimaryKeySelective(LiveHuangheCompany record);

    int updateByPrimaryKey(LiveHuangheCompany record);
}