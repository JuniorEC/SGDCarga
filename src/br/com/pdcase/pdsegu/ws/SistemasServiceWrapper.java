/**
 * SistemasServiceWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class SistemasServiceWrapper  extends br.com.pdcase.pdsegu.ws.ServiceWrapper  implements java.io.Serializable {
    private br.com.pdcase.pdsegu.ws.SistemaBean[] sistemas;

    public SistemasServiceWrapper() {
    }

    public SistemasServiceWrapper(
           java.lang.String mensagem,
           java.lang.String resultado,
           br.com.pdcase.pdsegu.ws.SistemaBean[] sistemas) {
        super(
            mensagem,
            resultado);
        this.sistemas = sistemas;
    }


    /**
     * Gets the sistemas value for this SistemasServiceWrapper.
     * 
     * @return sistemas
     */
    public br.com.pdcase.pdsegu.ws.SistemaBean[] getSistemas() {
        return sistemas;
    }


    /**
     * Sets the sistemas value for this SistemasServiceWrapper.
     * 
     * @param sistemas
     */
    public void setSistemas(br.com.pdcase.pdsegu.ws.SistemaBean[] sistemas) {
        this.sistemas = sistemas;
    }

    public br.com.pdcase.pdsegu.ws.SistemaBean getSistemas(int i) {
        return this.sistemas[i];
    }

    public void setSistemas(int i, br.com.pdcase.pdsegu.ws.SistemaBean _value) {
        this.sistemas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SistemasServiceWrapper)) return false;
        SistemasServiceWrapper other = (SistemasServiceWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sistemas==null && other.getSistemas()==null) || 
             (this.sistemas!=null &&
              java.util.Arrays.equals(this.sistemas, other.getSistemas())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSistemas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSistemas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSistemas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SistemasServiceWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "sistemasServiceWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "sistemaBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
