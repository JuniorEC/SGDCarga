/**
 * SeguService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public class SeguService_ServiceLocator extends org.apache.axis.client.Service implements br.com.pdcase.pdsegu.ws.SeguService_Service {

    public SeguService_ServiceLocator() {
    }


    public SeguService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SeguService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SeguServicePort
    private java.lang.String SeguServicePort_address = "http://caete02:8080/pdseguws3/services/SeguService";

    public java.lang.String getSeguServicePortAddress() {
        return SeguServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SeguServicePortWSDDServiceName = "SeguServicePort";

    public java.lang.String getSeguServicePortWSDDServiceName() {
        return SeguServicePortWSDDServiceName;
    }

    public void setSeguServicePortWSDDServiceName(java.lang.String name) {
        SeguServicePortWSDDServiceName = name;
    }

    public br.com.pdcase.pdsegu.ws.SeguService_PortType getSeguServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SeguServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSeguServicePort(endpoint);
    }

    public br.com.pdcase.pdsegu.ws.SeguService_PortType getSeguServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.pdcase.pdsegu.ws.SeguServiceBindingStub _stub = new br.com.pdcase.pdsegu.ws.SeguServiceBindingStub(portAddress, this);
            _stub.setPortName(getSeguServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSeguServicePortEndpointAddress(java.lang.String address) {
        SeguServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.pdcase.pdsegu.ws.SeguService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.pdcase.pdsegu.ws.SeguServiceBindingStub _stub = new br.com.pdcase.pdsegu.ws.SeguServiceBindingStub(new java.net.URL(SeguServicePort_address), this);
                _stub.setPortName(getSeguServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SeguServicePort".equals(inputPortName)) {
            return getSeguServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "SeguService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.pdsegu.pdcase.com.br", "SeguServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SeguServicePort".equals(portName)) {
            setSeguServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
