package io.openepcis.constants;

import java.util.Optional;

public enum EPCISVersion {
  VERSION_2_0_0("2.0.0"),
  VERSION_1_2_0("1.2.0");

  private final String version;

  public String getVersion() {
    return this.version;
  }

  EPCISVersion(final String version) {
    this.version = version;
  }

  /**
   * Method to return respective EPCIS version based on provided string input version.
   *
   * @param version input version provided by user ex: 2.0, 1.2, 2.0.0.
   * @return version returned based on the provided string version ex: 2.0.0 or 1.2.0.
   */
  public static Optional<EPCISVersion> fromString(final String version) {
    for (EPCISVersion v : values()) {
      if (v.version.equals(version)) {
        return Optional.of(v);
      }
    }
    return Optional.empty();
  }
}
