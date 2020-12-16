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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusTemplateModify extends AbstractModel{

    /**
    * 修改名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 修改描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertRules")
    @Expose
    private PrometheusAlertRule [] AlertRules;

    /**
    * 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordRules")
    @Expose
    private PrometheusConfigItem [] RecordRules;

    /**
    * 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertDetailRules")
    @Expose
    private PrometheusAlertRuleDetail [] AlertDetailRules;

    /**
     * Get 修改名称 
     * @return Name 修改名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改名称
     * @param Name 修改名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 修改描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 修改描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 修改描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 修改描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertRules 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertRule [] getAlertRules() {
        return this.AlertRules;
    }

    /**
     * Set 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertRules 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertRules(PrometheusAlertRule [] AlertRules) {
        this.AlertRules = AlertRules;
    }

    /**
     * Get 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordRules 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getRecordRules() {
        return this.RecordRules;
    }

    /**
     * Set 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordRules 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordRules(PrometheusConfigItem [] RecordRules) {
        this.RecordRules = RecordRules;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceMonitors 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceMonitors 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodMonitors 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodMonitors 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawJobs 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawJobs 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertDetailRules 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertRuleDetail [] getAlertDetailRules() {
        return this.AlertDetailRules;
    }

    /**
     * Set 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertDetailRules 修改内容，只有当模板类型是Alert时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertDetailRules(PrometheusAlertRuleDetail [] AlertDetailRules) {
        this.AlertDetailRules = AlertDetailRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "AlertRules.", this.AlertRules);
        this.setParamArrayObj(map, prefix + "RecordRules.", this.RecordRules);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamArrayObj(map, prefix + "AlertDetailRules.", this.AlertDetailRules);

    }
}

