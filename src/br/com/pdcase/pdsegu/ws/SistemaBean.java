/**
 * SistemaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class SistemaBean  implements java.io.Serializable {
    private java.lang.String descricaoSistema;

    private java.lang.String diretorioModulo;

    private java.lang.String endereco;

    private java.lang.Integer idSistema;

    private java.lang.String nomeSistema;

    private java.lang.String siglaSistema;

    private java.lang.String urlInicialSistema;

    public SistemaBean() {
    }

    public SistemaBean(
           java.lang.String descricaoSistema,
           java.lang.String diretorioModulo,
           java.lang.String endereco,
           java.lang.Integer idSistema,
           java.lang.String nomeSistema,
           java.lang.String siglaSistema,
           java.lang.String urlInicialSistema) {
           this.descricaoSistema = descricaoSistema;
           this.diretorioModulo = diretorioModulo;
           this.endereco = endereco;
           this.idSistema = idSistema;
           this.nomeSistema = nomeSistema;
           this.siglaSistema = siglaSistema;
           this.urlInicialSistema = urlInicialSistema;
    }


    /**
     * Gets the descricaoSistema value for this SistemaBean.
     * 
     * @return descricaoSistema
     */
    public java.lang.String getDescricaoSistema() {
        return descricaoSistema;
    }


    /**
     * Sets the descricaoSistema value for this SistemaBean.
     * 
     * @param descricaoSistema
     */
    public void setDescricaoSistema(java.lang.String descricaoSistema) {
        this.descricaoSistema = descricaoSistema;
    }


    /**
     * Gets the diretorioModulo value for this SistemaBean.
     * 
     * @return diretorioModulo
     */
    public java.lang.String getDiretorioModulo() {
        return diretorioModulo;
    }


    /**
     * Sets the diretorioModulo value for this SistemaBean.
     * 
     * @param diretorioModulo
     */
    public void setDiretorioModulo(java.lang.String diretorioModulo) {
        this.diretorioModulo = diretorioModulo;
    }


    /**
     * Gets the endereco value for this SistemaBean.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this SistemaBean.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the idSistema value for this SistemaBean.
     * 
     * @return idSistema
     */
    public java.lang.Integer getIdSistema() {
        return idSistema;
    }


    /**
     * Sets the idSistema value for this SistemaBean.
     * 
     * @param idSistema
     */
    public void setIdSistema(java.lang.Integer idSistema) {
        this.idSistema = idSistema;
    }


    /**
     * Gets the nomeSistema value for this SistemaBean.
     * 
     * @return nomeSistema
     */
    public java.lang.String getNomeSistema() {
        return nomeSistema;
    }


    /**
     * Sets the nomeSistema value for this SistemaBean.
     * 
     * @param nomeSistema
     */
    public void setNomeSistema(java.lang.String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }


    /**
     * Gets the siglaSistema value for this SistemaBean.
     * 
     * @return siglaSistema
     */
    public java.lang.String getSiglaSistema() {
        return siglaSistema;
    }


    /**
     * Sets the siglaSistema value for this SistemaBean.
     * 
     * @param siglaSistema
     */
    public void setSiglaSistema(java.lang.String siglaSistema) {
        this.siglaSistema = siglaSistema;
    }


    /**
     * Gets the urlInicialSistema value for this SistemaBean.
     * 
     * @return urlInicialSistema
     */
    public java.lang.String getUrlInicialSistema() {
        return urlInicialSistema;
    }


    /**
     * Sets the urlInicialSistema value for this SistemaBean.
     * 
     * @param urlInicialSistema
     */
    public void setUrlInicialSistema(java.lang.String urlInicialSistema) {
        this.urlInicialSistema = urlInicialSistema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SistemaBean)) return false;
        SistemaBean other = (SistemaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricaoSistema==null && other.getDescricaoSistema()==null) || 
             (this.descricaoSistema!=null &&
              this.descricaoSistema.equals(other.getDescricaoSistema()))) &&
            ((this.diretorioModulo==null && other.getDiretorioModulo()==null) || 
             (this.diretorioModulo!=null &&
              this.diretorioModulo.equals(other.getDiretorioModulo()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.idSistema==null && other.getIdSistema()==null) || 
             (this.idSistema!=null &&
              this.idSistema.equals(other.getIdSistema()))) &&
            ((this.nomeSistema==null && other.getNomeSistema()==null) || 
             (this.nomeSistema!=null &&
              this.nomeSistema.equals(other.getNomeSistema()))) &&
            ((this.siglaSistema==null && other.getSiglaSistema()==null) || 
             (this.siglaSistema!=null &&
              this.siglaSistema.equals(other.getSiglaSistema()))) &&
            ((this.urlInicialSistema==null && other.getUrlInicialSistema()==null) || 
             (this.urlInicialSistema!=null &&
              this.urlInicialSistema.equals(other.getUrlInicialSistema())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescricaoSistema() != null) {
            _hashCode += getDescricaoSistema().hashCode();
        }
        if (getDiretorioModulo() != null) {
            _hashCode += getDiretorioModulo().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getIdSistema() != null) {
            _hashCode += getIdSistema().hashCode();
        }
        if (getNomeSistema() != null) {
            _hashCode += getNomeSistema().hashCode();
        }
        if (getSiglaSistema() != null) {
            _hashCode += getSiglaSistema().hashCode();
        }
        if (getUrlInicialSistema() != null) {
            _hashCode += getUrlInicialSistema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SistemaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "sistemaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diretorioModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diretorioModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglaSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlInicialSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlInicialSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
