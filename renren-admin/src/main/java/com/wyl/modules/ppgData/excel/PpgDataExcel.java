package com.wyl.modules.ppgData.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author wyl 84227396@qq.com
 * @since 1.0.0 2022-10-30
 */
@Data
public class PpgDataExcel {
    @Excel(name = "记录ID")
    private Integer dataid;
    @Excel(name = "被采集者ID")
    private Integer patientid;
    @Excel(name = "采集人ID")
    private Integer operatorid;
    @Excel(name = "采集设备")
    private String collectingdevice;
    @Excel(name = "设备采样率")
    private Integer samplerate;
    @Excel(name = "采集 设备名称")
    private String devicemodel;
    @Excel(name = "设备唯一标识码")
    private String devicesn;
    @Excel(name = "操作系统版本")
    private String osversion;
    @Excel(name = "")
    private Integer deviceid;
    @Excel(name = "LED1(1050nm)原始数据：波形")
    private String led1050nm;
    @Excel(name = "LED2(940nm) 原始数据：波形")
    private String led940nm;
    @Excel(name = "LED3(650nm) 原始数据：波形")
    private String led650nm;
    @Excel(name = "环境光原始数据：波形")
    private String environmentLight;
    @Excel(name = "MTP10 电路板温度（单位：mV）")
    private String mtp10TemperatureSelf;
    @Excel(name = "MTP10 指夹探头温度（单位：mV）")
    private String mtp10RadiationTemperature;
    @Excel(name = "热敏电阻")
    private String ntcConductionThermal;
    @Excel(name = "SHT30 电路板温度*100 后的值（单位：℃）")
    private String sht30EnvironmentTemperature;
    @Excel(name = "SHT30 电路板湿度*100 后的值（单位：%RH）")
    private String sht30EnvironmentHumidity;
    @Excel(name = "SHT30 指夹探头温度*100 后的值（单位：℃）")
    private String sht30FingerTemperature;
    @Excel(name = "SHT30 指夹探头湿度*100 后的值（单位：%RH）")
    private String sht30FingerHumidity;
    @Excel(name = "上次用餐时间")
    private Date lasteatingtime;
    @Excel(name = "电池电压")
    private String batteryVoltage;
    @Excel(name = "蓝牙采集设备设备号")
    private String bgdevicenumber;
    @Excel(name = "采集结束时间")
    private Date testendtime;
    @Excel(name = "上传时间")
    private Date uploadtime;
    @Excel(name = "")
    private Date recordupdatetime;
    @Excel(name = "0正常,1删除")
    private Integer recordisdeleted;
    @Excel(name = "硬件版本号")
    private String bgdeviceversion;
    @Excel(name = "修改人")
    private String reviser;
    @Excel(name = "备注")
    private String note;
    @Excel(name = "")
    private Integer sypressure;
    @Excel(name = "")
    private Integer sypressure2;
    @Excel(name = "")
    private Integer diapressure;
    @Excel(name = "")
    private Integer diapressure2;
    @Excel(name = "对比血糖")
    private String contrastbloodsugar;
    @Excel(name = "进食状态 0:未知 1:餐前 2:餐后")
    private String eatingstatus;
    @Excel(name = "真实血糖")
    private String truebs;
    @Excel(name = "是否替换过标定(工作站用) 0 否 1 是")
    private Integer isreplace;
    @Excel(name = "替换标定类型(工作站用)")
    private Integer replaceaitype;

}