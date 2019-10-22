package com.wtoutiao.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wtoutiao.common.core.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author wulijun
 * @Title: SysRole
 * @date 2019/10/16 15:20
 */
@Data
@TableName("sys_role")
@Accessors(chain = true)
@ApiModel(value = "角色")
public class SysRole extends BaseEntity<SysRole> {

    private static final long serialVersionUID = 2485670812946265215L;

    @TableId(value = "sys_role_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Long sysRoleId;

    @ApiModelProperty(value = "username")
    private String username;

    @ApiModelProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "sex")
    private Integer sex;

    @ApiModelProperty(value = "photo")
    private String photo;

    @ApiModelProperty(value = "mobile")
    private Integer mobile;

}
