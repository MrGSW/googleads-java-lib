/**
 * ActivityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public class ActivityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActivityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAGE_VIEWS = "PAGE_VIEWS";
    public static final java.lang.String _DAILY_VISITS = "DAILY_VISITS";
    public static final java.lang.String _CUSTOM = "CUSTOM";
    public static final java.lang.String _ITEMS_PURCHASED = "ITEMS_PURCHASED";
    public static final java.lang.String _TRANSACTIONS = "TRANSACTIONS";
    public static final java.lang.String _IOS_APPLICATION_DOWNLOADS = "IOS_APPLICATION_DOWNLOADS";
    public static final java.lang.String _ANDROID_APPLICATION_DOWNLOADS = "ANDROID_APPLICATION_DOWNLOADS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ActivityType PAGE_VIEWS = new ActivityType(_PAGE_VIEWS);
    public static final ActivityType DAILY_VISITS = new ActivityType(_DAILY_VISITS);
    public static final ActivityType CUSTOM = new ActivityType(_CUSTOM);
    public static final ActivityType ITEMS_PURCHASED = new ActivityType(_ITEMS_PURCHASED);
    public static final ActivityType TRANSACTIONS = new ActivityType(_TRANSACTIONS);
    public static final ActivityType IOS_APPLICATION_DOWNLOADS = new ActivityType(_IOS_APPLICATION_DOWNLOADS);
    public static final ActivityType ANDROID_APPLICATION_DOWNLOADS = new ActivityType(_ANDROID_APPLICATION_DOWNLOADS);
    public static final ActivityType UNKNOWN = new ActivityType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ActivityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActivityType enumeration = (ActivityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActivityType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "Activity.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}