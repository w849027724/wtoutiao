package com.wtoutiao.admin.service.impl;

import com.wtoutiao.admin.entity.SysRole;
import com.wtoutiao.admin.mapper.RoleMapper;
import com.wtoutiao.admin.service.RoleService;
import com.wtoutiao.common.core.service.impl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author wulijun
 * @Title: RoleServiceImpl
 * @date 2019/10/16 15:28
 */
@Slf4j
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, SysRole> implements RoleService {
}
