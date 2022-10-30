package com.wyl.modules.ppgData.controller;

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
import com.wyl.modules.ppgData.dto.PpgDataDTO;
import com.wyl.modules.ppgData.excel.PpgDataExcel;
import com.wyl.modules.ppgData.service.PpgDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-30
 */
@RestController
@RequestMapping("ppgData/ppgdata")
@Api(tags="")
public class PpgDataController {
    @Autowired
    private PpgDataService ppgDataService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("ppgData:ppgdata:page")
    public Result<PageData<PpgDataDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<PpgDataDTO> page = ppgDataService.page(params);

        return new Result<PageData<PpgDataDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("ppgData:ppgdata:info")
    public Result<PpgDataDTO> get(@PathVariable("id") Long id){
        PpgDataDTO data = ppgDataService.get(id);

        return new Result<PpgDataDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("ppgData:ppgdata:save")
    public Result save(@RequestBody PpgDataDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        ppgDataService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("ppgData:ppgdata:update")
    public Result update(@RequestBody PpgDataDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        ppgDataService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("ppgData:ppgdata:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        ppgDataService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("ppgData:ppgdata:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PpgDataDTO> list = ppgDataService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, PpgDataExcel.class);
    }

}