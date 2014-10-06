/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.dataset.events;

import org.dashbuilder.dataset.DataSetMetadata;
import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class DataSetModifiedEvent {

    String dataSetUUID;

    public DataSetModifiedEvent() {
    }

    public DataSetModifiedEvent(String dataSetUUID) {
        this.dataSetUUID = dataSetUUID;
    }

    public String getDataSetUUID() {
        return dataSetUUID;
    }

    public void setDataSetUUID(String dataSetUUID) {
        this.dataSetUUID = dataSetUUID;
    }
}
