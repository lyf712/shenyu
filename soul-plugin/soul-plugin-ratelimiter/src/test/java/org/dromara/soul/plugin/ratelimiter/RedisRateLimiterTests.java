/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.plugin.ratelimiter;

import org.dromara.soul.common.config.RateLimiterConfig;
import org.dromara.soul.common.dto.PluginData;
import org.dromara.soul.common.utils.GsonUtils;
import org.junit.Before;

/**
 * The type Redis rate limiter tests.
 *
 * @author xiaoyu
 */
public class RedisRateLimiterTests {
    
    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        PluginData pluginData = new PluginData();
        pluginData.setEnabled(true);
        RateLimiterConfig config = new RateLimiterConfig();
        config.setUrl("127.0.0.0:6379");
        pluginData.setConfig(GsonUtils.getInstance().toJson(config));
        RateLimiterPluginDataSubscriber subscriber = new RateLimiterPluginDataSubscriber();
        subscriber.initPlugin(pluginData);
    }
}
