package com.nus.tablecheckbackend.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Device {
    private int deviceId;
    private String deviceName;
    private String iotId;
    private String nickName;
    private Boolean isOnline;
    private Date onlineTime;
    private Date createTime;
    private String IP;
    private Long ruleId;

    public Device(){}

    public Device(String deviceName, String iotId, String nickName, Boolean isOnline, Date onlineTime,
                  Date createTime, String IP, Long ruleId) {
        this.deviceName = deviceName;
        this.iotId = iotId;
        this.nickName = nickName;
        this.isOnline = isOnline;
        this.onlineTime = onlineTime;
        this.createTime = createTime;
        this.IP = IP;
        this.ruleId = ruleId;
    }
}
