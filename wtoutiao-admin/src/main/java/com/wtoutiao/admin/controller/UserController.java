package com.wtoutiao.admin.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wtoutiao.admin.entity.SysRole;
import com.wtoutiao.admin.service.RoleService;
import com.wtoutiao.common.core.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wulijun
 * @Title: UserController
 * @date 2019/10/17 15:50
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RoleService roleService;

    /**
     * @return
     */
    @PostMapping("/login")
    public R login(@RequestBody SysRole sysRole) {
        return R.ok(roleService.getOne(Wrappers.query(sysRole)));
    }

    /**
     * @return
     */
    @GetMapping("/info")
    public R info() {
        SysRole sysRole = new SysRole();
        sysRole.setUsername("admin");
        return R.ok(roleService.getOne(Wrappers.query(sysRole)));
    }


}
