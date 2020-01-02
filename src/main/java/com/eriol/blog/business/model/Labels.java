package com.eriol.blog.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 表名：labels
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("")
@Table(name = "`labels`")
public class Labels {
    /**
     * 标签ID
     */
    @Id
    @Column(name = "`label_id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("标签ID")
    private Long labelId;

    /**
     * 标签名称
     */
    @Column(name = "`label_name`")
    @ApiModelProperty("标签名称")
    private String labelName;

    /**
     * 标签别名
     */
    @Column(name = "`label_alias`")
    @ApiModelProperty("标签别名")
    private String labelAlias;

    /**
     * 标签描述
     */
    @Column(name = "`label_description`")
    @ApiModelProperty("标签描述")
    private String labelDescription;

    public static final String LABEL_ID = "labelId";

    public static final String DB_LABEL_ID = "label_id";

    public static final String LABEL_NAME = "labelName";

    public static final String DB_LABEL_NAME = "label_name";

    public static final String LABEL_ALIAS = "labelAlias";

    public static final String DB_LABEL_ALIAS = "label_alias";

    public static final String LABEL_DESCRIPTION = "labelDescription";

    public static final String DB_LABEL_DESCRIPTION = "label_description";

    /**
     * 带默认值的实例
    */
    public static Labels defaultInstance() {
        Labels instance = new Labels();
        return instance;
    }
}