package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：articles
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`articles`")
public class Articles {
    /**
     * 博文ID
     */
    @Id
    @Column(name = "`article_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("博文ID")
    private Long articleId;

    /**
     * 发表用户ID
     */
    @Column(name = "`user_id`")
    @ApiModelProperty("发表用户ID")
    private Long userId;

    /**
     * 浏览量
     */
    @Column(name = "`article_views`")
    @ApiModelProperty("浏览量")
    private Long articleViews;

    /**
     * 评论总数
     */
    @Column(name = "`article_comment_count`")
    @ApiModelProperty("评论总数")
    private Long articleCommentCount;

    /**
     * 发表时间
     */
    @Column(name = "`article_date`")
    @ApiModelProperty("发表时间")
    private Date articleDate;

    @Column(name = "`article_like_count`")
    @ApiModelProperty("")
    private Long articleLikeCount;

    /**
     * 博文标题
     */
    @Column(name = "`article_title`")
    @ApiModelProperty("博文标题")
    private String articleTitle;

    /**
     * 博文内容
     */
    @Column(name = "`article_content`")
    @ApiModelProperty("博文内容")
    private String articleContent;

    public static final String ARTICLE_ID = "articleId";

    public static final String DB_ARTICLE_ID = "article_id";

    public static final String USER_ID = "userId";

    public static final String DB_USER_ID = "user_id";

    public static final String ARTICLE_VIEWS = "articleViews";

    public static final String DB_ARTICLE_VIEWS = "article_views";

    public static final String ARTICLE_COMMENT_COUNT = "articleCommentCount";

    public static final String DB_ARTICLE_COMMENT_COUNT = "article_comment_count";

    public static final String ARTICLE_DATE = "articleDate";

    public static final String DB_ARTICLE_DATE = "article_date";

    public static final String ARTICLE_LIKE_COUNT = "articleLikeCount";

    public static final String DB_ARTICLE_LIKE_COUNT = "article_like_count";

    public static final String ARTICLE_TITLE = "articleTitle";

    public static final String DB_ARTICLE_TITLE = "article_title";

    public static final String ARTICLE_CONTENT = "articleContent";

    public static final String DB_ARTICLE_CONTENT = "article_content";

    /**
     * 带默认值的实例
    */
    public static Articles defaultInstance() {
        Articles instance = new Articles();
        return instance;
    }
}