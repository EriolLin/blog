package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：set_artitle_label
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`set_artitle_label`")
public class SetArticleLabel {
    /**
     * 文章ID
     */
    @Id
    @Column(name = "`article_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("文章ID")
    private Long articleId;

    @Column(name = "`label_id`")
    @ApiModelProperty("")
    private Long labelId;

    public static final String ARTICLE_ID = "articleId";

    public static final String DB_ARTICLE_ID = "article_id";

    public static final String LABEL_ID = "labelId";

    public static final String DB_LABEL_ID = "label_id";

    /**
     * 带默认值的实例
    */
    public static SetArticleLabel defaultInstance() {
        SetArticleLabel instance = new SetArticleLabel();
        return instance;
    }
}