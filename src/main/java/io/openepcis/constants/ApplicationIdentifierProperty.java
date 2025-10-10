package io.openepcis.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Enum that encapsulates mappings from GS1 Application Identifiers (AIs) and shortcodes
 * to the internal property names used by repositories/HQL queries.
 */
public enum ApplicationIdentifierProperty {

    SSCC("00", "sscc", "sscc"),
    GTIN("01", "gtin", "gtin"),
    GLN("414", "globalLocationNumber", "gln"),
    SERIAL("21", "hasSerialNumber", "ser"),
    LOT("10", "hasBatchLotNumber", "lot"),
    CPV("22", "consumerProductVariant", "cpv"),

    PRODUCTION_DATE("11", "productionDate", null),
    DUE_DATE("12", "dueDate", null),
    PACKAGING_DATE("13", "packagingDate", null),
    BEST_BEFORE_DATE("15", "bestBeforeDate", null),
    SELL_BY_DATE("16", "sellByDate", null),
    EXPIRATION_DATE("17", "expirationDate", "exp"),

    GDTI("253", "gdti", "gdti"),
    GLN_EXTENSION("254", "glnx", "glnx"),
    GCN("255", "gcn", "gcn"),
    GINC("401", "ginc", "ginc"),
    GSIN("402", "gsin", "gsin"),
    PAY_TO_GLN("415", "payto", "payto"),
    EXPIRY_DATE_TIME("7003", "expdt", "expdt"),
    GRAI("8003", "grai", "grai"),
    GIAI("8004", "giai", "giai"),
    ITIP("8006", "itip", "itip"),
    CPID("8010", "cpid", "cpid"),
    CPSN("8011", "cpsn", "cpsn"),
    GSRNP("8017", "gsrnp", "gsrnp"),
    GSRN("8018", "gsrn", "gsrn"),
    SRIN("8019", "srin", "srin");

    private final String ai;
    private final String propertyName;
    private final String shortcode;

    ApplicationIdentifierProperty(String ai, String propertyName, String shortcode) {
        this.ai = ai;
        this.propertyName = propertyName;
        this.shortcode = shortcode;
    }

    public String getAi() {
        return ai;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getShortcode() {
        return shortcode;
    }

    private static final Map<String, ApplicationIdentifierProperty> BY_AI;
    private static final Map<String, ApplicationIdentifierProperty> BY_SHORTCODE;

    static {
        Map<String, ApplicationIdentifierProperty> byAi = new HashMap<>();
        Map<String, ApplicationIdentifierProperty> bySc = new HashMap<>();
        for (ApplicationIdentifierProperty p : values()) {
            byAi.put(p.ai, p);
            if (p.shortcode != null) {
                bySc.put(p.shortcode, p);
            }
        }
        BY_AI = Collections.unmodifiableMap(byAi);
        BY_SHORTCODE = Collections.unmodifiableMap(bySc);
    }

    public static String getPropertyNameForAI(String ai) {
        ApplicationIdentifierProperty p = BY_AI.get(ai);
        return p != null ? p.propertyName : null;
    }

    public static String getPropertyNameForShortcode(String shortcode) {
        ApplicationIdentifierProperty p = BY_SHORTCODE.get(shortcode);
        return p != null ? p.propertyName : null;
    }
}
