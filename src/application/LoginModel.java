package application;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pdcase.pdsegu.ws.AutenticaServiceWrapper;
import br.com.pdcase.pdsegu.ws.SeguServiceProxy;
import br.com.pdcase.pdsegu.ws.UsuarioBean;

public class LoginModel {
	Connection connection;

	public LoginModel() {
		connection = SQLConnection.Connector();
		if(connection == null) System.exit(1);
	}

	public boolean isDBConnected(){
		try {
			return !connection.isClosed();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
		public boolean isLogin (String user, String pass) throws SQLException {
			try {
				AutenticaServiceWrapper validarUsuario = new SeguServiceProxy().validarUsuario(user, pass);
				String resultado = validarUsuario.getResultado();

				switch (resultado) {

				case "-3":
					JOptionPane.showMessageDialog(null, validarUsuario.getMensagem());
					return false;

				case "-4":
					JOptionPane.showMessageDialog(null, validarUsuario.getMensagem());

					return false;

				case "0":
					UsuarioBean usuario = validarUsuario.getUsuario();

					System.out.println(usuario.getNome());

					return true;

				default:
					break;


				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			return false;
		}

		public boolean isLogin2(String user, String pass) throws SQLException {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			String query = "select * from Usuario where matricula= ? and senha= ?";
			try {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1,user);
				preparedStatement.setString(2,pass);

				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					return true;
				}
				else {
					return false;
				}

			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
			finally {
				preparedStatement.close();
				resultSet.close();
			}
		}
	}

