/**
 * SeguService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public interface SeguService_Service extends javax.xml.rpc.Service {
    public java.lang.String getSeguServicePortAddress();

    public br.com.pdcase.pdsegu.ws.SeguService_PortType getSeguServicePort() throws javax.xml.rpc.ServiceException;

    public br.com.pdcase.pdsegu.ws.SeguService_PortType getSeguServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
