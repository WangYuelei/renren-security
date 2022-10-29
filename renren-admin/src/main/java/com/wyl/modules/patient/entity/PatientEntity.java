package com.wyl.modules.patient.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@Data
@TableName("t_patient")
public class PatientEntity {

    /**
     * 
     */
    @TableId( type = IdType.AUTO)
	private Integer patientid;
    /**
     * 姓名
     */
	private String patientname;
    /**
     * 年龄
     */
	private Integer age;
    /**
     * 性别
     */
	private Integer sex;
    /**
     * 生日
     */
	private Date birthday;
    /**
     * 身高
     */
	private Double height;
    /**
     * 体重
     */
	private Double weight;
    /**
     * bmi
     */
	private String bmi;
    /**
     * 采集者id
     */
	private Integer operatorid;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 是否删除
     */
    @TableLogic(value = "0", delval = "1")
	private Integer recordisdeleted;
    /**
     * 更新时间
     */
	private Date recordupdatetime;
    /**
     * 修最后一次改者
     */
	private String reviser;
}