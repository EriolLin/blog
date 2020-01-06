package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：users
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`users`")
public class Users {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "`user_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 用户IP
     */
    @Column(name = "`user_ip`")
    @ApiModelProperty("用户IP")
    private String userIp;

    /**
     * 用户名
     */
    @Column(name = "`user_name`")
    @ApiModelProperty("用户名")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "`user_password`")
    @ApiModelProperty("用户密码")
    private String userPassword;

    /**
     * 用户邮箱
     */
    @Column(name = "`user_email`")
    @ApiModelProperty("用户邮箱")
    private String userEmail;

    /**
     * 用户头像
     */
    @Column(name = "`user_profile_photo`")
    @ApiModelProperty("用户头像")
    private String userProfilePhoto;

    /**
     * 注册时间
     */
    @Column(name = "`user_registration_time`")
    @ApiModelProperty("注册时间")
    private Date userRegistrationTime;

    /**
     * 用户生日
     */
    @Column(name = "`user_birthday`")
    @ApiModelProperty("用户生日")
    private Date userBirthday;

    /**
     * 用户年龄
     */
    @Column(name = "`user_age`")
    @ApiModelProperty("用户年龄")
    private Byte userAge;

    /**
     * 用户手机号
     */
    @Column(name = "`user_telephone_number`")
    @ApiModelProperty("用户手机号")
    private Integer userTelephoneNumber;

    /**
     * 用户昵称
     */
    @Column(name = "`user_nickname`")
    @ApiModelProperty("用户昵称")
    private String userNickname;

    public static final String USER_ID = "userId";

    public static final String DB_USER_ID = "user_id";

    public static final String USER_IP = "userIp";

    public static final String DB_USER_IP = "user_ip";

    public static final String USER_NAME = "userName";

    public static final String DB_USER_NAME = "user_name";

    public static final String USER_PASSWORD = "userPassword";

    public static final String DB_USER_PASSWORD = "user_password";

    public static final String USER_EMAIL = "userEmail";

    public static final String DB_USER_EMAIL = "user_email";

    public static final String USER_PROFILE_PHOTO = "userProfilePhoto";

    public static final String DB_USER_PROFILE_PHOTO = "user_profile_photo";

    public static final String USER_REGISTRATION_TIME = "userRegistrationTime";

    public static final String DB_USER_REGISTRATION_TIME = "user_registration_time";

    public static final String USER_BIRTHDAY = "userBirthday";

    public static final String DB_USER_BIRTHDAY = "user_birthday";

    public static final String USER_AGE = "userAge";

    public static final String DB_USER_AGE = "user_age";

    public static final String USER_TELEPHONE_NUMBER = "userTelephoneNumber";

    public static final String DB_USER_TELEPHONE_NUMBER = "user_telephone_number";

    public static final String USER_NICKNAME = "userNickname";

    public static final String DB_USER_NICKNAME = "user_nickname";

    /**
     * 带默认值的实例
    */
    public static Users defaultInstance() {
        Users instance = new Users();
        return instance;
    }
}