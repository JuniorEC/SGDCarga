/**
 * GruposUsuarioServiceWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class GruposUsuarioServiceWrapper  extends br.com.pdcase.pdsegu.ws.ServiceWrapper  implements java.io.Serializable {
    private br.com.pdcase.pdsegu.ws.GrupoBean[] grupos;

    private java.lang.Integer idUnidade;

    private java.lang.String login;

    private java.lang.String matricula;

    private java.lang.String nome;

    public GruposUsuarioServiceWrapper() {
    }

    public GruposUsuarioServiceWrapper(
           java.lang.String mensagem,
           java.lang.String resultado,
           br.com.pdcase.pdsegu.ws.GrupoBean[] grupos,
           java.lang.Integer idUnidade,
           java.lang.String login,
           java.lang.String matricula,
           java.lang.String nome) {
        super(
            mensagem,
            resultado);
        this.grupos = grupos;
        this.idUnidade = idUnidade;
        this.login = login;
        this.matricula = matricula;
        this.nome = nome;
    }


    /**
     * Gets the grupos value for this GruposUsuarioServiceWrapper.
     * 
     * @return grupos
     */
    public br.com.pdcase.pdsegu.ws.GrupoBean[] getGrupos() {
        return grupos;
    }


    /**
     * Sets the grupos value for this GruposUsuarioServiceWrapper.
     * 
     * @param grupos
     */
    public void setGrupos(br.com.pdcase.pdsegu.ws.GrupoBean[] grupos) {
        this.grupos = grupos;
    }

    public br.com.pdcase.pdsegu.ws.GrupoBean getGrupos(int i) {
        return this.grupos[i];
    }

    public void setGrupos(int i, br.com.pdcase.pdsegu.ws.GrupoBean _value) {
        this.grupos[i] = _value;
    }


    /**
     * Gets the idUnidade value for this GruposUsuarioServiceWrapper.
     * 
     * @return idUnidade
     */
    public java.lang.Integer getIdUnidade() {
        return idUnidade;
    }


    /**
     * Sets the idUnidade value for this GruposUsuarioServiceWrapper.
     * 
     * @param idUnidade
     */
    public void setIdUnidade(java.lang.Integer idUnidade) {
        this.idUnidade = idUnidade;
    }


    /**
     * Gets the login value for this GruposUsuarioServiceWrapper.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this GruposUsuarioServiceWrapper.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the matricula value for this GruposUsuarioServiceWrapper.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this GruposUsuarioServiceWrapper.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the nome value for this GruposUsuarioServiceWrapper.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this GruposUsuarioServiceWrapper.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GruposUsuarioServiceWrapper)) return false;
        GruposUsuarioServiceWrapper other = (GruposUsuarioServiceWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.grupos==null && other.getGrupos()==null) || 
             (this.grupos!=null &&
              java.util.Arrays.equals(this.grupos, other.getGrupos()))) &&
            ((this.idUnidade==null && other.getIdUnidade()==null) || 
             (this.idUnidade!=null &&
              this.idUnidade.equals(other.getIdUnidade()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
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
        if (getGrupos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrupos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrupos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdUnidade() != null) {
            _hashCode += getIdUnidade().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GruposUsuarioServiceWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "gruposUsuarioServiceWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grupos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "grupoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
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
