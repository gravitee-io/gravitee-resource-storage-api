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

import io.gravitee.resource.storage.api.exception.StorageException;

public record WriteResult(String path, StorageException storageException) {
    public static WriteResult createSuccess(String path) {
        return new WriteResult(path, null);
    }

    public static WriteResult createError(StorageException storageException) {
        return new WriteResult(null, storageException);
    }

    public boolean isSuccess() {
        return storageException == null;
    }
}
