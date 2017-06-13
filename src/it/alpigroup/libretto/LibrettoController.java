package it.alpigroup.libretto;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.alpigroup.libretto.model.Esame;
import it.alpigroup.libretto.model.LibrettoModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LibrettoController {

	private LibrettoModel libretto;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtCorso;

    public void setLibretto(LibrettoModel libretto) {
		this.libretto = libretto;
	}

	@FXML
    private TextField txtVoto;

    @FXML
    private DatePicker txtData;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextField txtEsami;

    @FXML
    private TextField txtMedia;

    @FXML
    private Button btnVisuallizza;

    @FXML
    private TextArea txtResult;

    @FXML
    void doInserisci(ActionEvent event) {
    	
    	Integer voto =0;
    	LocalDate data = txtData.getValue();
    	String corso = txtCorso.getText();
    	
    	try{
    	voto = Integer.parseInt(txtVoto.getText());
    	
    	}
    	catch(NumberFormatException e){
    		return;
    	}
    	
    	if( data!=null && !txtVoto.getText().equals("")&& !corso.equals("")){
    		
        	//libretto.addEsame(new Esame(data,corso,voto));

        	txtEsami.setText(libretto.getNumEsami().toString());
        	txtMedia.setText(libretto.getMediaVoti().toString());
        	
        	txtCorso.setText("");
        	txtVoto.setText("");}
    	// TODO: validazione dei dati
    	
    }
    @FXML
    void doDrag(MouseEvent event) {
System.out.println("DRAG");
    }
    @FXML
    void doVisualizza(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtCorso != null : "fx:id=\"txtCorso\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtEsami != null : "fx:id=\"txtEsami\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMedia != null : "fx:id=\"txtMedia\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnVisuallizza != null : "fx:id=\"btnVisuallizza\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Libretto.fxml'.";

    }
}
