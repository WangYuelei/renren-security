/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.wyl.modules.sys.service;

import com.wyl.common.service.BaseService;
import com.wyl.modules.security.user.UserDetail;
import com.wyl.modules.sys.dto.SysMenuDTO;
import com.wyl.modules.sys.entity.SysMenuEntity;

import java.util.List;


/**
 * 菜单管理
 * 
 * @author Mark sunlightcs@gmail.com
 */
public interface SysMenuService extends BaseService<SysMenuEntity> {

	SysMenuDTO get(Long id);

	void save(SysMenuDTO dto);

	void update(SysMenuDTO dto);

	void delete(Long id);

	/**
	 * 菜单列表
	 *
	 * @param type 菜单类型
	 */
	List<SysMenuDTO> getAllMenuList(Integer type);

	/**
	 * 用户菜单列表
	 *
	 * @param user  用户
	 * @param type 菜单类型
	 */
	List<SysMenuDTO> getUserMenuList(UserDetail user, Integer type);

	/**
	 * 根据父菜单，查询子菜单
	 * @param pid  父菜单ID
	 */
	List<SysMenuDTO> getListPid(Long pid);
}
