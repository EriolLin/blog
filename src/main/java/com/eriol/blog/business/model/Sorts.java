package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：sorts
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`sorts`")
public class Sorts {
    /**
     * 分类ID
     */
    @Id
    @Column(name = "`sort_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("分类ID")
    private Long sortId;

    /**
     * 分类名称
     */
    @Column(name = "`sort_name`")
    @ApiModelProperty("分类名称")
    private String sortName;

    /**
     * 分类别名
     */
    @Column(name = "`sort_alias`")
    @ApiModelProperty("分类别名")
    private String sortAlias;

    /**
     * 父分类ID
     */
    @Column(name = "`parent_sort_id`")
    @ApiModelProperty("父分类ID")
    private Long parentSortId;

    /**
     * 分类描述
     */
    @Column(name = "`sort_description`")
    @ApiModelProperty("分类描述")
    private String sortDescription;

    public static final String SORT_ID = "sortId";

    public static final String DB_SORT_ID = "sort_id";

    public static final String SORT_NAME = "sortName";

    public static final String DB_SORT_NAME = "sort_name";

    public static final String SORT_ALIAS = "sortAlias";

    public static final String DB_SORT_ALIAS = "sort_alias";

    public static final String PARENT_SORT_ID = "parentSortId";

    public static final String DB_PARENT_SORT_ID = "parent_sort_id";

    public static final String SORT_DESCRIPTION = "sortDescription";

    public static final String DB_SORT_DESCRIPTION = "sort_description";

    /**
     * 带默认值的实例
    */
    public static Sorts defaultInstance() {
        Sorts instance = new Sorts();
        return instance;
    }
}