package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheBlog implements Serializable {
    private Integer blogId;

    /**
     * 技术标签id
     */
    private Integer blogSkillId;

    private String blogTitle;

    private String blogContent;

    private Integer blogUserId;

    private Date blogCreateTime;

    private static final long serialVersionUID = 1L;
}