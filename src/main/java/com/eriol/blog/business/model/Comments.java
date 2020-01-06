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
 * 表名：comments
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`comments`")
public class Comments {
    /**
     * 评论ID
     */
    @Id
    @Column(name = "`comment_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("评论ID")
    private Long commentId;

    /**
     * 发表用户ID
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("发表用户ID")
    private Long userId;

    /**
     * 评论博文ID
     */
    @Column(name = "`article_id`")
    @ApiModelProperty("评论博文ID")
    private Long articleId;

    /**
     * 点赞数
     */
    @Column(name = "`comment_like_count`")
    @ApiModelProperty("点赞数")
    private Long commentLikeCount;

    /**
     * 评论日期
     */
    @Column(name = "`comment_date`")
    @ApiModelProperty("评论日期")
    private Date commentDate;

    /**
     * 父评论ID
     */
    @Column(name = "`parent_comment_id`")
    @ApiModelProperty("父评论ID")
    private Long parentCommentId;

    /**
     * 评论内容
     */
    @Column(name = "`comment_content`")
    @ApiModelProperty("评论内容")
    private String commentContent;

    public static final String COMMENT_ID = "commentId";

    public static final String DB_COMMENT_ID = "comment_id";

    public static final String USER_ID = "userId";

    public static final String DB_USER_ID = "user_id";

    public static final String ARTICLE_ID = "articleId";

    public static final String DB_ARTICLE_ID = "article_id";

    public static final String COMMENT_LIKE_COUNT = "commentLikeCount";

    public static final String DB_COMMENT_LIKE_COUNT = "comment_like_count";

    public static final String COMMENT_DATE = "commentDate";

    public static final String DB_COMMENT_DATE = "comment_date";

    public static final String PARENT_COMMENT_ID = "parentCommentId";

    public static final String DB_PARENT_COMMENT_ID = "parent_comment_id";

    public static final String COMMENT_CONTENT = "commentContent";

    public static final String DB_COMMENT_CONTENT = "comment_content";

    /**
     * 带默认值的实例
    */
    public static Comments defaultInstance() {
        Comments instance = new Comments();
        return instance;
    }
}