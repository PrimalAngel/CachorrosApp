package puntodeventa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Dialog;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Ventanas {

    private static Stage st = new Stage();
    Image ico[] = new Image[1];
       
    @FXML private TableView tlbVentas;
    
    public void inicio() {
        try {
            Pane root = (Pane) FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            st.setScene(scene);
            st.setTitle("INICIAR SESIÓN");
            st.show();
            st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ventas() {
        try {
            
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("vtnVentas.fxml"));
            Scene scene = new Scene(root);
            st.setScene(scene);
            st.setTitle("Ventas");
            st.show();
            st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void propietario() {
        try {

            VBox root = (VBox) FXMLLoader.load(getClass().getResource("propietario.fxml"));
            Scene scene = new Scene(root);
            st.setScene(scene);
            st.setTitle("Propietario");
            st.show();
            st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void checador(){
        try {   
            VBox root = (VBox) FXMLLoader.load(getClass().getResource("check.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("puntodeventa/resources.css/style.css");
            st.setScene(scene);
            st.setTitle("Checar");
            st.show();
            st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void vtnRegistro(){
        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        System.out.println(hora + ":" + minutos + ":" + segundos);
        
        if (hora < 10) {
            try {

                VBox root = (VBox) FXMLLoader.load(getClass().getResource("checkEntrada.fxml"));
                Scene scene = new Scene(root);
                //scene.getStylesheets().add("puntodeventa/resources.css/style.css");
                st.setScene(scene);
                st.setTitle("Registrar Entrada");
                st.show();
                st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {

                VBox root = (VBox) FXMLLoader.load(getClass().getResource("checkSalida.fxml"));
                Scene scene = new Scene(root);
                //scene.getStylesheets().add("puntodeventa/resources.css/style.css");
                st.setScene(scene);
                st.setTitle("Registrar Salida");
                st.show();
                st.getIcons().add(new Image(getClass().getResource("resources.css/icono.png").toExternalForm()));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
