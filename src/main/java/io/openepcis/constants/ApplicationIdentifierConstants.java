/*
 * Copyright (c) 2022-2025 benelog GmbH & Co. KG
 * All rights reserved.
 *
 * Unauthorized copying, modification, distribution,
 * or use of this work, via any medium, is strictly prohibited.
 *
 * benelog GmbH & Co. KG reserves all rights not expressly granted herein,
 * including the right to sell licenses for using this work.
 */
package io.openepcis.constants;

public class ApplicationIdentifierConstants {

    // === Common Constants ===
    public static final String CLASS_URN_PREFIX = "idpat";

    // === CPI (8010, 8011) ===
    public static final String CPI_AI_URI_PREFIX = "/8010/";
    public static final String CPI_AI_URI_SERIAL_PREFIX = "/8011/";
    public static final String CPI_AI_URN_PREFIX = ":cpi:";

    // === GCN (255) ===
    public static final String GCN_AI_URI_PREFIX = "/255/";
    public static final String GCN_AI_URN_PREFIX = ":sgcn:";

    // === GDTI (253) ===
    public static final String GDTI_AI_URI_PREFIX = "/253/";
    public static final String GDTI_AI_URN_PREFIX = ":gdti:";

    // === GIAI (8004) ===
    public static final String GIAI_AI_URI_PREFIX = "/8004/";
    public static final String GIAI_AI_URN_PREFIX = ":giai:";

    // === GINC (401) ===
    public static final String GINC_AI_URI_PREFIX = "/401/";
    public static final String GINC_AI_URN_PREFIX = ":ginc:";

    // === GRAI (8003) ===
    public static final String GRAI_AI_URI_PREFIX = "/8003/";
    public static final String GRAI_AI_URN_PREFIX = ":grai:";

    // === GSIN (402) ===
    public static final String GSIN_AI_URI_PREFIX = "/402/";
    public static final String GSIN_AI_URN_PREFIX = ":gsin:";

    // === GSRN (8018) ===
    public static final String GSRN_AI_URI_PREFIX = "/8018/";
    public static final String GSRN_AI_URN_PREFIX = ":gsrn:";

    // === GSRNP (8017) ===
    public static final String GSRNP_AI_URI_PREFIX = "/8017/";
    public static final String GSRNP_AI_URN_PREFIX = ":gsrnp:";

    // === ITIP (8006, 21) ===
    public static final String ITIP_AI_URI_PREFIX = "/8006/";
    public static final String ITIP_AI_URI_SERIAL_PREFIX = "/21/";
    public static final String ITIP_AI_URN_PREFIX = ":itip:";

    // === LGTIN (01, 10) ===
    public static final String LGTIN_AI_URI_PREFIX = "/01/";
    public static final String LGTIN_AI_BATCH_LOT_PREFIX = "/10/";
    public static final String LGTIN_AI_URN_PREFIX = ":lgtin:";

    // === PGLN (417) ===
    public static final String PGLN_AI_URI_PREFIX = "/417/";
    public static final String PGLN_AI_URN_PREFIX = ":pgln:";

    // === SGLN (414, 254) ===
    public static final String SGLN_AI_URI_PREFIX = "/414/";
    public static final String SGLN_AI_URI_SERIAL_PREFIX = "/254/";
    public static final String SGLN_AI_URN_PREFIX = ":sgln:";

    // === SGTIN (01, 21) ===
    public static final String SGTIN_AI_URI_PREFIX = "/01/";
    public static final String SGTIN_AI_URI_SERIAL_PREFIX = "/21/";
    public static final String SGTIN_AI_URN_PREFIX = ":sgtin:";

    // === SSCC (00) ===
    public static final String SSCC_AI_URI_PREFIX = "/00/";
    public static final String SSCC_AI_URN_PREFIX = ":sscc:";

    // === UPUI (01, 235) ===
    public static final String UPUI_AI_URI_PREFIX = "/01/";
    public static final String UPUI_AI_URI_SERIAL_PREFIX = "/235/";
    public static final String UPUI_AI_URN_PREFIX = ":upui:";

    // === Miscellaneous AIs ===
    public static final String EXPIRY_DATE_AI_PARAM = "17=";
    public static final String CPV_AI_URI_PREFIX = "/22/";
    public static final String NET_WEIGHT_AI_PARAM = "3103=";
    public static final String AMOUNT_PAYABLE_AI_PARAM = "3922=";
}
