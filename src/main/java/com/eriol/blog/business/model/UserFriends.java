package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`user_friends`")
public class UserFriends {
    /**
     * 标识ID
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("博文ID")
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 好友ID
     */
    @Column(name = "`user_friends_id`")
    @ApiModelProperty("好友ID")
    private Long userFriendsId;

    /**
     * 好友备注
     */
    @Column(name = "`user_note`")
    @ApiModelProperty("好友ID")
    private Long userNote;

    /**
     * 好友状态
     */
    @Column(name = "`user_status`")
    @ApiModelProperty("好友状态")
    private Long userStatus;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String USER_ID = "userId";

    public static final String DB_USER_ID = "user_id";

    public static final String USER_FRIENDS_ID = "userFriendsId";

    public static final String DB_USER_FRIENDS_ID = "user_friend_id";

    public static final String USER_NOTE = "userNote";

    public static final String DB_USER_NOTE = "user_note";

    public static final String USER_STATUS = "userStatus";

    public static final String DB_USER_STATUS = "user_status";

    /**
     * 带默认值的实例
     */
    public static UserFriends defaultInstance() {
        UserFriends instance = new UserFriends();
        return instance;
    }

}
