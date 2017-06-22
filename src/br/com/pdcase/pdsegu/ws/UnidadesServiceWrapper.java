/**
 * UnidadesServiceWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class UnidadesServiceWrapper  extends br.com.pdcase.pdsegu.ws.ServiceWrapper  implements java.io.Serializable {
    private br.com.pdcase.pdsegu.ws.Unidade[] unidades;

    public UnidadesServiceWrapper() {
    }

    public UnidadesServiceWrapper(
           java.lang.String mensagem,
           java.lang.String resultado,
           br.com.pdcase.pdsegu.ws.Unidade[] unidades) {
        super(
            mensagem,
            resultado);
        this.unidades = unidades;
    }


    /**
     * Gets the unidades value for this UnidadesServiceWrapper.
     * 
     * @return unidades
     */
    public br.com.pdcase.pdsegu.ws.Unidade[] getUnidades() {
        return unidades;
    }


    /**
     * Sets the unidades value for this UnidadesServiceWrapper.
     * 
     * @param unidades
     */
    public void setUnidades(br.com.pdcase.pdsegu.ws.Unidade[] unidades) {
        this.unidades = unidades;
    }

    public br.com.pdcase.pdsegu.ws.Unidade getUnidades(int i) {
        return this.unidades[i];
    }

    public void setUnidades(int i, br.com.pdcase.pdsegu.ws.Unidade _value) {
        this.unidades[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnidadesServiceWrapper)) return false;
        UnidadesServiceWrapper other = (UnidadesServiceWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unidades==null && other.getUnidades()==null) || 
             (this.unidades!=null &&
              java.util.Arrays.equals(this.unidades, other.getUnidades())));
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
        if (getUnidades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnidades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnidades(), i);
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
        new org.apache.axis.description.TypeDesc(UnidadesServiceWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "unidadesServiceWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "unidade"));
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
