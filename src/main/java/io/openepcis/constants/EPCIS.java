/*
 * Copyright 2022-2024 benelog GmbH & Co. KG
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package io.openepcis.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EPCIS {

  // GS1 domain information
  public static final String GS1_IDENTIFIER_DOMAIN = "https://id.gs1.org";
  public static final String GS1_CBV_DOMAIN = "https://ref.gs1.org/cbv/";
  public static final String GS1_VOC_DOMAIN = "https://gs1.org/voc/";
  public static final String GS1_EPCIS_DOMAIN = "https://ref.gs1.org/epcis/";
  public static final String DC_TERMS_DOMAIN = "http://purl.org/dc/terms/";

  // Basic event info
  public static final String AT_ID = "@id";
  public static final String TYPE = "type";
  public static final String EVENT_TYPE = "eventType";
  public static final String OBJECT_EVENT = "ObjectEvent";
  public static final String AGGREGATION_EVENT = "AggregationEvent";
  public static final String TRANSACTION_EVENT = "TransactionEvent";
  public static final String TRANSFORMATION_EVENT = "TransformationEvent";
  public static final String ASSOCIATION_EVENT = "AssociationEvent";
  public static final List<String> EPCIS_EVENT_TYPES =
      List.of(
          OBJECT_EVENT,
          AGGREGATION_EVENT,
          TRANSACTION_EVENT,
          TRANSFORMATION_EVENT,
          ASSOCIATION_EVENT);

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
  public static final String ILMD = "ilmd";

  // Other GS1 specific info
  public static final String URN = "urn";
  public static final String WEBURI = "WebURI";
  public static final String PATH_DELIMITER = "/";
  public static final String SCHEMA_LOCATION = "schemaLocation";
  public static final String SCHEMA_VERSION_1_2 = "1.2";
  public static final String SCHEMA_VERSION_2_0 = "2.0";
  public static final String CAPTURE = "capture";
  public static final String QUERY = "query";

  // EPCISQueryDocument info
  public static final String EPCIS_QUERY_LOCALNAME = "epcisq:";
  public static final String EPCIS_QUERY_DOCUMENT = "EPCISQueryDocument";
  public static final String EPCIS_QUERY_DOCUMENT_WITH_NAMESPACE =
      EPCIS_QUERY_LOCALNAME + "EPCISQueryDocument";
  public static final String QUERY_RESULTS = "QueryResults";
  public static final String QUERY_RESULTS_IN_CAMEL_CASE = "queryResults";
  public static final String RESULTS_BODY = "ResultsBody";
  public static final String RESULTS_BODY_IN_CAMEL_CASE = "resultsBody";
  public static final String SUBSCRIPTION_ID = "subscriptionID";
  public static final String QUERY_NAME = "queryName";

  // GS1 specific info
  public static final String CONTEXT = "@context";
  public static final String EPCIS_DOCUMENT = "EPCISDocument";
  public static final String DOCUMENT = "document";

  public static final String EPCIS_LOCALNAME = "epcis:";
  public static final String EPCIS_DOCUMENT_WITH_NAMESPACE = EPCIS_LOCALNAME + "EPCISDocument";
  public static final String EPCIS_BODY = "EPCISBody";
  public static final String EPCIS_BODY_IN_CAMEL_CASE = "epcisBody";
  public static final String EVENT_LIST = "EventList";
  public static final String EVENT_LIST_IN_CAMEL_CASE = "eventList";
  public static final String GS1 = "gs1";

  public static final String DCTERMS = "dcterms";
  public static final String GS1_PREFIX = "gs1:";
  public static final String EPCIS = "epcis";
  public static final String EPCIS_QUERY = "epcisq";
  public static final String CBV = "cbv";
  public static final String CBV_MDA = "cbvmda";
  public static final String CBV_MDA_URN = "urn:epcglobal:cbv:mda";
  public static final String EPCIS_1_2_XMLNS = "urn:epcglobal:epcis:xsd:1";
  public static final String EPCIS_2_0_XMLNS = "urn:epcglobal:epcis:xsd:2";

  public static final String EPCIS_QUERY_1_2_XMLNS = "urn:epcglobal:epcis-query:xsd:1";
  public static final String EPCIS_QUERY_2_0_XMLNS = "urn:epcglobal:epcis-query:xsd:2";
  public static final String SCHEMA_VERSION = "schemaVersion";
  public static final String CREATION_DATE = "creationDate";
  public static final String XSI = "xsi";
  public static final String XML_SCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
  public static final String STANDARD_BUSINESS_DOCUMENT_HEADER_PREFIX = "sbdh";
  public static final String STANDARD_BUSINESS_DOCUMENT_HEADER =
      "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader";
  public static final String EXCEPTION_MESSAGE = "\nException : ";
  public static final List<String> EPCIS_HEADER_ELEMENTS =
          List.of(
                  EPCIS_DOCUMENT,
                  EPCIS_QUERY_DOCUMENT,
                  EPCIS_BODY,
                  RESULTS_BODY,
                  RESULTS_BODY_IN_CAMEL_CASE,
                  QUERY_RESULTS,
                  EVENT_LIST);
  public static final List<String> PROTECTED_TERMS_OF_CONTEXT =
          List.of(
                  EPCIS,
                  CBV,
                  "vtype",
                  CBV_MDA,
                  "xsd",
                  DCTERMS,
                  GS1,
                  XSI,
                  SCHEMA_LOCATION,
                  EPCIS_QUERY,
                  STANDARD_BUSINESS_DOCUMENT_HEADER_PREFIX);

  public static final List<String> REQUIRED_DOCUMENT_FIELDS =
      List.of(CONTEXT, TYPE, SCHEMA_VERSION, CREATION_DATE);

  // GS1 URN vocabulary prefix
  public static final String DEFAULT_IDENTIFIER_URN_PREFIX = "urn:epc:";
  public static final String INSTANCE_IDENTIFIER_URN_PREFIX = DEFAULT_IDENTIFIER_URN_PREFIX + "id:";
  public static final String CLASS_IDENTIFIER_URN_PREFIX_WITH_CLASS =
      DEFAULT_IDENTIFIER_URN_PREFIX + "class:";
  public static final String CLASS_IDENTIFIER_URN_PREFIX_WITH_IDPAT =
      DEFAULT_IDENTIFIER_URN_PREFIX + "idpat:";
  public static final String PARTY_GLN_IDENTIFIER_URN_PREFIX =
      DEFAULT_IDENTIFIER_URN_PREFIX + "id:pgln:";
  public static final String SERIALIZED_GLN_IDENTIFIER_URN_PREFIX =
      DEFAULT_IDENTIFIER_URN_PREFIX + "id:sgln:";

  public static final String BIZ_STEP_WEBURI_PREFIX = "BizStep-";
  public static final String DISP_WEBURI_PREFIX = "Disp-";
  public static final String BIZ_TRANSACTION_WEBURI_PREFIX = "BTT-";
  public static final String SRC_DEST_WEBURI_PREFIX = "SDT-";
  public static final String ERROR_REASON_WEBURI_PREFIX = "ER-";

  public static final String DEFAULT_VOCABULARY_URN_PREFIX = "urn:epcglobal:cbv:";
  public static final String BIZ_STEP_URN_PREFIX = DEFAULT_VOCABULARY_URN_PREFIX + "bizstep:";
  public static final String DISPOSITION_URN_PREFIX = DEFAULT_VOCABULARY_URN_PREFIX + "disp:";
  public static final String BIZ_TRANSACTION_URN_PREFIX = DEFAULT_VOCABULARY_URN_PREFIX + "btt:";
  public static final String SRC_DEST_URN_PREFIX = DEFAULT_VOCABULARY_URN_PREFIX + "sdt:";
  public static final String ERROR_REASON_URN_PREFIX = DEFAULT_VOCABULARY_URN_PREFIX + "er:";

  // GS1 Curie vocabulary prefix
  public static final String DEFAULT_CURIE_PREFIX = "cbv:";
  public static final String BIZ_STEP_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + BIZ_STEP_WEBURI_PREFIX;
  public static final String DISPOSITION_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + DISP_WEBURI_PREFIX;
  public static final String BIZ_TRANSACTION_CURIE_PREFIX =
      DEFAULT_CURIE_PREFIX + BIZ_TRANSACTION_WEBURI_PREFIX;
  public static final String SRC_DEST_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "SDT-";
  public static final String ERR_REASON_CURIE_PREFIX = DEFAULT_CURIE_PREFIX + "ER-";

  // GS1 WebURI/DigitalLink vocabulary prefix
  public static final String BIZ_STEP_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + BIZ_STEP_WEBURI_PREFIX;
  public static final String DISPOSITION_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + DISP_WEBURI_PREFIX;
  public static final String BIZ_TRANSACTION_WEBURI_CBV_PREFIX =
      GS1_CBV_DOMAIN + BIZ_TRANSACTION_WEBURI_PREFIX;
  public static final String SRC_DEST_WEBURI_CBV_PREFIX = GS1_CBV_DOMAIN + SRC_DEST_WEBURI_PREFIX;
  public static final String ERR_REASON_WEBURI_CBV_PREFIX =
      GS1_CBV_DOMAIN + ERROR_REASON_WEBURI_PREFIX;

  public static final String BIZ_STEP_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + BIZ_STEP_WEBURI_PREFIX;
  public static final String DISPOSITION_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + DISP_WEBURI_PREFIX;
  public static final String BIZ_TRANSACTION_WEBURI_VOC_PREFIX =
      GS1_VOC_DOMAIN + BIZ_TRANSACTION_WEBURI_PREFIX;
  public static final String SRC_DEST_WEBURI_VOC_PREFIX = GS1_VOC_DOMAIN + SRC_DEST_WEBURI_PREFIX;
  public static final String ERR_REASON_WEBURI_VOC_PREFIX =
      GS1_VOC_DOMAIN + ERROR_REASON_WEBURI_PREFIX;

  // Start of elements and their order in 1.2 XML document
  public static final List<String> ALL_EPCIS_ELEMENTS_1_2 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          PARENT_ID,
          EPC_LIST,
          CHILD_EPCS,
          INPUT_EPC_LIST,
          INPUT_QUANTITY_LIST,
          OUTPUT_EPC_LIST,
          OUTPUT_QUANTITY_LIST,
          TRANSFORMATION_ID,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          QUANTITY_LIST,
          CHILD_QUANTITY_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          ILMD,
          SENSOR_ELEMENT_LIST,
          PERSISTENT_DISPOSITION,
          CERTIFICATION_INFO);

  public static final List<String> EPCIS_EVENT_TYPE =
      List.of(EVENT_TIME, RECORD_TIME, EVENT_TIME_ZONE_OFFSET);
  public static final List<String> BASE_EXTENSION_ELEMENTS = List.of(EVENT_ID, ERROR_DECLARATION);
  public static final List<String> OBJECT_EVENT_TYPE_1_2 =
      List.of(
          EPC_LIST, ACTION, BIZ_STEP, DISPOSITION, READ_POINT, BIZ_LOCATION, BIZ_TRANSACTION_LIST);
  public static final List<String> AGGREGATION_ASSOCIATION_EVENT_TYPE_1_2 =
      List.of(
          PARENT_ID,
          CHILD_EPCS,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST);

  public static final List<String> TRANSACTION_EVENT_TYPE_1_2 =
      List.of(
          BIZ_TRANSACTION_LIST,
          PARENT_ID,
          EPC_LIST,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION);
  public static final List<String> TRANSFORMATION_EVENT_TYPE_1_2 =
      List.of(
          INPUT_EPC_LIST,
          INPUT_QUANTITY_LIST,
          OUTPUT_EPC_LIST,
          OUTPUT_QUANTITY_LIST,
          TRANSFORMATION_ID,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          ILMD);

  public static final List<String> EXTENSION_ELEMENTS_1_2 =
      List.of(QUANTITY_LIST, CHILD_QUANTITY_LIST, SOURCE_LIST, DESTINATION_LIST, ILMD);
  public static final List<String> INNER_EXTENSION_ELEMENTS_1_2 =
      List.of(SENSOR_ELEMENT_LIST, PERSISTENT_DISPOSITION, CERTIFICATION_INFO);
  // End of elements and their order in 1.2 XML document

  // Start of elements and their order in 2.0 XML/JSON/JSON-LD document
  public static final List<String> OMIT_EXTENSION_ELEMENTS_2_0 = List.of(EXTENSION, BASE_EXTENSION);

  public static final List<String> ALL_EPCIS_ELEMENTS_2_0 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          CERTIFICATION_INFO,
          PARENT_ID,
          EPC_LIST,
          CHILD_EPCS,
          INPUT_EPC_LIST,
          INPUT_QUANTITY_LIST,
          OUTPUT_EPC_LIST,
          OUTPUT_QUANTITY_LIST,
          TRANSFORMATION_ID,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          QUANTITY_LIST,
          CHILD_QUANTITY_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          SENSOR_ELEMENT_LIST,
          PERSISTENT_DISPOSITION,
          ILMD);

  public static final List<String> OBJECT_EVENT_TYPE_2_0 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          CERTIFICATION_INFO,
          EPC_LIST,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          QUANTITY_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          SENSOR_ELEMENT_LIST,
          PERSISTENT_DISPOSITION,
          ILMD);

  public static final List<String> AGGREGATION_ASSOCIATION_EVENT_TYPE_2_0 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          CERTIFICATION_INFO,
          PARENT_ID,
          CHILD_EPCS,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          CHILD_QUANTITY_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          SENSOR_ELEMENT_LIST,
          PERSISTENT_DISPOSITION);

  public static final List<String> TRANSACTION_EVENT_TYPE_2_0 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          CERTIFICATION_INFO,
          BIZ_TRANSACTION_LIST,
          PARENT_ID,
          EPC_LIST,
          ACTION,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          QUANTITY_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          SENSOR_ELEMENT_LIST);

  public static final List<String> TRANSFORMATION_EVENT_2_0 =
      List.of(
          EVENT_TIME,
          RECORD_TIME,
          EVENT_TIME_ZONE_OFFSET,
          EVENT_ID,
          ERROR_DECLARATION,
          CERTIFICATION_INFO,
          INPUT_EPC_LIST,
          INPUT_QUANTITY_LIST,
          OUTPUT_EPC_LIST,
          OUTPUT_QUANTITY_LIST,
          TRANSFORMATION_ID,
          BIZ_STEP,
          DISPOSITION,
          READ_POINT,
          BIZ_LOCATION,
          BIZ_TRANSACTION_LIST,
          SOURCE_LIST,
          DESTINATION_LIST,
          SENSOR_ELEMENT_LIST,
          PERSISTENT_DISPOSITION,
          ILMD);

  // End of elements and their order in 2.0 XML/JSON/JSON-LD document

  //Default Namespaces related to EPCIS
  public static final Map<String, Object> EPCIS_DEFAULT_NAMESPACES = Map.of(
          EPCIS, EPCIS_2_0_XMLNS,
          EPCIS_QUERY, EPCIS_QUERY_2_0_XMLNS,
          STANDARD_BUSINESS_DOCUMENT_HEADER_PREFIX, STANDARD_BUSINESS_DOCUMENT_HEADER,
          CBV_MDA, CBV_MDA_URN,
          GS1, GS1_VOC_DOMAIN,
          DCTERMS, DC_TERMS_DOMAIN,
          CBV, GS1_CBV_DOMAIN
  );

  public static final List<String> PROTECTED_NAMESPACE_OF_CONTEXT =
          List.of(
                  DEFAULT_VOCABULARY_URN_PREFIX,
                  CBV_MDA_URN,
                  GS1_EPCIS_DOMAIN,
                  GS1_CBV_DOMAIN,
                  GS1_VOC_DOMAIN,
                  DC_TERMS_DOMAIN
          );

}
