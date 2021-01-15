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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.UpdateDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataSourceResponseUnmarshaller {

	public static UpdateDataSourceResponse unmarshall(UpdateDataSourceResponse updateDataSourceResponse, UnmarshallerContext _ctx) {
		
		updateDataSourceResponse.setRequestId(_ctx.stringValue("UpdateDataSourceResponse.RequestId"));
		updateDataSourceResponse.setSuccess(_ctx.booleanValue("UpdateDataSourceResponse.Success"));
		updateDataSourceResponse.setCode(_ctx.stringValue("UpdateDataSourceResponse.Code"));
		updateDataSourceResponse.setMessage(_ctx.stringValue("UpdateDataSourceResponse.Message"));
	 
	 	return updateDataSourceResponse;
	}
}