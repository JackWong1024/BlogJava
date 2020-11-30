package live.huanghe.common.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LiveHuangheUser implements Serializable {
    private Integer userId;

    /**
     * 创建时间
     */
    private Date userCreateTime;

    /**
     * 名字
     */
    private String userName;

    private String userEnglishName;

    private String userChineseName;

    /**
     * 密码
     */
    private String userPassWord;

    /**
     * 用户生日
     */
    private String userBirthDay;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户官网
     */
    private String userWebsite;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 0：管理员，1普通用户
     */
    private String userType;

    /**
     * 0:未开通，1:开通
     */
    private String userStatus;

    /**
     * 头像
     */
    private String userHeadImg;

    /**
     * 更新时间
     */
    private Date userUpdateTime;

    /**
     * 最后登录时间
     */
    private Date userLastLoginTime;

    /**
     * 最后登录ip
     */
    private String userLastLoginIp;

    private static final long serialVersionUID = 1L;
}