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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRangeDeviceRequest extends RpcAcsRequest<ListRangeDeviceResponse> {
	   

	private String corpId;

	private Long pageNumber;

	private String dataSourceId;

	private Long pageSize;

	private Integer radius;
	public ListRangeDeviceRequest() {
		super("CDRS", "2020-11-01", "ListRangeDevice");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getRadius() {
		return this.radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
		if(radius != null){
			putBodyParameter("Radius", radius.toString());
		}
	}

	@Override
	public Class<ListRangeDeviceResponse> getResponseClass() {
		return ListRangeDeviceResponse.class;
	}

}
