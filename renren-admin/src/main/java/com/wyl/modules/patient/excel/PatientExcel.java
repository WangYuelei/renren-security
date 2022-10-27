package com.wyl.modules.patient.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@Data
public class PatientExcel {
    @Excel(name = "")
    private Integer patientid;
    @Excel(name = "姓名")
    private String patientname;
    @Excel(name = "年龄")
    private Integer age;
    @Excel(name = "性别")
    private Integer sex;
    @Excel(name = "生日")
    private Date birthday;
    @Excel(name = "身高")
    private Double height;
    @Excel(name = "体重")
    private Double weight;
    @Excel(name = "bmi")
    private String bmi;
    @Excel(name = "采集者id")
    private Integer operatorid;
    @Excel(name = "创建时间")
    private Date createtime;
    @Excel(name = "是否删除")
    private Integer recordisdeleted;
    @Excel(name = "更新时间")
    private Date recordupdatetime;
    @Excel(name = "修最后一次改者")
    private String reviser;

}