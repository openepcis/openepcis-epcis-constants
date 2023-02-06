package io.openepcis.constants;

public enum EPCISVersion {
  VERSION_2_0("2.0"),
  VERSION_1_2("1.2");

  private final String version;

  public String getVersion() {
    return this.version;
  }

  EPCISVersion(final String version) {
    this.version = version;
  }
}
