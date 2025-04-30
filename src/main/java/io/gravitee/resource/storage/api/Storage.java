/*
 * Copyright © 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.resource.storage.api;

import io.gravitee.gateway.api.buffer.Buffer;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;

public interface Storage {
    /**
     * Write a buffer to the storage. Use the default location.
     * @param key The saved buffer path
     * @param buffer The buffer to save
     * @return {@link WriteResult}
     */
    Single<@NonNull WriteResult> write(String key, Buffer buffer);

    /**
     * Write a buffer to the storage. Use the specified location.
     * @param locationName The location name
     * @param key The saved buffer path
     * @param buffer The buffer to save
     * @return {@link WriteResult}
     */
    Single<@NonNull WriteResult> write(String locationName, String key, Buffer buffer);

    /**
     * Read a buffer from the storage. Use the default location.
     * @param key The saved buffer path
     * @return {@link ReadResult}
     */
    Single<@NonNull ReadResult> read(String key);

    /**
     * Read a buffer from the storage. Use the specified location.
     * @param locationName The location name
     * @param key The saved buffer path
     * @return {@link ReadResult}
     */
    Single<@NonNull ReadResult> read(String locationName, String key);
}
