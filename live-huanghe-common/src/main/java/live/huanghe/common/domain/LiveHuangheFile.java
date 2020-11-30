package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheFile implements Serializable {
    /**
    * 图片上传id
    */
    private Integer fileId;

    private String fileUrl;

    private Date fileCreateTime;

    private static final long serialVersionUID = 1L;
}