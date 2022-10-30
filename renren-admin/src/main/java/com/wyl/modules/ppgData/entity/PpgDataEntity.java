package com.wyl.modules.ppgData.entity;

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
 * @since 1.0.0 2022-10-30
 */
@Data
@TableName("t_ppg_data")
public class PpgDataEntity {

    /**
     * 记录ID
     */
    @TableId( type = IdType.AUTO)
	private Integer dataid;
    /**
     * 被采集者ID
     */
	private Integer patientid;
    /**
     * 采集人ID
     */
	private Integer operatorid;
    /**
     * 采集设备
     */
	private String collectingdevice;
    /**
     * 设备采样率
     */
	private Integer samplerate;
    /**
     * 采集 设备名称
     */
	private String devicemodel;
    /**
     * 设备唯一标识码
     */
	private String devicesn;
    /**
     * 操作系统版本
     */
	private String osversion;
    /**
     * 
     */
	private Integer deviceid;
    /**
     * LED1(1050nm)原始数据：波形
     */
	private String led1050nm;
    /**
     * LED2(940nm) 原始数据：波形
     */
	private String led940nm;
    /**
     * LED3(650nm) 原始数据：波形
     */
	private String led650nm;
    /**
     * 环境光原始数据：波形
     */
	private String environmentLight;
    /**
     * MTP10 电路板温度（单位：mV）
     */
	private String mtp10TemperatureSelf;
    /**
     * MTP10 指夹探头温度（单位：mV）
     */
	private String mtp10RadiationTemperature;
    /**
     * 热敏电阻
     */
	private String ntcConductionThermal;
    /**
     * SHT30 电路板温度*100 后的值（单位：℃）
     */
	private String sht30EnvironmentTemperature;
    /**
     * SHT30 电路板湿度*100 后的值（单位：%RH）
     */
	private String sht30EnvironmentHumidity;
    /**
     * SHT30 指夹探头温度*100 后的值（单位：℃）
     */
	private String sht30FingerTemperature;
    /**
     * SHT30 指夹探头湿度*100 后的值（单位：%RH）
     */
	private String sht30FingerHumidity;
    /**
     * 上次用餐时间
     */
	private Date lasteatingtime;
    /**
     * 电池电压
     */
	private String batteryVoltage;
    /**
     * 蓝牙采集设备设备号
     */
	private String bgdevicenumber;
    /**
     * 采集结束时间
     */
	private Date testendtime;
    /**
     * 上传时间
     */
	private Date uploadtime;
    /**
     * 
     */
	private Date recordupdatetime;
    /**
     * 0正常,1删除
     */
    @TableLogic(value = "0", delval = "1")
	private Integer recordisdeleted;
    /**
     * 硬件版本号
     */
	private String bgdeviceversion;
    /**
     * 修改人
     */
	private String reviser;
    /**
     * 备注
     */
	private String note;
    /**
     * 
     */
	private Integer sypressure;
    /**
     * 
     */
	private Integer sypressure2;
    /**
     * 
     */
	private Integer diapressure;
    /**
     * 
     */
	private Integer diapressure2;
    /**
     * 对比血糖
     */
	private String contrastbloodsugar;
    /**
     * 进食状态 0:未知 1:餐前 2:餐后
     */
	private String eatingstatus;
    /**
     * 真实血糖
     */
	private String truebs;
    /**
     * 是否替换过标定(工作站用) 0 否 1 是
     */
	private Integer isreplace;
    /**
     * 替换标定类型(工作站用)
     */
	private Integer replaceaitype;
}