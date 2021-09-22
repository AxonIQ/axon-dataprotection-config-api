# Axon Data Protection Config API

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