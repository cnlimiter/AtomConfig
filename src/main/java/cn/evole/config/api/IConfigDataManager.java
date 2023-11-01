/*
 *    Copyright 2019 Zotov Ivan [Xezard]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package cn.evole.config.api;

import cn.evole.config.data.types.AbstractConfigData;

import java.lang.reflect.Field;
import java.util.Optional;

public interface IConfigDataManager {
    Optional<AbstractConfigData<?>> getType(Class<?> clazz);

    Optional<AbstractConfigData<?>> getType(Field field);

    void register(AbstractConfigData<?> configurationData);

    void remove(AbstractConfigData<?> configurationData);
}