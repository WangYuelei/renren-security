package com.wyl.modules.patient.controller;

import com.wyl.common.annotation.LogOperation;
import com.wyl.common.constant.Constant;
import com.wyl.common.page.PageData;
import com.wyl.common.utils.ExcelUtils;
import com.wyl.common.utils.Result;
import com.wyl.common.validator.AssertUtils;
import com.wyl.common.validator.ValidatorUtils;
import com.wyl.common.validator.group.AddGroup;
import com.wyl.common.validator.group.DefaultGroup;
import com.wyl.common.validator.group.UpdateGroup;
import com.wyl.modules.patient.dto.PatientDTO;
import com.wyl.modules.patient.excel.PatientExcel;
import com.wyl.modules.patient.service.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;


/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@RestController
@RequestMapping("patient/patient")
@Api(tags="")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("patient:patient:page")
    public Result<PageData<PatientDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<PatientDTO> page = patientService.page(params);

        return new Result<PageData<PatientDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("patient:patient:info")
    public Result<PatientDTO> get(@PathVariable("id") Long id){
        PatientDTO data = patientService.get(id);

        return new Result<PatientDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("patient:patient:save")
    public Result save(@RequestBody PatientDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        patientService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("patient:patient:update")
    public Result update(@RequestBody PatientDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);
        double bmi = dto.getWeight() / (dto.getHeight() * dto.getHeight()/10000);
        String bmiStr = new DecimalFormat("#.00").format(bmi);
        dto.setBmi(bmiStr);
        patientService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("patient:patient:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        patientService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("patient:patient:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PatientDTO> list = patientService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, PatientExcel.class);
    }

}