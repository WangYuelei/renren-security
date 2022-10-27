package com.wyl.modules.patient.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wyl.common.service.impl.CrudServiceImpl;
import com.wyl.modules.patient.dao.PatientDao;
import com.wyl.modules.patient.dto.PatientDTO;
import com.wyl.modules.patient.entity.PatientEntity;
import com.wyl.modules.patient.service.PatientService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@Service
public class PatientServiceImpl extends CrudServiceImpl<PatientDao, PatientEntity, PatientDTO> implements PatientService {

    @Override
    public QueryWrapper<PatientEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PatientEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}