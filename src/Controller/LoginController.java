package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	public LoginModel loginModel = new LoginModel();

	@FXML
	private Label isConnected; // label que informa o status da conex�o.

	@FXML
	private TextField txtUsuario ; // matricula do usu�rio.

	@FXML
	private TextField pwdUsuario ; // senha do usu�rio.

	@FXML
	private Button btnsair;

	@Override //Informa o status da conex�o do banco.
	public void initialize(URL location, ResourceBundle resources) {
		if(loginModel.isDBConnected()) {
			isConnected.setText("Connected");
		} else {

			isConnected.setText("Not Connected");
		}
	}



	public void Login (ActionEvent event) {
		try {
			if (loginModel.isLogin2(txtUsuario.getText(),pwdUsuario.getText())) {
				isConnected.setText("usuario e senha correta");                   // M�todo que verifica na base o usuario e senha l� cadastrados e os retorna em uma string.
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();									//M�todo para abrir uma nova j�nela no caso do usu�rio efetuar o login.
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/MenuUsuario.fxml").openStream());
				MenuUsuarioController menuUsuarioController = (MenuUsuarioController)loader.getController();
				menuUsuarioController.GetUser(txtUsuario.getText());
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setResizable(false);
				primaryStage.setScene(scene);
				primaryStage.show();


			} else {
			isConnected.setText("Usu�rio e senha inv�lido");
		}
		}	catch (Exception e) {
				isConnected.setText("usuario e senha incorreta");
				e.printStackTrace();
			}

	}
	@FXML
	public void fechar(ActionEvent event) {

        System.exit(0);
    }
}