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

import com.aliyuncs.hbr.model.v20170908.ExecuteJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteJobResponseUnmarshaller {

	public static ExecuteJobResponse unmarshall(ExecuteJobResponse executeJobResponse, UnmarshallerContext _ctx) {
		
		executeJobResponse.setRequestId(_ctx.stringValue("ExecuteJobResponse.RequestId"));
		executeJobResponse.setSuccess(_ctx.booleanValue("ExecuteJobResponse.Success"));
		executeJobResponse.setCode(_ctx.stringValue("ExecuteJobResponse.Code"));
		executeJobResponse.setMessage(_ctx.stringValue("ExecuteJobResponse.Message"));
	 
	 	return executeJobResponse;
	}
}