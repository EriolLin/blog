package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：set_artitle_sort
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`set_artitle_sort`")
public class SetArtitleSort {
    /**
     * 文章ID
     */
    @Id
    @Column(name = "`article_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("文章ID")
    private Long articleId;

    /**
     * 分类ID
     */
    @Id
    @Column(name = "`sort_id`")
    @ApiModelProperty("分类ID")
    private Long sortId;

    public static final String ARTICLE_ID = "articleId";

    public static final String DB_ARTICLE_ID = "article_id";

    public static final String SORT_ID = "sortId";

    public static final String DB_SORT_ID = "sort_id";

    /**
     * 带默认值的实例
    */
    public static SetArtitleSort defaultInstance() {
        SetArtitleSort instance = new SetArtitleSort();
        return instance;
    }
}