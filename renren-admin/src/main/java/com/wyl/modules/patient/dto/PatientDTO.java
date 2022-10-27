package com.wyl.modules.patient.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-26
 */
@Data
@ApiModel(value = "")
public class PatientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Integer patientid;

	@ApiModelProperty(value = "姓名")
	private String patientname;

	@ApiModelProperty(value = "年龄")
	private Integer age;

	@ApiModelProperty(value = "性别")
	private Integer sex;

	@ApiModelProperty(value = "生日")
	private Date birthday;

	@ApiModelProperty(value = "身高")
	private Double height;

	@ApiModelProperty(value = "体重")
	private Double weight;

	@ApiModelProperty(value = "bmi")
	private String bmi;

	@ApiModelProperty(value = "采集者id")
	private Integer operatorid;

	@ApiModelProperty(value = "创建时间")
	private Date createtime;

	@ApiModelProperty(value = "是否删除")
	private Integer recordisdeleted;

	@ApiModelProperty(value = "更新时间")
	private Date recordupdatetime;

	@ApiModelProperty(value = "修最后一次改者")
	private String reviser;


}