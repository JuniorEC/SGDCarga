package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ImportarADUController implements Initializable {

	@FXML
	private ListView<String> Arquivo;

	@FXML
	private TextField Caminho;

	//ObservableList<String> caminho; //= FXCollections.observableArrayList(Caminho.toString());

	@FXML
	private TextField Data;

	@FXML
	private Button Processar;

	@FXML
	private Button Buscar;

	@FXML
	private ComboBox<String> Semestre;

	ObservableList<String> semestre = FXCollections.observableArrayList("1","2");

	@FXML
	private ComboBox<String> Ano;

	ObservableList<String> ano = FXCollections.observableArrayList("2014","2015","2016","2017");

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Semestre.setItems(semestre);

		Ano.setItems(ano);

		//Arquivo.setItems(caminho);
		//Arquivo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}

	public void SetaData (ActionEvent event) { //Método para setar a pesquisa SQL futura
		Data.setText(Semestre.getValue() +" / "+ Ano.getValue());

	}


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
				Caminho.setText("An ERROR occurred while saving the file!" +
						file.toString());
				return;
			}

			Caminho.setText("File saved: " + file.toString());
			//Arquivo.getItems().addAll(caminho);
		}

}
	private void saveFileRoutine(File file)
			throws IOException{
		// Creates a new file and writes the txtArea contents into it
		String txt = Caminho.getText();
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(txt);
		writer.close();
	}

	//public void Processar ()

}
