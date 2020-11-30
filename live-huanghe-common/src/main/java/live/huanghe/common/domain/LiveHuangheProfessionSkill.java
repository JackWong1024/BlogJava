package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheProfessionSkill implements Serializable {
    private Integer skillId;

    /**
    * 职业技能名称
    */
    private String skillName;

    /**
    * 技能说明
    */
    private String skillContent;

    /**
    * 用户id
    */
    private Integer userId;

    private Date skillCreateTime;

    private Date skillUpdateTime;

    private static final long serialVersionUID = 1L;
}