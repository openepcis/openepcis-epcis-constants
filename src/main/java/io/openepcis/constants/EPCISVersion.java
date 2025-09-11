/*
 * Copyright 2022-2024 benelog GmbH & Co. KG
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package io.openepcis.constants;

import java.util.Optional;

public enum EPCISVersion {
  // shall be in ascending order for min/max comparison
  VERSION_1_2_0("1.2.0", "1.2"),
  VERSION_2_0_0("2.0.0", "2.0");

  private final String version;

  private final String schemaVersion;

  /**
   * Method to return fully-qualified EPCIS Version used in http headers: GS1-EPCIS-Version,
   * GS1-EPCIS-Min, GS1-EPCIS-Max
   *
   * @return fully qualified version ex: 1.2.0, 2.0.0
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Method to return schemaVersion string commonly used in EPCIS documents example:
   * "schemaVersion": "2.0"
   *
   * @return compatible schemaVersion ex: 1.2, 2.0
   */
  public String getSchemaVersion() {
    return this.schemaVersion;
  }

  EPCISVersion(final String version, final String schemaVersion) {
    this.version = version;
    this.schemaVersion = schemaVersion;
  }

  /**
   * Method to return respective EPCIS version based on provided string input version.
   *
   * @param s input version provided by user ex: 2.0, 1.2, 2.0.0, 1.2.0.
   * @return EPCISVersion returned based on the provided version or schemaVersion string ex:
   *     VERSION_1_2_0 or VERSION_2_0_0.
   */
  public static Optional<EPCISVersion> fromString(final String s) {
    for (EPCISVersion v : values()) {
      if (v.version.equals(s) || v.schemaVersion.equals(s)) {
        return Optional.of(v);
      }
    }
    return Optional.empty();
  }

  /**
   * Method to get the default GS1 EPCIS context url
   *
   * @return returns the default GS1 EPCIS standard specification url
   */
  public static String getDefaultJSONContext() {
    return "https://ref.gs1.org/standards/epcis/epcis-context.jsonld";
  }
}
