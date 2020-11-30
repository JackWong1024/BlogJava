package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheCompany implements Serializable {
    /**
    * 公司id
    */
    private Integer companyId;

    /**
    * 公司名称
    */
    private String companyName;

    /**
    * 公司地址
    */
    private String companyAddress;

    /**
    * 公司人数xx-xx
    */
    private String companyMembersNumber;

    /**
    * 入职时间
    */
    private Date companyStartTime;

    /**
    * 离职时间
    */
    private Date companyEndTime;

    private static final long serialVersionUID = 1L;
}