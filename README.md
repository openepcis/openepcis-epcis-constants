<p align="center">
  <img src="https://openepcis.io/img/openepcis-logo.svg" alt="OpenEPCIS" width="30%">
</p>

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](LICENSE)
[![Release](https://img.shields.io/github/v/release/openepcis/openepcis-epcis-constants)](https://github.com/openepcis/openepcis-epcis-constants/releases)
[![Stars](https://img.shields.io/github/stars/openepcis/openepcis-epcis-constants?style=social)](https://github.com/openepcis/openepcis-epcis-constants)

<h1 align="center">OpenEPCIS EPCIS Constants</h1>

EPCIS event attribute names, version strings and identifier prefixes from the [GS1 EPCIS](https://www.gs1.org/standards/epcis)
and [CBV](https://ref.gs1.org/standards/cbv/) standards, collected in one Java library.

## Why

Field names like `bizStep` and `eventTimeZoneOffset` are often used as plain text in many codebases. If they are misspelled, the code may still compile but fail at runtime.
This library keeps them in one place, so every OpenEPCIS project refers to the same value and the compiler catches typos.

## Installation

```xml

<dependency>
    <groupId>io.openepcis</groupId>
    <artifactId>openepcis-epcis-constants</artifactId>
    <version>${openepcis-epcis-constants.version}</version>
</dependency>
```

## What is inside

| Class                            | Holds                                                                   |
|----------------------------------|-------------------------------------------------------------------------|
| `EPCIS`                          | EPCIS field names and document keywords, plus URN and Web URI prefixes  |
| `ApplicationIdentifierConstants` | GS1 Application Identifier prefixes for SGTIN, SSCC, CPI and the rest   |
| `EPCISVersion`                   | EPCIS 1.1 to 2.1, with the full version and the shorter `schemaVersion` |
| `CBVVersion`                     | CBV 1.2.2 to 2.1.0                                                      |
| `EPCISFormat`                    | `XML` and `JSON_LD`, each with its media type                           |
| `EPCISDocumentType`              | `CAPTURE` and `QUERY`                                                   |

## Usage

Field names, instead of typing the string yourself:

```java
import io.openepcis.constants.EPCIS;

String bizStep = EPCIS.BIZ_STEP;                          // "bizStep"
String eventTime = EPCIS.EVENT_TIME;                      // "eventTime"
String urnPrefix = EPCIS.INSTANCE_IDENTIFIER_URN_PREFIX;  // "urn:epc:id:"
```

A version knows both forms it appears in, the one used in HTTP headers and the shorter one used inside
the document:

```java
import io.openepcis.constants.EPCISVersion;

String headerValue = EPCISVersion.VERSION_2_0_0.getVersion();        // "2.0.0"
String schemaVersion = EPCISVersion.VERSION_2_0_0.getSchemaVersion();  // "2.0"
```

Reading a version or a format off an incoming request. Both return an `Optional`, so an unknown value
is something you handle rather than an exception you catch:

```java
import io.openepcis.constants.EPCISFormat;
import io.openepcis.constants.EPCISVersion;

Optional<EPCISVersion> version = EPCISVersion.fromString(epcisVersionHeader);
Optional<EPCISFormat> format = EPCISFormat.fromString(contentType);

String mediaType = EPCISFormat.JSON_LD.getMediaType();  // "application/ld+json"
```

## Building

Java 21 and Maven. The parent POM is the external OpenEPCIS BOM, so the first build downloads it.

```bash
mvn clean install
```

## Contributing

Are we missing a constant? Open an issue or a pull request. Keep the name close to the term used in the GS1
standard, so it stays easy to find.

## Related

- [OpenEPCIS Tools](https://tools.openepcis.io/) - open source EPCIS 2.0 tools and services
- [OpenEPCIS](https://openepcis.io/) - Read more about OpenEPCIS
- [OpenEPCIS Test Resources](https://github.com/openepcis/openepcis-test-resources) - EPCIS documents used for testing
- [benelog GmbH & Co. KG](https://www.benelog.com/) - Company behind the OpenEPCIS
- [GS1 EPCIS Standard](https://www.gs1.org/standards/epcis) - Learn more about EPCIS

## License

Licensed under the [Apache License 2.0](LICENSE).
