/**
 * Copyright BCIA. All Rights Reserved.
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

package org.bcia.julongchain.common.tools.cryptogen.bean;

/**
 * hostname 配置数据类
 *
 * @author chenhao, liuxifeng
 * @date 2018/4/4
 * @company Excelsecu
 */
public class HostNameData {

    private String prefix;

    private int index;

    private String domain;

    public String getPrefix() {
        return prefix;
    }


    public HostNameData(String prefix, int index, String domain) {
        this.prefix = prefix;
        this.index = index;
        this.domain = domain;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
