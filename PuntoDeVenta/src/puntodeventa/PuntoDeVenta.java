/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author LENOVO
 */
public class PuntoDeVenta extends Application {
    
    private Stage primaryStage;
    
    
    Ventanas ventana= new Ventanas();

    @Override
    public void start(Stage stage) throws Exception {
        ventana.inicio();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
