package com.wyl.modules.ppgData.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wyl.common.service.impl.CrudServiceImpl;
import com.wyl.modules.ppgData.dao.PpgDataDao;
import com.wyl.modules.ppgData.dto.PpgDataDTO;
import com.wyl.modules.ppgData.entity.PpgDataEntity;
import com.wyl.modules.ppgData.service.PpgDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-30
 */
@Service
public class PpgDataServiceImpl extends CrudServiceImpl<PpgDataDao, PpgDataEntity, PpgDataDTO> implements PpgDataService {

    @Override
    public QueryWrapper<PpgDataEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("dataid");

        QueryWrapper<PpgDataEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "dataId", id);

        return wrapper;
    }


}