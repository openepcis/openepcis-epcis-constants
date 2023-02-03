package io.openepcis.constants;

import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EPCIS {

  // GS1 domain information
  public static final String GS1_IDENTIFIER_DOMAIN = "https://id.gs1.org";
  public static final String GS1_CBV_DOMAIN = "https://ref.gs1.org/cbv/";
  public static final String GS1_VOC_DOMAIN = "https://gs1.org/voc/";

  // Basic event info
  public static final String TYPE = "type";
  public static final String EVENT_TYPE = "eventType";
  public static final String OBJECT_EVENT = "ObjectEvent";
  public static final String AGGREGATION_EVENT = "AggregationEvent";
  public static final String TRANSACTION_EVENT = "TransactionEvent";
  public static final String TRANSFORMATION_EVENT = "TransformationEvent";
  public static final String ASSOCIATION_EVENT = "AssociationEvent";

  // WHAT dimension info
  public static final String PARENT_ID = "parentID";
  public static final String EPC_LIST = "epcList";
  public static final String CHILD_EPCS = "childEPCs";
  public static final String INPUT_EPC_LIST = "inputEPCList";
  public static final String OUTPUT_EPC_LIST = "outputEPCList";
  public static final String QUANTITY_LIST = "quantityList";
  public static final String CHILD_QUANTITY_LIST = "childQuantityList";
  public static final String INPUT_QUANTITY_LIST = "inputQuantityList";
  public static final String OUTPUT_QUANTITY_LIST = "outputQuantityList";
  public static final String EPC = "epc";
  public static final String QUANTITY_ELEMENT = "quantityElement";
  public static final String EPC_CLASS = "epcClass";
  public static final String QUANTITY = "quantity";
  public static final String UOM = "uom";

  // WHEN dimension info
  public static final String EVENT_TIME = "eventTime";
  public static final String RECORD_TIME = "recordTime";
  public static final String EVENT_TIME_ZONE_OFFSET = "eventTimeZoneOffset";

  // WHERE dimension info
  public static final String READ_POINT = "readPoint";
  public static final String BIZ_LOCATION = "bizLocation";
  public static final String ID = "id";

  // WHY dimension info
  public static final String BIZ_STEP = "bizStep";
  public static final String DISPOSITION = "disposition";
  public static final String BIZ_TRANSACTION_LIST = "bizTransactionList";
  public static final String BIZ_TRANSACTION = "bizTransaction";
  public static final String SOURCE_LIST = "sourceList";
  public static final String SOURCE = "source";
  public static final String DESTINATION_LIST = "destinationList";
  public static final String DESTINATION = "destination";
  public static final String PERSISTENT_DISPOSITION = "persistentDisposition";
  public static final String SET = "set";
  public static final String UNSET = "unset";
  public static final String ILMD = "ilmd";
  public static final String EXTENSION = "extension";
  public static final String BASE_EXTENSION = "baseExtension";

  // How dimension info
  public static final String SENSOR_ELEMENT_LIST = "sensorElementList";
  public static final String SENSOR_ELEMENT = "sensorElement";
  public static final String SENSOR_METADATA = "sensorMetadata";
  public static final String SENSOR_REPORT = "sensorReport";

  // Sensor Metadata info
  public static final String TIME = "time";
  public static final String START_TIME = "startTime";
  public static final String END_TIME = "endTime";
  public static final String DEVICE_ID = "deviceID";
  public static final String DEVICE_META_DATA = "deviceMetadata";
  public static final String RAW_DATA = "rawData";
  public static final String DATA_PROCESSING_METHOD = "dataProcessingMethod";
  public static final String BIZ_RULES = "bizRules";

  // Sensor Report info
  public static final String EXCEPTION = "exception";
  public static final String MICROORGANISM = "microorganism";
  public static final String CHEMICAL_SUBSTANCE = "chemicalSubstance";
  public static final String VALUE = "value";
  public static final String COMPONENT = "component";
  public static final String STRING_VALUE = "stringValue";
  public static final String BOOLEAN_VALUE = "booleanValue";
  public static final String HEX_BINARY_VALUE = "hexBinaryValue";
  public static final String URI_VALUE = "uriValue";
  public static final String MIN_VALUE = "minValue";
  public static final String MAX_VALUE = "maxValue";
  public static final String MEAN_VALUE = "meanValue";
  public static final String S_DEV = "sDev";
  public static final String PERC_RANK = "percRank";
  public static final String PERC_VALUE = "percValue";
  public static final String COORDINATE_REFERENCE_SYSTEM = "coordinateReferenceSystem";

  // Error declaration info
  public static final String ERROR_DECLARATION = "errorDeclaration";
  public static final String DECLARATION_TIME = "declarationTime";
  public static final String REASON = "reason";
  public static final String CORRECTIVE_EVENT_IDS = "correctiveEventIDs";
  public static final String CORRECTIVE_EVENT_ID = "correctiveEventID";

  // Other basic info
  public static final String EVENT_ID = "eventID";
  public static final String CERTIFICATION_INFO = "certificationInfo";
  public static final String ACTION = "action";
  public static final String TRANSFORMATION_ID = "transformationID";

  // Other GS1 specific info
  public static final String URN = "urn";
  public static final String WEBURI = "WebURI";
  public static final String PATH_DELIMITER = "/";
  public static final String SCHEMA_VERSION_1_2 = "1.2";
  public static final String SCHEMA_VERSION_2_0 = "2.0";
  public static final String CAPTURE = "capture";
  public static final String QUERY = "query";
  public static final String EPCIS_QUERY_DOCUMENT = "EPCISQueryDocument";

  // GS1 specific info
  public static final String CONTEXT = "@context";
  public static final String GS1_PREFIX = "gs1:";
  public static final String CBV_MDA = "cbvmda";
  public static final String CBV_MDA_URN = "urn:epcglobal:cbv:mda";
  public static final String EPCIS_DOCUMENT = "EPCISDocument";
  public static final String EPCIS_DOCUMENT_WITH_NAMESPACE = "epcis:EPCISDocument";
  public static final String EPCIS_BODY = "EPCISBody";
  public static final String EVENTS_LIST = "EventList";
  public static final String EPCIS_LOCALNAME = "epcis:";
  public static final String EPCIS_1_2_XMLNS = "urn:epcglobal:epcis:xsd:1";
  public static final String EPCIS_2_0_XMLNS = "urn:epcglobal:epcis:xsd:2";

  // GS1 URN vocabulary prefix
  public static final String DEFAULT_IDENTIFIER_PREFIX = "urn:epc:";
  public static final String INSTANCE_IDENTIFIER_URN_PREFIX = DEFAULT_IDENTIFIER_PREFIX + "id:";
  public static final String CLASS_IDENTIFIER_URN_PREFIX_WITH_CLASS =
      DEFAULT_IDENTIFIER_PREFIX + "class:";
  public static final String CLASS_IDENTIFIER_URN_PREFIX_WITH_IDPAT =
      DEFAULT_IDENTIFIER_PREFIX + "idpat:";
  public static final String PARTY_GLN_IDENTIFIER_URN_PREFIX =
      DEFAULT_IDENTIFIER_PREFIX + "id:pgln:";
  public static final String SERIALIZED_GLN_IDENTIFIER_URN_PREFIX =
      DEFAULT_IDENTIFIER_PREFIX + "id:sgln:";

  public static final String DEFAULT_URN_PREFIX = "urn:epcglobal:cbv:";
  public static final String BIZ_STEP_URN_PREFIX = DEFAULT_URN_PREFIX + "bizstep:";
  public static final String DISPOSITION_URN_PREFIX = DEFAULT_URN_PREFIX + "disp:";
  public static final String BIZ_TRANSACTION_URN_PREFIX = DEFAULT_URN_PREFIX + "btt:";
  public static final String SOURCE_DESTINATION_URN_PREFIX = DEFAULT_URN_PREFIX + "sdt:";
  public static final String ERROR_REASON_URN_PREFIX = DEFAULT_URN_PREFIX + "er:";

  // GS1 Curie vocabulary prefix
  public static final String DEFAULT_CURIE_PREFIX = "cbv:";
  private static final String BIZ_STEP_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "BizStep-";
  private static final String DISPOSITION_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "Disp-";
  private static final String BIZ_TRANSACTION_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "BTT-";
  private static final String SRC_DEST_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "SDT-";
  private static final String ERR_REASON_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "ER-";

  // GS1 WebURI/DigitalLink vocabulary prefix
  private static final String BIZ_STEP_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + "BizStep-";
  private static final String DISPOSITION_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + "Disp-";
  private static final String BIZ_TRANSACTION_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + "BTT-";
  private static final String SRC_DEST_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + "SDT-";
  private static final String ERR_REASON_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + "ER-";

  private static final String BIZ_STEP_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + "BizStep-";
  private static final String DISPOSITION_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + "Disp-";
  private static final String BIZ_TRANSACTION_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + "BTT-";
  private static final String SRC_DEST_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + "SDT-";
  private static final String ERR_REASON_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + "ER-";

  // EPCIS related items list
  public static final List<String> EPCIS_EVENT_TYPES =
      List.of(
          OBJECT_EVENT,
          AGGREGATION_EVENT,
          TRANSACTION_EVENT,
          TRANSFORMATION_EVENT,
          ASSOCIATION_EVENT);
}
