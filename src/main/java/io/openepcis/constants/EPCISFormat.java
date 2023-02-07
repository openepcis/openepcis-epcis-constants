package io.openepcis.constants;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

public enum EPCISFormat {
  XML("application/xml"),
  JSON_LD("application/ld+json");
  private final String mediaType;

  EPCISFormat(final String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Method to return respective EPCIS format based on provided input format.
   *
   * @param format input format provided by user ex: xml, json, application/ld+json,
   *     application/json, application/xml.
   * @return format returned based on the provided format ex: xml or ld+json.
   */
  public static Optional<EPCISFormat> fromString(final String format) {
    final String f = StringUtils.isEmpty(format) ? "" : format.toLowerCase();
    if (f.contains("xml")) {
      return Optional.of(XML);
    } else if (f.contains("json")) {
      return Optional.of(JSON_LD);
    }
    return Optional.empty();
  }

  /**
   * Method to return respective mediaType based on provided input format. The mediaType depicts the
   * EPCIS document's content-type.
   *
   * @return media type returned based on the provided format ex: application/xml,
   *     application/ld+json.
   */
  public String getMediaType() {
    return mediaType;
  }
}
