package live.huanghe.common.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class LiveHuangheBlogSkill implements Serializable {
    private Integer blogSkillId;

    private Integer blogId;

    private Integer skillId;

    private static final long serialVersionUID = 1L;
}