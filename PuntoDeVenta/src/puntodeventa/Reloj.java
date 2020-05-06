package puntodeventa;

import Controllers.CheckentradaJpaController;
import Controllers.ChecksalidaJpaController;
import Controllers.TrabajadorJpaController;
import Entities.Checkentrada;
import Entities.Checksalida;
import Entities.Trabajador;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Reloj implements Initializable {
    @FXML private StackPane pane;
    @FXML private Group group;
    
    Dial segundero =new Dial(200,50,5,Color.CRIMSON);
    Dial minutero =new Dial(150,40,10,Color.BLACK);
    Dial horero =new Dial(100,30,15,Color.BLACK);
    Calendar calendar;

    @FXML
    private PasswordField txtCodEmp;

    private CheckentradaJpaController ControlEntrada;
    private TrabajadorJpaController ControlEmpleado;
    private Checkentrada entrada;
    private ChecksalidaJpaController ControlSalida;
    private Checksalida salida;
    private Trabajador empleado;

    private List<Trabajador> listEmpleado;
    
    
    public void layout(){
        
        Circle contorno=new Circle(240, Color.BLACK);
        contorno.setEffect(new Lighting());
        Circle luna=new Circle(220, Color.WHITESMOKE);
        luna.setEffect(new InnerShadow());
        pane.getChildren().addAll(contorno,luna);
        
        Text txt12=new Text("12");
        Text txt3=new Text("3");
        Text txt6=new Text("6");
        Text txt9=new Text("9");
        
        txt12.setTranslateY(-150);
        txt3.setTranslateX(150);
        txt6.setTranslateY(150);
        txt9.setTranslateX(-150);
        
        pane.getChildren().addAll(txt12,txt3,txt6,txt9);
        
        Rectangle[] tick_hora=new Rectangle[12];
        for(int i=0;i<12;i++){
            tick_hora[i]=new Rectangle(20,5,Color.BLACK);
            tick_hora[i].setTranslateX(190* Math.cos(-(Math.PI / 6)*i));
            tick_hora[i].setTranslateY(190* Math.sin(-(Math.PI / 6)*i));
            tick_hora[i].setRotate(-(180/6)*i);
        }
        
        pane.getChildren().addAll(tick_hora);
        
        Rectangle[] tick_minutos=new Rectangle[60];
        for (int i = 0; i < 60; i++) {
            if (i % 5 == 0) {
                continue;
            }
            tick_minutos[i] = new Rectangle(10, 2, Color.BLACK);
            tick_minutos[i].setTranslateX(190 * Math.cos(-(Math.PI / 30) * i));
            tick_minutos[i].setTranslateY(190 * Math.sin(-(Math.PI / 30) * i));
            tick_minutos[i].setRotate(-(180 / 30) * i);
            pane.getChildren().add(tick_minutos[i]);
        }
        
        group.getChildren().addAll(horero,minutero,segundero);
        group.getChildren().add(new Circle(413,240,10,Color.CRIMSON));
        group.getChildren().add(new Circle(413,240,5,Color.BLACK));
        
        actualizar();
        ejecutarReloj();
    }
    
    
    private void actualizar(){
        calendar= Calendar.getInstance();
        
        int hor=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int seconds=calendar.get(Calendar.SECOND);
        
        double angle_hor=360/12*hor + (360.0/12)/60* minute + (360.0/12)/3600*seconds;
        double angle_min=360/60*minute + (360.0/60)/60*seconds;
        double angle_seg=360/60*seconds;
        
        segundero.actualizarDial(angle_seg);
        minutero.actualizarDial(angle_min);
        horero.actualizarDial(angle_hor);
        
        
    }
    
    public void ejecutarReloj(){
        Timeline lineaSecundaria=new Timeline();
        Timeline lineaPrimaria=new Timeline();
        
        lineaSecundaria.setCycleCount(Timeline.INDEFINITE);
        
        KeyFrame keyPrimario=new KeyFrame(
                new Duration(1000 - calendar.get(Calendar.MILLISECOND)),
                evt->{
                    actualizar();
                    lineaSecundaria.play();
                }
        );
        
        KeyFrame keySecundario= new KeyFrame(
                Duration.seconds(1),
                evt->{
                    actualizar();
                }
        );
        
        lineaPrimaria.getKeyFrames().add(keyPrimario);
        lineaSecundaria.getKeyFrames().add(keySecundario);
        lineaPrimaria.play();
    }
    
    @FXML
    public void registrarEntrada() {
        calendar= Calendar.getInstance();
        
        int hor=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int seconds=calendar.get(Calendar.SECOND);
        
        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);
        mes++;
        String codEmp = txtCodEmp.getText();
        System.out.println(codEmp);
        try {
            empleado = ControlEmpleado.findTrabajador(codEmp);
            System.out.println(empleado.getNomCompleto());
            
            //System.out.println("Aqui llego 1");
            
            System.out.println("Aqui llego");
            entrada.setIdTrabajador(empleado);
            System.out.println(hor+":"+minute+":"+seconds);
            entrada.setHora(hor+":"+minute+":"+seconds);
            
            
            entrada.setFecha(dia+"-"+mes+"-"+año);           
            
            System.out.println(dia+"-"+mes+"-"+año);
            if(hor <= 9 && minute <= 15){
                entrada.setRetardos(0);
            }else{
                entrada.setRetardos(1);
            }
            
            ControlEntrada.create(entrada);
            
            
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Registro Exitoso");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Tu entrada se a registrado exitosamente.");
            boxVentaOk.showAndWait();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Usuario no encontrado");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Usuario no encontrado.");
            boxVentaOk.showAndWait();
        }
        
        try{
            int numRetardos=ControlEntrada.BuscarRetardoEmpleado(codEmp);
            System.out.println(numRetardos);
            if(numRetardos >= 3){
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Alerta de retardo");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Tienes mas de 3 retardos acumulados Total de retardos: "+numRetardos);
                boxVentaOk.showAndWait();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @FXML
    public void registrarSalida(){
        calendar= Calendar.getInstance();
        
        int hor=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int seconds=calendar.get(Calendar.SECOND);
        
        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);
        mes++;
        String codEmp = txtCodEmp.getText();
        System.out.println(codEmp);
        
        try {
            empleado = ControlEmpleado.findTrabajador(codEmp);
            System.out.println(empleado.getNomCompleto());
            
            //System.out.println("Aqui llego 1");
            
            System.out.println("Aqui llego");
            salida.setIdTrabajador(empleado);
            System.out.println(hor+":"+minute+":"+seconds);
            salida.setHora(hor+":"+minute+":"+seconds);
            
            
            salida.setFecha(dia+"-"+mes+"-"+año);           
            
            System.out.println(dia+"-"+mes+"-"+año);
            
            
            ControlSalida.create(salida);
            
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Registro Exitoso");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Tu salida se a registrado exitosamente.");
            boxVentaOk.showAndWait();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Alert boxVentaOk = new Alert(AlertType.INFORMATION);
            boxVentaOk.setTitle("Usuario no encontrado");
            boxVentaOk.setHeaderText(null);
            boxVentaOk.initStyle(StageStyle.UTILITY);
            boxVentaOk.setContentText("Usuario no encontrado.");
            boxVentaOk.showAndWait();
        }
    }
    
    private Ventanas ventana=new Ventanas();
    @FXML
    public void close(){
        ventana.inicio();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        layout();
        ControlEntrada = new CheckentradaJpaController();
        ControlEmpleado = new TrabajadorJpaController();
        
        ControlSalida =new ChecksalidaJpaController();
        entrada= new Checkentrada();
        
        salida=new Checksalida();
    }
    
}