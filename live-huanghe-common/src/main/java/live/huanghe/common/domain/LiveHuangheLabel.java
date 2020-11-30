package live.huanghe.common.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class LiveHuangheLabel implements Serializable {
    private Integer labelId;

    /**
    * 标签名
    */
    private Integer labelName;

    /**
    * 博客id
    */
    private Integer blogId;

    private static final long serialVersionUID = 1L;
}