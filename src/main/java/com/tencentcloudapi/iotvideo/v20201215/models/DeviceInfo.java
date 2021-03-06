/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备是否在线，0不在线，1在线，2获取失败，3未激活
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 设备最后上线时间
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * 设备密钥
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * 设备启用状态
    */
    @SerializedName("EnableState")
    @Expose
    private Long EnableState;

    /**
    * 设备过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备是否在线，0不在线，1在线，2获取失败，3未激活 
     * @return Online 设备是否在线，0不在线，1在线，2获取失败，3未激活
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 设备是否在线，0不在线，1在线，2获取失败，3未激活
     * @param Online 设备是否在线，0不在线，1在线，2获取失败，3未激活
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 设备最后上线时间 
     * @return LoginTime 设备最后上线时间
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 设备最后上线时间
     * @param LoginTime 设备最后上线时间
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get 设备密钥 
     * @return DevicePsk 设备密钥
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set 设备密钥
     * @param DevicePsk 设备密钥
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get 设备启用状态 
     * @return EnableState 设备启用状态
     */
    public Long getEnableState() {
        return this.EnableState;
    }

    /**
     * Set 设备启用状态
     * @param EnableState 设备启用状态
     */
    public void setEnableState(Long EnableState) {
        this.EnableState = EnableState;
    }

    /**
     * Get 设备过期时间 
     * @return ExpireTime 设备过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 设备过期时间
     * @param ExpireTime 设备过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamSimple(map, prefix + "EnableState", this.EnableState);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

