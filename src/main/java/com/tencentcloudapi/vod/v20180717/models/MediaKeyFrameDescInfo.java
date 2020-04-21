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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaKeyFrameDescInfo extends AbstractModel{

    /**
    * 视频打点信息数组。
    */
    @SerializedName("KeyFrameDescSet")
    @Expose
    private MediaKeyFrameDescItem [] KeyFrameDescSet;

    /**
     * Get 视频打点信息数组。 
     * @return KeyFrameDescSet 视频打点信息数组。
     */
    public MediaKeyFrameDescItem [] getKeyFrameDescSet() {
        return this.KeyFrameDescSet;
    }

    /**
     * Set 视频打点信息数组。
     * @param KeyFrameDescSet 视频打点信息数组。
     */
    public void setKeyFrameDescSet(MediaKeyFrameDescItem [] KeyFrameDescSet) {
        this.KeyFrameDescSet = KeyFrameDescSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "KeyFrameDescSet.", this.KeyFrameDescSet);

    }
}

