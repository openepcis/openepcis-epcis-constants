package io.openepcis.constants;

public enum EPCISFormat {
  XML("xml"),
  JSON("json"),
  JSON_LD("ld+json"),
  APPLICATION_XML("application/xml"),
  APPLICATION_JSON("application/json"),
  APPLICATION_JSONLD("application/ld+json");

  private final String format;

  public String getFormat() {
    return this.format;
  }

  EPCISFormat(final String format) {
    this.format = format;
  }
}
