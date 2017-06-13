package it.alpigroup.libretto;
	



import it.alpigroup.libretto.model.LibrettoModel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Libretto.fxml"));
			BorderPane root = (BorderPane)loader.load();
			LibrettoController controller = loader.getController();
			
			//commento
			LibrettoModel libretto = new LibrettoModel();
			controller.setLibretto(libretto);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	public static void main(String[] args) {
	    /*
	    LocalDate data = LocalDate.now();
	    Esame es = new Esame(data,"Inglese",27);
	    Esame es1 = new Esame(data,"Analisi 1",18);
	    LibrettoModel libr = new LibrettoModel();
	    libr.addEsame(es);
	    libr.addEsame(es1);
	    System.out.println(libr.getMediaVoti());
	    */
	    /*
		launch(args);
	}
*/
}
