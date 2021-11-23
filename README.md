# Axon Data Protection Config API

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.axoniq/axon-dataprotection-config-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.axoniq/axon-dataprotection-config-api)
[![Release](https://img.shields.io/github/release/AxonIQ/axon-dataprotection-config-api.svg?style=flat-square)](https://github.com/AxonIQ/axon-dataprotection-config-api/releases/latest)
![Build Status](https://github.com/AxonIQ/axon-dataprotection-config-api/workflows/Axon%20Data%20Protection%20Config%20API/badge.svg?branch=master)

This small project only serves as a shared library for Configuration classes and Annotations needed for Data Protection Projects in general.

---

It contains only 2 files, one for Annotations and another for Configs. The most important one for external users are the Annotations as that is what you would add to your Events.

### Annotations:
- `SensitiveDataHolder`
  - Annotation to mark a class/event that contains any Sensitive Data field on it
- `SensitiveData`
  - Annotation to mark a field that is a Sensitive Data. Default is an empty string.
- `SubjectId`
  - Annotation to mark a field that is the Subject ID for a given `SensitiveDataHolder`

### Configs:
- `DataProtectionConfigList`
- `DataProtectionConfig`
- `SensitiveDataConfig`
- `SubjectIdConfig`

---
Created with :heart: by [AxonIQ](https://axoniq.io/)