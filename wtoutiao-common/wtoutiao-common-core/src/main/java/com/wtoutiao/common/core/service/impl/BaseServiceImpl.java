package com.wtoutiao.common.core.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wtoutiao.common.core.service.BaseService;

/**
 * @author wulijun
 * @Title: BaseServiceImpl
 * @date 2019/10/16 15:10
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T>  {
}
