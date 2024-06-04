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

import java.util.Arrays;
import java.util.Optional;

public enum CBVVersion {
  // shall be in ascending order for min/max comparison
  VERSION_1_2_2("1.2.2"),
  VERSION_2_0_0("2.0.0"),
  VERSION_2_1_0("2.1.0");

  private final String version;

  /**
   * Method to return fully-qualified CBV Version used in http headers: GS1-CBV-Version,
   * GS1-CBV-Min, GS1-CBV-Max
   *
   * @return fully qualified version ex: 1.2.2, 2.0.0
   */
  public String getVersion() {
    return this.version;
  }

  CBVVersion(final String version) {
    this.version = version;
  }

  /**
   * Method to return respective CBV version based on provided string input version.
   *
   * @param s input version provided by user ex: 2.0.0, 1.2.2.
   * @return EPCISVersion returned based on the provided version string ex: VERSION_1_2_2 or
   *     VERSION_2_0_0.
   */
  public static Optional<CBVVersion> fromString(final String s) {
    for (CBVVersion v : values()) {
      if (v.version.equals(s)) {
        return Optional.of(v);
      }
    }
    return Optional.empty();
  }

  /**
   * Method to return respective CBV version based on provided string input version.
   * If none matches then returns the VERSION_2_0_0
   *
   * @param cbvVersionString input version provided by user ex: 2.0.0, 1.2.2.
   * @return EPCISVersion returned based on the provided version string ex: VERSION_1_2_2 or VERSION_2_0_0.
   */
   public static CBVVersion of(final String cbvVersionString){
     return Arrays.stream(values())
             .filter(v -> v.version.equals(cbvVersionString))
             .findFirst()
             .orElse(CBVVersion.VERSION_2_0_0);
   }
}
