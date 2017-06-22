package br.com.pdcase.pdsegu.ws;

public class SeguServiceProxy implements br.com.pdcase.pdsegu.ws.SeguService_PortType {
  private String _endpoint = null;
  private br.com.pdcase.pdsegu.ws.SeguService_PortType seguService_PortType = null;
  
  public SeguServiceProxy() {
    _initSeguServiceProxy();
  }
  
  public SeguServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSeguServiceProxy();
  }
  
  private void _initSeguServiceProxy() {
    try {
      seguService_PortType = (new br.com.pdcase.pdsegu.ws.SeguService_ServiceLocator()).getSeguServicePort();
      if (seguService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)seguService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)seguService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (seguService_PortType != null)
      ((javax.xml.rpc.Stub)seguService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.pdcase.pdsegu.ws.SeguService_PortType getSeguService_PortType() {
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType;
  }
  
  public br.com.pdcase.pdsegu.ws.ServiceWrapper logout(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.logout(authkey);
  }
  
  public java.lang.String obterGruposUsuarioAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterGruposUsuarioAsTextByAuthKey(authkey);
  }
  
  public br.com.pdcase.pdsegu.ws.GruposUsuarioServiceWrapper obterGruposUsuarioByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterGruposUsuarioByAuthKey(authkey);
  }
  
  public java.lang.String obterSistemasAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterSistemasAsTextByAuthKey(authkey);
  }
  
  public br.com.pdcase.pdsegu.ws.SistemasServiceWrapper obterSistemasByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterSistemasByAuthKey(authkey);
  }
  
  public java.lang.String obterTransacoesAsTextByAuthKey(java.lang.String authkey, java.lang.String sigla) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterTransacoesAsTextByAuthKey(authkey, sigla);
  }
  
  public br.com.pdcase.pdsegu.ws.TransacoesServiceWrapper obterTransacoesByAuthKey(java.lang.String authkey, java.lang.String sigla) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterTransacoesByAuthKey(authkey, sigla);
  }
  
  public br.com.pdcase.pdsegu.ws.UnidadesServiceWrapper obterUnidadePorId(int idUnidade) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterUnidadePorId(idUnidade);
  }
  
  public br.com.pdcase.pdsegu.ws.UsuarioServiceWrapper obterUsuarioByLogin(java.lang.String login) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.obterUsuarioByLogin(login);
  }
  
  public java.lang.String ping() throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.ping();
  }
  
  public br.com.pdcase.pdsegu.ws.Parametro recuperarParametro(java.lang.String arg0) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.recuperarParametro(arg0);
  }
  
  public br.com.pdcase.pdsegu.ws.ServiceWrapper trocarSenha(java.lang.String login, java.lang.String senha, java.lang.String novaSenha, java.lang.String dataValidade) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.trocarSenha(login, senha, novaSenha, dataValidade);
  }
  
  public br.com.pdcase.pdsegu.ws.AuthKeyServiceWrapper validarAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.validarAuthKey(authkey);
  }
  
  public br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper validarUsuario(java.lang.String login, java.lang.String senha) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.validarUsuario(login, senha);
  }
  
  public java.lang.String validarUsuarioAsText(java.lang.String login, java.lang.String senha) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.validarUsuarioAsText(login, senha);
  }
  
  public java.lang.String validarUsuarioAsTextByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.validarUsuarioAsTextByAuthKey(authkey);
  }
  
  public br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper validarUsuarioByAuthKey(java.lang.String authkey) throws java.rmi.RemoteException{
    if (seguService_PortType == null)
      _initSeguServiceProxy();
    return seguService_PortType.validarUsuarioByAuthKey(authkey);
  }
  
  
}