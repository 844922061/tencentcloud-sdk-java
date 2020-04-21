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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subnet extends AbstractModel{

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID，例如：subnet-bthucmmy。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网的 IPv4 CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否默认子网。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 是否开启广播。
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private Boolean EnableBroadcast;

    /**
    * 路由表实例ID，例如：rtb-l2h8d7c2。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 可用IP数。
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
    * 子网的 IPv6 CIDR。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 关联ACLID
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 是否为 SNAT 地址池子网。
    */
    @SerializedName("IsRemoteVpcSnat")
    @Expose
    private Boolean IsRemoteVpcSnat;

    /**
    * 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID，例如：subnet-bthucmmy。 
     * @return SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID，例如：subnet-bthucmmy。
     * @param SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称。 
     * @return SubnetName 子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称。
     * @param SubnetName 子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网的 IPv4 CIDR。 
     * @return CidrBlock 子网的 IPv4 CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网的 IPv4 CIDR。
     * @param CidrBlock 子网的 IPv4 CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否默认子网。 
     * @return IsDefault 是否默认子网。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认子网。
     * @param IsDefault 是否默认子网。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否开启广播。 
     * @return EnableBroadcast 是否开启广播。
     */
    public Boolean getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * Set 是否开启广播。
     * @param EnableBroadcast 是否开启广播。
     */
    public void setEnableBroadcast(Boolean EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * Get 路由表实例ID，例如：rtb-l2h8d7c2。 
     * @return RouteTableId 路由表实例ID，例如：rtb-l2h8d7c2。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-l2h8d7c2。
     * @param RouteTableId 路由表实例ID，例如：rtb-l2h8d7c2。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 可用IP数。 
     * @return AvailableIpAddressCount 可用IP数。
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set 可用IP数。
     * @param AvailableIpAddressCount 可用IP数。
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * Get 子网的 IPv6 CIDR。 
     * @return Ipv6CidrBlock 子网的 IPv6 CIDR。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set 子网的 IPv6 CIDR。
     * @param Ipv6CidrBlock 子网的 IPv6 CIDR。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get 关联ACLID 
     * @return NetworkAclId 关联ACLID
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set 关联ACLID
     * @param NetworkAclId 关联ACLID
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get 是否为 SNAT 地址池子网。 
     * @return IsRemoteVpcSnat 是否为 SNAT 地址池子网。
     */
    public Boolean getIsRemoteVpcSnat() {
        return this.IsRemoteVpcSnat;
    }

    /**
     * Set 是否为 SNAT 地址池子网。
     * @param IsRemoteVpcSnat 是否为 SNAT 地址池子网。
     */
    public void setIsRemoteVpcSnat(Boolean IsRemoteVpcSnat) {
        this.IsRemoteVpcSnat = IsRemoteVpcSnat;
    }

    /**
     * Get 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "IsRemoteVpcSnat", this.IsRemoteVpcSnat);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

