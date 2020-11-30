package live.huanghe.common.dao;

import java.util.List;
import live.huanghe.common.domain.LiveHuangheBlog;
import live.huanghe.common.domain.LiveHuangheBlogExample;
import org.apache.ibatis.annotations.Param;

public interface LiveHuangheBlogMapper {
    long countByExample(LiveHuangheBlogExample example);

    int deleteByExample(LiveHuangheBlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(LiveHuangheBlog record);

    int insertSelective(LiveHuangheBlog record);

    List<LiveHuangheBlog> selectByExample(LiveHuangheBlogExample example);

    LiveHuangheBlog selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") LiveHuangheBlog record, @Param("example") LiveHuangheBlogExample example);

    int updateByExample(@Param("record") LiveHuangheBlog record, @Param("example") LiveHuangheBlogExample example);

    int updateByPrimaryKeySelective(LiveHuangheBlog record);

    int updateByPrimaryKey(LiveHuangheBlog record);
}