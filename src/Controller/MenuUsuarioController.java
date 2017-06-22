package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuUsuarioController implements Initializable {

	@FXML
	private Label userlbl;

	@FXML
	private Label lbl;

	@FXML
	private Button ImpADI;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	public void GetUser(String user) {

		//Método para Setar o "Usuario logado" em um label na interface.
		userlbl.setText(user);

	}

	public void ImportarADI(ActionEvent event) {
		try {
			//((Node)event.getSource()).getScene().getWindow().hide();
			Stage secondaryStage = new Stage();									//Método para abrir uma nova jánela no caso do usuário efetuar o login.
			FXMLLoader loader2 = new FXMLLoader();
			Pane root = loader2.load(getClass().getResource("/application/ImportarADU.fxml").openStream());
			ImportarADUController importarADUController = (ImportarADUController)loader2.getController();
			Scene scene2 = new Scene(root);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondaryStage.setScene(scene2);
			secondaryStage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}


	public void SignOut(ActionEvent event) {
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();									//Método para abrir uma nova jánela no caso do usuário usar o signout em seu ambiente.
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/Login.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}



	@FXML
    public void ImportarPlanilha(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecione a planilha");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("XLS", "*.xls"));
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {

			try {
				saveFileRoutine(file);
			}
			catch(IOException e) {

				e.printStackTrace();
				lbl.setText("An ERROR occurred while saving the file!" +
						file.toString());
				return;
			}

			lbl.setText("File saved: " + file.toString());
		}

}
	private void saveFileRoutine(File file)
			throws IOException{
		// Creates a new file and writes the txtArea contents into it
		String txt = lbl.getText();
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(txt);
		writer.close();
	}

	public void handle(ActionEvent event) {
        Stage myDialog = new Stage();
        myDialog.initModality(Modality.WINDOW_MODAL);

        @SuppressWarnings("deprecation")
		Scene myDialogScene = new Scene(VBoxBuilder.create()
                .children(new Text("Hello! it's My Dialog."))
                .alignment(Pos.CENTER)
                .padding(new Insets(10))
                .build());

        myDialog.setScene(myDialogScene);
        myDialog.show();
    }
}
