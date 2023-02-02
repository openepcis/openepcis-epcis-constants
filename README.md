[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


<div align="justify">

# openepcis-epcis-constants

The goal of this project is to create a centralized database of commonly used constants and strings in EPCIS events. Through the provision of these constants, other OpenEPCIS applications will 
have the ability to avoid the duplication of definitions.


## Introduction

OpenEPCIS has developed a central repository for standard EPCIS terms and GS1 related keywords to eliminate the repetitiveness and difficulty in managing constant information across various projects. By having this information in a single project file, any OpenEPCIS project can easily reference it, making it more manageable and easier to modify.

## Usage

The constant information within the `EPCIS` class is directly accessible to users if they are using . For example, if users require the EPCIS standard keyword `bizStep` within their project then they 
can make use of 
the following variable:

```Java
EPCIS.BIZ_STEP
```

Similarly, if user requires the identifiers prefix in URN format:

```Java
EPCIS.INSTANCE_IDENTIFIER_URN_PREFIX
```

</div>