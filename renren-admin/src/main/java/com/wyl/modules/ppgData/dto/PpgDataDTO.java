package com.wyl.modules.ppgData.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-30
 */
@Data
@ApiModel(value = "")
public class PpgDataDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "记录ID")
	private Integer dataid;

	@ApiModelProperty(value = "被采集者ID")
	private Integer patientid;

	@ApiModelProperty(value = "采集人ID")
	private Integer operatorid;

	@ApiModelProperty(value = "采集设备")
	private String collectingdevice;

	@ApiModelProperty(value = "设备采样率")
	private Integer samplerate;

	@ApiModelProperty(value = "采集 设备名称")
	private String devicemodel;

	@ApiModelProperty(value = "设备唯一标识码")
	private String devicesn;

	@ApiModelProperty(value = "操作系统版本")
	private String osversion;

	@ApiModelProperty(value = "")
	private Integer deviceid;

	@ApiModelProperty(value = "LED1(1050nm)原始数据：波形")
	private String led1050nm;

	@ApiModelProperty(value = "LED2(940nm) 原始数据：波形")
	private String led940nm;

	@ApiModelProperty(value = "LED3(650nm) 原始数据：波形")
	private String led650nm;

	@ApiModelProperty(value = "环境光原始数据：波形")
	private String environmentLight;

	@ApiModelProperty(value = "MTP10 电路板温度（单位：mV）")
	private String mtp10TemperatureSelf;

	@ApiModelProperty(value = "MTP10 指夹探头温度（单位：mV）")
	private String mtp10RadiationTemperature;

	@ApiModelProperty(value = "热敏电阻")
	private String ntcConductionThermal;

	@ApiModelProperty(value = "SHT30 电路板温度*100 后的值（单位：℃）")
	private String sht30EnvironmentTemperature;

	@ApiModelProperty(value = "SHT30 电路板湿度*100 后的值（单位：%RH）")
	private String sht30EnvironmentHumidity;

	@ApiModelProperty(value = "SHT30 指夹探头温度*100 后的值（单位：℃）")
	private String sht30FingerTemperature;

	@ApiModelProperty(value = "SHT30 指夹探头湿度*100 后的值（单位：%RH）")
	private String sht30FingerHumidity;

	@ApiModelProperty(value = "上次用餐时间")
	private Date lasteatingtime;

	@ApiModelProperty(value = "电池电压")
	private String batteryVoltage;

	@ApiModelProperty(value = "蓝牙采集设备设备号")
	private String bgdevicenumber;

	@ApiModelProperty(value = "采集结束时间")
	private Date testendtime;

	@ApiModelProperty(value = "上传时间")
	private Date uploadtime;

	@ApiModelProperty(value = "")
	private Date recordupdatetime;

	@ApiModelProperty(value = "0正常,1删除")
	private Integer recordisdeleted;

	@ApiModelProperty(value = "硬件版本号")
	private String bgdeviceversion;

	@ApiModelProperty(value = "修改人")
	private String reviser;

	@ApiModelProperty(value = "备注")
	private String note;

	@ApiModelProperty(value = "")
	private Integer sypressure;

	@ApiModelProperty(value = "")
	private Integer sypressure2;

	@ApiModelProperty(value = "")
	private Integer diapressure;

	@ApiModelProperty(value = "")
	private Integer diapressure2;

	@ApiModelProperty(value = "对比血糖")
	private String contrastbloodsugar;

	@ApiModelProperty(value = "进食状态 0:未知 1:餐前 2:餐后")
	private String eatingstatus;

	@ApiModelProperty(value = "真实血糖")
	private String truebs;

	@ApiModelProperty(value = "是否替换过标定(工作站用) 0 否 1 是")
	private Integer isreplace;

	@ApiModelProperty(value = "替换标定类型(工作站用)")
	private Integer replaceaitype;


}