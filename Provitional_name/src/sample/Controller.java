package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller extends Application {
    private Stage stage;

    public void evtSalir(ActionEvent evt){
        System.exit(0);
    }
    public void evtAbrir(ActionEvent evt){
        FileChooser of =new FileChooser();
        of.setTitle("Abrir archivo Provitional Name");
        FileChooser.ExtensionFilter filtro= new FileChooser.ExtensionFilter("Archivos .inc","*.inc");
        of.getExtensionFilters().add(filtro);
        File file=of.showOpenDialog(stage);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage=primaryStage;
    }
}
