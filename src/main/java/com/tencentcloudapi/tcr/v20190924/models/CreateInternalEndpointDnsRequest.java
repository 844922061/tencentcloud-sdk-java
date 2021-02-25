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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInternalEndpointDnsRequest extends AbstractModel{

    /**
    * tcr实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * tcr内网访问链路ip
    */
    @SerializedName("EniLBIp")
    @Expose
    private String EniLBIp;

    /**
    * true：use instance name as subdomain
false: use instancename+"-vpc" as subdomain
    */
    @SerializedName("UsePublicDomain")
    @Expose
    private Boolean UsePublicDomain;

    /**
     * Get tcr实例id 
     * @return InstanceId tcr实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tcr实例id
     * @param InstanceId tcr实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get tcr内网访问链路ip 
     * @return EniLBIp tcr内网访问链路ip
     */
    public String getEniLBIp() {
        return this.EniLBIp;
    }

    /**
     * Set tcr内网访问链路ip
     * @param EniLBIp tcr内网访问链路ip
     */
    public void setEniLBIp(String EniLBIp) {
        this.EniLBIp = EniLBIp;
    }

    /**
     * Get true：use instance name as subdomain
false: use instancename+"-vpc" as subdomain 
     * @return UsePublicDomain true：use instance name as subdomain
false: use instancename+"-vpc" as subdomain
     */
    public Boolean getUsePublicDomain() {
        return this.UsePublicDomain;
    }

    /**
     * Set true：use instance name as subdomain
false: use instancename+"-vpc" as subdomain
     * @param UsePublicDomain true：use instance name as subdomain
false: use instancename+"-vpc" as subdomain
     */
    public void setUsePublicDomain(Boolean UsePublicDomain) {
        this.UsePublicDomain = UsePublicDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EniLBIp", this.EniLBIp);
        this.setParamSimple(map, prefix + "UsePublicDomain", this.UsePublicDomain);

    }
}

