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

package com.aliyuncs.quickbi_public.model.v20200805;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchColumnRowLevelControlRequest extends RpcAcsRequest<SwitchColumnRowLevelControlResponse> {
	   

	private String columnIds;

	private String datasetId;

	private Boolean open;
	public SwitchColumnRowLevelControlRequest() {
		super("quickbi-public", "2020-08-05", "SwitchColumnRowLevelControl", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getColumnIds() {
		return this.columnIds;
	}

	public void setColumnIds(String columnIds) {
		this.columnIds = columnIds;
		if(columnIds != null){
			putQueryParameter("ColumnIds", columnIds);
		}
	}

	public String getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(String datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putQueryParameter("DatasetId", datasetId);
		}
	}

	public Boolean getOpen() {
		return this.open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
		if(open != null){
			putQueryParameter("Open", open.toString());
		}
	}

	@Override
	public Class<SwitchColumnRowLevelControlResponse> getResponseClass() {
		return SwitchColumnRowLevelControlResponse.class;
	}

}
