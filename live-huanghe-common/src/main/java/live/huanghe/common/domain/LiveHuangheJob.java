package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheJob implements Serializable {
    /**
    * 工作id
    */
    private Integer jobId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 工作公司
    */
    private String jobCompany;

    /**
    * 工作职责
    */
    private String jobDuties;

    /**
    * 工作开始时间
    */
    private Date jobStartTime;

    /**
    * 工作时间
    */
    private Date jonEndTime;

    /**
    * 工作名称
    */
    private String jobName;

    /**
    * 内容
    */
    private String jobContent;

    /**
    * 采用技术List<CloudSkillId>
    */
    private String jobTechnology;

    private static final long serialVersionUID = 1L;
}