package com.wtoutiao.admin.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wtoutiao.admin.entity.SysRole;
import com.wtoutiao.admin.service.RoleService;
import com.wtoutiao.common.core.utils.R;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author wulijun
 * @Title: RoleController
 * @date 2019/10/16 14:52
 */
@RestController
@RequestMapping("/role")
@Api(tags = "角色", value = "角色")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * @return
     */
    @GetMapping("/list")
    public R getRole() {
        return R.ok(roleService.list());
    }

    /**
     * @return
     */
    @GetMapping("/one")
    public R login(@PathVariable Long sysRoleId) {
        return R.ok(roleService.getById(sysRoleId));
    }

    /**
     * @return
     */
    @PostMapping("/create")
    public R create(@RequestBody SysRole sysRole) {
        return R.ok(roleService.save(sysRole));
    }

    /**
     * @return
     */
    @PutMapping("/update")
    public R update(@RequestBody SysRole sysRole) {
        return R.ok(roleService.updateById(sysRole));
    }

    /**
     * @return
     */
    @DeleteMapping("/delete")
    public R delete(@Param("sysRoleId") Long sysRoleId) {
        return R.ok(roleService.removeById(sysRoleId));
    }

}
