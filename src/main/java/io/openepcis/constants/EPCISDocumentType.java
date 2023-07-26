package io.openepcis.constants;

public enum EPCISDocumentType {
  CAPTURE(EPCIS.CAPTURE),
  QUERY(EPCIS.QUERY);

  private final String type;

  public String getType() {
    return this.type;
  }

  /**
   * return EPCISDocumentType from String, defaults to CAPTURE
   * @param s EPCISDocumentType as String
   * @return matching EPCISDocumentType
   */
  public static EPCISDocumentType fromString(String s) {
    for (EPCISDocumentType t : EPCISDocumentType.values()) {
      if (t.getType().equalsIgnoreCase(s)) {
        return t;
      }
    }
    return CAPTURE;
  }

  EPCISDocumentType(final String type) {
    this.type = type;
  }
}
