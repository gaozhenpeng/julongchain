/**
 * Copyright DingXuan. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bcia.julongchain.core.deliverservice.blocksprovider;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * 块提供者接口
 *
 * @author zhangmingyang
 * @Date: 2018/5/31
 * @company Dingxuan
 */
public interface IBlocksProvider {
    void deliverBlocks() throws InvalidProtocolBufferException;

    void updateOrderingEndpoints(String[] endpoints);

    void stop();
}
