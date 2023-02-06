package io.openepcis.constants;

import org.apache.commons.lang3.StringUtils;

public enum EPCISFormat {
  XML("xml"),
  JSON_LD("ld+json");

  private final String format;

  public String getFormat() {
    return this.format;
  }

  EPCISFormat(final String format) {
    this.format = format;
  }

  /**
   * Method to return respective EPCIS format based on provided input format.
   *
   * @param format input format provided by user ex: xml, json, application/ld+json,
   *     application/xml.
   * @return format returned based on the provided format ex: xml or ld+json.
   */
  public static String fromString(final String format) {
    final String convertedFormat = !StringUtils.isBlank(format) ? format.toLowerCase() : "";

    if (convertedFormat.contains("xml")) {
      return XML.getFormat();
    } else if (convertedFormat.contains("json")) {
      return JSON_LD.getFormat();
    } else {
      throw new IllegalArgumentException(
          "Provided format is invalid, please check and try again : " + format);
    }
  }

  /**
   * Method to return respective mediaType based on provided input format. The mediaType depicts the
   * EPCIS document's content-type.
   *
   * @param format input format provided by user ex: xml, json, ld+json etc.
   * @return output format returned based on the provided format ex: application/xml,
   *     application/ld+json.
   */
  public static String getMediaType(final String format) {
    final String convertedFormat = !StringUtils.isBlank(format) ? format.toLowerCase() : "";

    if (convertedFormat.contains("xml")) {
      return "application/xml";
    } else if (convertedFormat.contains("json")) {
      return "application/ld+json";
    } else {
      throw new IllegalArgumentException(
          "Provided content-type is invalid, please check and try again : " + format);
    }
  }
}
