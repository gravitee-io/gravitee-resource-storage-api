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
import io.gravitee.resource.storage.api.exception.StorageException;

public record ReadResult(Buffer content, StorageException storageException) {
    public static ReadResult createSuccess(Buffer content) {
        return new ReadResult(content, null);
    }

    public static ReadResult createError(StorageException storageException) {
        return new ReadResult(null, storageException);
    }

    public boolean isSuccess() {
        return storageException == null;
    }
}
