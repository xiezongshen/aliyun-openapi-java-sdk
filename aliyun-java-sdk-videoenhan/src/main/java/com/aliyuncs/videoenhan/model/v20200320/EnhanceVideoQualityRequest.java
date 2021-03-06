/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videoenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnhanceVideoQualityRequest extends RpcAcsRequest<EnhanceVideoQualityResponse> {
	   

	private String hDRFormat;

	private Integer frameRate;

	private Integer maxIlluminance;

	private Integer bitrate;

	private Integer outPutWidth;

	private Integer outPutHeight;

	private String videoURL;
	public EnhanceVideoQualityRequest() {
		super("videoenhan", "2020-03-20", "EnhanceVideoQuality");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHDRFormat() {
		return this.hDRFormat;
	}

	public void setHDRFormat(String hDRFormat) {
		this.hDRFormat = hDRFormat;
		if(hDRFormat != null){
			putBodyParameter("HDRFormat", hDRFormat);
		}
	}

	public Integer getFrameRate() {
		return this.frameRate;
	}

	public void setFrameRate(Integer frameRate) {
		this.frameRate = frameRate;
		if(frameRate != null){
			putBodyParameter("FrameRate", frameRate.toString());
		}
	}

	public Integer getMaxIlluminance() {
		return this.maxIlluminance;
	}

	public void setMaxIlluminance(Integer maxIlluminance) {
		this.maxIlluminance = maxIlluminance;
		if(maxIlluminance != null){
			putBodyParameter("MaxIlluminance", maxIlluminance.toString());
		}
	}

	public Integer getBitrate() {
		return this.bitrate;
	}

	public void setBitrate(Integer bitrate) {
		this.bitrate = bitrate;
		if(bitrate != null){
			putBodyParameter("Bitrate", bitrate.toString());
		}
	}

	public Integer getOutPutWidth() {
		return this.outPutWidth;
	}

	public void setOutPutWidth(Integer outPutWidth) {
		this.outPutWidth = outPutWidth;
		if(outPutWidth != null){
			putBodyParameter("OutPutWidth", outPutWidth.toString());
		}
	}

	public Integer getOutPutHeight() {
		return this.outPutHeight;
	}

	public void setOutPutHeight(Integer outPutHeight) {
		this.outPutHeight = outPutHeight;
		if(outPutHeight != null){
			putBodyParameter("OutPutHeight", outPutHeight.toString());
		}
	}

	public String getVideoURL() {
		return this.videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
		if(videoURL != null){
			putBodyParameter("VideoURL", videoURL);
		}
	}

	@Override
	public Class<EnhanceVideoQualityResponse> getResponseClass() {
		return EnhanceVideoQualityResponse.class;
	}

}
