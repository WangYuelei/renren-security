/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.wyl.modules.oss.service;

import com.wyl.common.page.PageData;
import com.wyl.common.service.BaseService;
import com.wyl.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 * 
 * @author Mark sunlightcs@gmail.com
 */
public interface SysOssService extends BaseService<SysOssEntity> {

	PageData<SysOssEntity> page(Map<String, Object> params);
}
