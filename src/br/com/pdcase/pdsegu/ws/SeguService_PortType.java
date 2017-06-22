/**
 * SeguService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pdcase.pdsegu.ws;

public interface SeguService_PortType extends java.rmi.Remote {
    public br.com.pdcase.pdsegu.ws.ServiceWrapper logout(java.lang.String authkey) throws java.rmi.RemoteException;
    public java.lang.String obterGruposUsuarioAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.GruposUsuarioServiceWrapper obterGruposUsuarioByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public java.lang.String obterSistemasAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.SistemasServiceWrapper obterSistemasByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public java.lang.String obterTransacoesAsTextByAuthKey(java.lang.String authkey, java.lang.String sigla) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.TransacoesServiceWrapper obterTransacoesByAuthKey(java.lang.String authkey, java.lang.String sigla) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.UnidadesServiceWrapper obterUnidadePorId(int idUnidade) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.UsuarioServiceWrapper obterUsuarioByLogin(java.lang.String login) throws java.rmi.RemoteException;
    public java.lang.String ping() throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.Parametro recuperarParametro(java.lang.String arg0) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.ServiceWrapper trocarSenha(java.lang.String login, java.lang.String senha, java.lang.String novaSenha, java.lang.String dataValidade) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.AuthKeyServiceWrapper validarAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper validarUsuario(java.lang.String login, java.lang.String senha) throws java.rmi.RemoteException;
    public java.lang.String validarUsuarioAsText(java.lang.String login, java.lang.String senha) throws java.rmi.RemoteException;
    public java.lang.String validarUsuarioAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
    public br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper validarUsuarioByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException;
}
