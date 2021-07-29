package io.axoniq.plugin.data.protection.config

typealias Path = String

data class DataProtectionConfigList(val config: List<DataProtectionConfig> = listOf())

data class DataProtectionConfig(
    val type: String,
    val revision: String,
    val subjectId: SubjectIdConfig,
    val sensitiveData: List<SensitiveDataConfig>
)

data class SensitiveDataConfig(
    val path: Path,
    val replacementValue: String
)

data class SubjectIdConfig(
    val path: Path,
)
