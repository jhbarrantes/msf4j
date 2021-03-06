/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
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
package org.wso2.msf4j.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.transport.http.netty.contract.PortBindingEventListener;


/**
 * An implementation of the LifeCycleEventListener. This can be used to listen to the HTTP connector life cycle events.
 *
 * @since 2.5.0
 */
public class HttpConnectorPortBindingListener implements PortBindingEventListener {

    private static final Logger log = LoggerFactory.getLogger(HttpConnectorPortBindingListener.class);

    @Override
    public void onOpen(String serverConnectorId, boolean isHttps) {
        // Nothing to do when opening the connector port
    }

    @Override
    public void onClose(String serverConnectorId, boolean isHttps) {
        // Nothing to do when closing the connector port
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("Error in http server connector", throwable);
    }
}
