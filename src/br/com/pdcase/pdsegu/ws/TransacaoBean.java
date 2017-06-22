/**
 * TransacaoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class TransacaoBean  implements java.io.Serializable {
    private java.lang.String descricao;

    private java.lang.String idTransacao;

    private java.lang.String idTransacaoPai;

    private java.lang.String mostrar;

    private java.lang.String nome;

    private java.lang.String paginaTransacao;

    private java.lang.String posicaoMenu;

    public TransacaoBean() {
    }

    public TransacaoBean(
           java.lang.String descricao,
           java.lang.String idTransacao,
           java.lang.String idTransacaoPai,
           java.lang.String mostrar,
           java.lang.String nome,
           java.lang.String paginaTransacao,
           java.lang.String posicaoMenu) {
           this.descricao = descricao;
           this.idTransacao = idTransacao;
           this.idTransacaoPai = idTransacaoPai;
           this.mostrar = mostrar;
           this.nome = nome;
           this.paginaTransacao = paginaTransacao;
           this.posicaoMenu = posicaoMenu;
    }


    /**
     * Gets the descricao value for this TransacaoBean.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this TransacaoBean.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the idTransacao value for this TransacaoBean.
     * 
     * @return idTransacao
     */
    public java.lang.String getIdTransacao() {
        return idTransacao;
    }


    /**
     * Sets the idTransacao value for this TransacaoBean.
     * 
     * @param idTransacao
     */
    public void setIdTransacao(java.lang.String idTransacao) {
        this.idTransacao = idTransacao;
    }


    /**
     * Gets the idTransacaoPai value for this TransacaoBean.
     * 
     * @return idTransacaoPai
     */
    public java.lang.String getIdTransacaoPai() {
        return idTransacaoPai;
    }


    /**
     * Sets the idTransacaoPai value for this TransacaoBean.
     * 
     * @param idTransacaoPai
     */
    public void setIdTransacaoPai(java.lang.String idTransacaoPai) {
        this.idTransacaoPai = idTransacaoPai;
    }


    /**
     * Gets the mostrar value for this TransacaoBean.
     * 
     * @return mostrar
     */
    public java.lang.String getMostrar() {
        return mostrar;
    }


    /**
     * Sets the mostrar value for this TransacaoBean.
     * 
     * @param mostrar
     */
    public void setMostrar(java.lang.String mostrar) {
        this.mostrar = mostrar;
    }


    /**
     * Gets the nome value for this TransacaoBean.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this TransacaoBean.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the paginaTransacao value for this TransacaoBean.
     * 
     * @return paginaTransacao
     */
    public java.lang.String getPaginaTransacao() {
        return paginaTransacao;
    }


    /**
     * Sets the paginaTransacao value for this TransacaoBean.
     * 
     * @param paginaTransacao
     */
    public void setPaginaTransacao(java.lang.String paginaTransacao) {
        this.paginaTransacao = paginaTransacao;
    }


    /**
     * Gets the posicaoMenu value for this TransacaoBean.
     * 
     * @return posicaoMenu
     */
    public java.lang.String getPosicaoMenu() {
        return posicaoMenu;
    }


    /**
     * Sets the posicaoMenu value for this TransacaoBean.
     * 
     * @param posicaoMenu
     */
    public void setPosicaoMenu(java.lang.String posicaoMenu) {
        this.posicaoMenu = posicaoMenu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransacaoBean)) return false;
        TransacaoBean other = (TransacaoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.idTransacao==null && other.getIdTransacao()==null) || 
             (this.idTransacao!=null &&
              this.idTransacao.equals(other.getIdTransacao()))) &&
            ((this.idTransacaoPai==null && other.getIdTransacaoPai()==null) || 
             (this.idTransacaoPai!=null &&
              this.idTransacaoPai.equals(other.getIdTransacaoPai()))) &&
            ((this.mostrar==null && other.getMostrar()==null) || 
             (this.mostrar!=null &&
              this.mostrar.equals(other.getMostrar()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.paginaTransacao==null && other.getPaginaTransacao()==null) || 
             (this.paginaTransacao!=null &&
              this.paginaTransacao.equals(other.getPaginaTransacao()))) &&
            ((this.posicaoMenu==null && other.getPosicaoMenu()==null) || 
             (this.posicaoMenu!=null &&
              this.posicaoMenu.equals(other.getPosicaoMenu())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getIdTransacao() != null) {
            _hashCode += getIdTransacao().hashCode();
        }
        if (getIdTransacaoPai() != null) {
            _hashCode += getIdTransacaoPai().hashCode();
        }
        if (getMostrar() != null) {
            _hashCode += getMostrar().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getPaginaTransacao() != null) {
            _hashCode += getPaginaTransacao().hashCode();
        }
        if (getPosicaoMenu() != null) {
            _hashCode += getPosicaoMenu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransacaoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "transacaoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransacaoPai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTransacaoPai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostrar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mostrar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paginaTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paginaTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posicaoMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posicaoMenu"));
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
