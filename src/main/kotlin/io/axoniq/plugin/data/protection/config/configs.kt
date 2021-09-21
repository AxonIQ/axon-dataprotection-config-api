/*
 * Copyright (c) 2021. AxonIQ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.axoniq.plugin.data.protection.config

/**
 * Simple alias to indicate a given String is a Json Path.
 */
typealias Path = String

/**
 * List container for [DataProtectionConfig].
 */
data class DataProtectionConfigList(val config: List<DataProtectionConfig> = listOf())

/**
 * Represents the config as an input.
 */
data class DataProtectionConfig(
    val type: String,
    val revision: String,
    val subjectId: SubjectIdConfig,
    val sensitiveData: List<SensitiveDataConfig>
) {
    constructor(type: String, revision: String, subjectId: SubjectIdConfig, sensitiveData: SensitiveDataConfig) : this(
        type,
        revision,
        subjectId,
        listOf(sensitiveData)
    )
}

/**
 * Represents each Sensitive Data configuration with its path and replacement value.
 */
data class SensitiveDataConfig(
    val path: Path,
    val replacementValue: String?
)

/**
 * Represents the Subject ID, which usually is the key for Sensitive Data fields.
 */
data class SubjectIdConfig(
    val path: Path,
)
