package live.huanghe.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "live-huanghe-common-domain-LiveHuangheUser")
@Data
public class LiveHuangheUser implements Serializable{

    @ApiModelProperty(value = "null")
    private Integer userId;

    /**
     * 名字
     */
    @ApiModelProperty(value = "名字")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String passWord;

    /**
     * 用户生日
     */
    @ApiModelProperty(value = "用户生日")
    private String userBirthDay;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    /**
     * 用户电话
     */
    @ApiModelProperty(value = "用户电话")
    private String userPhone;

    /**
     * 用户官网
     */
    @ApiModelProperty(value = "用户官网")
    private String userWebsite;

    /**
     * 用户地址
     */
    @ApiModelProperty(value = "用户地址")
    private String userAddress;

    /**
     * 0：管理员，1普通用户
     */
    @ApiModelProperty(value = "0：管理员，1普通用户")
    private String userType;

    /**
     * 0:未开通，1:开通
     */
    @ApiModelProperty(value = "0:未开通，1:开通")
    private String userStatus;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String userHeadImg;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime userCreateTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime userUpdateTime;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime userLastLoginTime;

    /**
     * 最后登录ip
     */
    @ApiModelProperty(value = "最后登录ip")
    private String userLastLoginIp;

    private static final long serialVersionUID = 1L;
}