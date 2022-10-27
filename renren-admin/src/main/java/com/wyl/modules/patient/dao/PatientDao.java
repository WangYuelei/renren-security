package com.wyl.modules.patient.dao;

import com.wyl.common.dao.BaseDao;
import com.wyl.modules.patient.entity.PatientEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@Mapper
public interface PatientDao extends BaseDao<PatientEntity> {
	
}