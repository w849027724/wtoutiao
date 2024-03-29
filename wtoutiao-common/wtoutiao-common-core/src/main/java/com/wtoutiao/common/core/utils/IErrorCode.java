package com.wtoutiao.common.core.utils;

import java.io.Serializable;

/**
 * 错误码接口
 * @author Donald
 */
public interface IErrorCode extends Serializable {

	/**
	 * 获取错误码
	 * @return
	 */
	int getCode();

	/**
	 * 获取错误消息
	 * @return
	 */
	String getMsg();
}
