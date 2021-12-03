/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.newrelic.nrjmx.v2.nrprotocol;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-12-02")
public class JMXError extends org.apache.thrift.TException implements org.apache.thrift.TBase<JMXError, JMXError._Fields>, java.io.Serializable, Cloneable, Comparable<JMXError> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JMXError");

  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CAUSE_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("causeMessage", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STACKTRACE_FIELD_DESC = new org.apache.thrift.protocol.TField("stacktrace", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JMXErrorStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JMXErrorTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String message; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String causeMessage; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String stacktrace; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE((short)1, "message"),
    CAUSE_MESSAGE((short)2, "causeMessage"),
    STACKTRACE((short)3, "stacktrace");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MESSAGE
          return MESSAGE;
        case 2: // CAUSE_MESSAGE
          return CAUSE_MESSAGE;
        case 3: // STACKTRACE
          return STACKTRACE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CAUSE_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("causeMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STACKTRACE, new org.apache.thrift.meta_data.FieldMetaData("stacktrace", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JMXError.class, metaDataMap);
  }

  public JMXError() {
  }

  public JMXError(
    java.lang.String message,
    java.lang.String causeMessage,
    java.lang.String stacktrace)
  {
    this();
    this.message = message;
    this.causeMessage = causeMessage;
    this.stacktrace = stacktrace;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JMXError(JMXError other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetCauseMessage()) {
      this.causeMessage = other.causeMessage;
    }
    if (other.isSetStacktrace()) {
      this.stacktrace = other.stacktrace;
    }
  }

  public JMXError deepCopy() {
    return new JMXError(this);
  }

  @Override
  public void clear() {
    this.message = null;
    this.causeMessage = null;
    this.stacktrace = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessage() {
    return this.message;
  }

  public JMXError setMessage(@org.apache.thrift.annotation.Nullable java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCauseMessage() {
    return this.causeMessage;
  }

  public JMXError setCauseMessage(@org.apache.thrift.annotation.Nullable java.lang.String causeMessage) {
    this.causeMessage = causeMessage;
    return this;
  }

  public void unsetCauseMessage() {
    this.causeMessage = null;
  }

  /** Returns true if field causeMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetCauseMessage() {
    return this.causeMessage != null;
  }

  public void setCauseMessageIsSet(boolean value) {
    if (!value) {
      this.causeMessage = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStacktrace() {
    return this.stacktrace;
  }

  public JMXError setStacktrace(@org.apache.thrift.annotation.Nullable java.lang.String stacktrace) {
    this.stacktrace = stacktrace;
    return this;
  }

  public void unsetStacktrace() {
    this.stacktrace = null;
  }

  /** Returns true if field stacktrace is set (has been assigned a value) and false otherwise */
  public boolean isSetStacktrace() {
    return this.stacktrace != null;
  }

  public void setStacktraceIsSet(boolean value) {
    if (!value) {
      this.stacktrace = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case CAUSE_MESSAGE:
      if (value == null) {
        unsetCauseMessage();
      } else {
        setCauseMessage((java.lang.String)value);
      }
      break;

    case STACKTRACE:
      if (value == null) {
        unsetStacktrace();
      } else {
        setStacktrace((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE:
      return getMessage();

    case CAUSE_MESSAGE:
      return getCauseMessage();

    case STACKTRACE:
      return getStacktrace();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE:
      return isSetMessage();
    case CAUSE_MESSAGE:
      return isSetCauseMessage();
    case STACKTRACE:
      return isSetStacktrace();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof JMXError)
      return this.equals((JMXError)that);
    return false;
  }

  public boolean equals(JMXError that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_causeMessage = true && this.isSetCauseMessage();
    boolean that_present_causeMessage = true && that.isSetCauseMessage();
    if (this_present_causeMessage || that_present_causeMessage) {
      if (!(this_present_causeMessage && that_present_causeMessage))
        return false;
      if (!this.causeMessage.equals(that.causeMessage))
        return false;
    }

    boolean this_present_stacktrace = true && this.isSetStacktrace();
    boolean that_present_stacktrace = true && that.isSetStacktrace();
    if (this_present_stacktrace || that_present_stacktrace) {
      if (!(this_present_stacktrace && that_present_stacktrace))
        return false;
      if (!this.stacktrace.equals(that.stacktrace))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetCauseMessage()) ? 131071 : 524287);
    if (isSetCauseMessage())
      hashCode = hashCode * 8191 + causeMessage.hashCode();

    hashCode = hashCode * 8191 + ((isSetStacktrace()) ? 131071 : 524287);
    if (isSetStacktrace())
      hashCode = hashCode * 8191 + stacktrace.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JMXError other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCauseMessage()).compareTo(other.isSetCauseMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCauseMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.causeMessage, other.causeMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStacktrace()).compareTo(other.isSetStacktrace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStacktrace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stacktrace, other.stacktrace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JMXError(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("causeMessage:");
    if (this.causeMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.causeMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stacktrace:");
    if (this.stacktrace == null) {
      sb.append("null");
    } else {
      sb.append(this.stacktrace);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JMXErrorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JMXErrorStandardScheme getScheme() {
      return new JMXErrorStandardScheme();
    }
  }

  private static class JMXErrorStandardScheme extends org.apache.thrift.scheme.StandardScheme<JMXError> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JMXError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CAUSE_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.causeMessage = iprot.readString();
              struct.setCauseMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STACKTRACE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stacktrace = iprot.readString();
              struct.setStacktraceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JMXError struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.causeMessage != null) {
        oprot.writeFieldBegin(CAUSE_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.causeMessage);
        oprot.writeFieldEnd();
      }
      if (struct.stacktrace != null) {
        oprot.writeFieldBegin(STACKTRACE_FIELD_DESC);
        oprot.writeString(struct.stacktrace);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JMXErrorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JMXErrorTupleScheme getScheme() {
      return new JMXErrorTupleScheme();
    }
  }

  private static class JMXErrorTupleScheme extends org.apache.thrift.scheme.TupleScheme<JMXError> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JMXError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMessage()) {
        optionals.set(0);
      }
      if (struct.isSetCauseMessage()) {
        optionals.set(1);
      }
      if (struct.isSetStacktrace()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetCauseMessage()) {
        oprot.writeString(struct.causeMessage);
      }
      if (struct.isSetStacktrace()) {
        oprot.writeString(struct.stacktrace);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JMXError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.causeMessage = iprot.readString();
        struct.setCauseMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stacktrace = iprot.readString();
        struct.setStacktraceIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

