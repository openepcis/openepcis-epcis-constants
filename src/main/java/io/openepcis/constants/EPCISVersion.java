package io.openepcis.constants;

import org.apache.commons.lang3.StringUtils;

public enum EPCISVersion {
  VERSION_2_0("2.0.0"),
  VERSION_1_2("1.2.0");

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
  public static EPCISVersion fromString(final String version) {
    final String convertedVersion = !StringUtils.isBlank(version) ? version : "";

    if (convertedVersion.contains("2.0")) {
      return VERSION_2_0;
    } else if (version.contains("1.2")) {
      return VERSION_1_2;
    } else {
      throw new IllegalArgumentException(
          "Provided version is invalid, please check and try again : " + version);
    }
  }
}
