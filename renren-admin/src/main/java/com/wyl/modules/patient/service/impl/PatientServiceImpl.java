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
        QueryWrapper<PatientEntity> wrapper = new QueryWrapper<>();
        //创建者
        String operatorid = (String)params.get("operatorid");
        wrapper.eq(StringUtils.isNotBlank(operatorid), "operatorid", operatorid);
        //patientId
        String patientid = (String)params.get("patientid");
        wrapper.eq(StringUtils.isNotBlank(patientid), "patientid", patientid);
        //patientName
        String patientname = (String)params.get("patientname");
        wrapper.like(StringUtils.isNotBlank(patientname), "patientname", patientname);
        //创建时间
        String createStart = (String)params.get("createStart");
        wrapper.ge(StringUtils.isNotBlank(createStart), "CreateTime", createStart);
        String createEnd = (String)params.get("createEnd");
        wrapper.le(StringUtils.isNotBlank(createEnd), "CreateTime", createEnd);
        return wrapper;
    }


}