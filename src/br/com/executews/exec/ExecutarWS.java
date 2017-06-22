package br.com.executews.exec;

import java.rmi.RemoteException;

import br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper;
import br.com.pdcase.pdsegu.ws.SeguServiceProxy;

public class ExecutarWS {

	public static boolean isLogin (String user, String pass) {
		// TODO Auto-generated method stub
		try {
			AutenticaServiceWrapper validarUsuario = new SeguServiceProxy().validarUsuario(user, pass);
			String resultado = validarUsuario.getResultado();
			if(resultado.equals("0")) {

				return true;

			} else {

				return false;

			}



		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
