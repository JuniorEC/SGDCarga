/**
 * TransacoesServiceWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class TransacoesServiceWrapper  extends br.com.pdcase.pdsegu.ws.ServiceWrapper  implements java.io.Serializable {
    private java.lang.String descricaoSistema;

    private java.lang.String diretorioModulo;

    private java.lang.String endereco;

    private java.lang.Integer idSistema;

    private java.lang.String nomeSistema;

    private java.lang.String siglaSistema;

    private br.com.pdcase.pdsegu.ws.TransacaoBean[] transacoes;

    private java.lang.String urlInicialSistema;

    public TransacoesServiceWrapper() {
    }

    public TransacoesServiceWrapper(
           java.lang.String mensagem,
           java.lang.String resultado,
           java.lang.String descricaoSistema,
           java.lang.String diretorioModulo,
           java.lang.String endereco,
           java.lang.Integer idSistema,
           java.lang.String nomeSistema,
           java.lang.String siglaSistema,
           br.com.pdcase.pdsegu.ws.TransacaoBean[] transacoes,
           java.lang.String urlInicialSistema) {
        super(
            mensagem,
            resultado);
        this.descricaoSistema = descricaoSistema;
        this.diretorioModulo = diretorioModulo;
        this.endereco = endereco;
        this.idSistema = idSistema;
        this.nomeSistema = nomeSistema;
        this.siglaSistema = siglaSistema;
        this.transacoes = transacoes;
        this.urlInicialSistema = urlInicialSistema;
    }


    /**
     * Gets the descricaoSistema value for this TransacoesServiceWrapper.
     * 
     * @return descricaoSistema
     */
    public java.lang.String getDescricaoSistema() {
        return descricaoSistema;
    }


    /**
     * Sets the descricaoSistema value for this TransacoesServiceWrapper.
     * 
     * @param descricaoSistema
     */
    public void setDescricaoSistema(java.lang.String descricaoSistema) {
        this.descricaoSistema = descricaoSistema;
    }


    /**
     * Gets the diretorioModulo value for this TransacoesServiceWrapper.
     * 
     * @return diretorioModulo
     */
    public java.lang.String getDiretorioModulo() {
        return diretorioModulo;
    }


    /**
     * Sets the diretorioModulo value for this TransacoesServiceWrapper.
     * 
     * @param diretorioModulo
     */
    public void setDiretorioModulo(java.lang.String diretorioModulo) {
        this.diretorioModulo = diretorioModulo;
    }


    /**
     * Gets the endereco value for this TransacoesServiceWrapper.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this TransacoesServiceWrapper.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the idSistema value for this TransacoesServiceWrapper.
     * 
     * @return idSistema
     */
    public java.lang.Integer getIdSistema() {
        return idSistema;
    }


    /**
     * Sets the idSistema value for this TransacoesServiceWrapper.
     * 
     * @param idSistema
     */
    public void setIdSistema(java.lang.Integer idSistema) {
        this.idSistema = idSistema;
    }


    /**
     * Gets the nomeSistema value for this TransacoesServiceWrapper.
     * 
     * @return nomeSistema
     */
    public java.lang.String getNomeSistema() {
        return nomeSistema;
    }


    /**
     * Sets the nomeSistema value for this TransacoesServiceWrapper.
     * 
     * @param nomeSistema
     */
    public void setNomeSistema(java.lang.String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }


    /**
     * Gets the siglaSistema value for this TransacoesServiceWrapper.
     * 
     * @return siglaSistema
     */
    public java.lang.String getSiglaSistema() {
        return siglaSistema;
    }


    /**
     * Sets the siglaSistema value for this TransacoesServiceWrapper.
     * 
     * @param siglaSistema
     */
    public void setSiglaSistema(java.lang.String siglaSistema) {
        this.siglaSistema = siglaSistema;
    }


    /**
     * Gets the transacoes value for this TransacoesServiceWrapper.
     * 
     * @return transacoes
     */
    public br.com.pdcase.pdsegu.ws.TransacaoBean[] getTransacoes() {
        return transacoes;
    }


    /**
     * Sets the transacoes value for this TransacoesServiceWrapper.
     * 
     * @param transacoes
     */
    public void setTransacoes(br.com.pdcase.pdsegu.ws.TransacaoBean[] transacoes) {
        this.transacoes = transacoes;
    }

    public br.com.pdcase.pdsegu.ws.TransacaoBean getTransacoes(int i) {
        return this.transacoes[i];
    }

    public void setTransacoes(int i, br.com.pdcase.pdsegu.ws.TransacaoBean _value) {
        this.transacoes[i] = _value;
    }


    /**
     * Gets the urlInicialSistema value for this TransacoesServiceWrapper.
     * 
     * @return urlInicialSistema
     */
    public java.lang.String getUrlInicialSistema() {
        return urlInicialSistema;
    }


    /**
     * Sets the urlInicialSistema value for this TransacoesServiceWrapper.
     * 
     * @param urlInicialSistema
     */
    public void setUrlInicialSistema(java.lang.String urlInicialSistema) {
        this.urlInicialSistema = urlInicialSistema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransacoesServiceWrapper)) return false;
        TransacoesServiceWrapper other = (TransacoesServiceWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
            ((this.transacoes==null && other.getTransacoes()==null) || 
             (this.transacoes!=null &&
              java.util.Arrays.equals(this.transacoes, other.getTransacoes()))) &&
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
        int _hashCode = super.hashCode();
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
        if (getTransacoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransacoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransacoes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlInicialSistema() != null) {
            _hashCode += getUrlInicialSistema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransacoesServiceWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "transacoesServiceWrapper"));
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
        elemField.setFieldName("transacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "transacaoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
