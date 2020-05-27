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

package org.dromara.soul.springboot.starter.plugin.monitor;

import org.dromara.soul.plugin.api.SoulPlugin;
import org.dromara.soul.plugin.monitor.MonitorPlugin;
import org.dromara.soul.plugin.monitor.MonitorPluginDataSubscriber;
import org.dromara.soul.sync.data.api.PluginDataSubscriber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Monitor plugin configuration.
 *
 * @author xiaoyu
 */
@Configuration
public class MonitorPluginConfiguration {
    
    /**
     * Monitor plugin .
     *
     * @return the soul plugin
     */
    @Bean
    public SoulPlugin monitorPlugin() {
        return new MonitorPlugin();
    }
    
    /**
     * Data subscriber plugin data subscriber.
     *
     * @return the plugin data subscriber
     */
    @Bean
    public PluginDataSubscriber dataSubscriber() {
        return new MonitorPluginDataSubscriber();
    }
}
