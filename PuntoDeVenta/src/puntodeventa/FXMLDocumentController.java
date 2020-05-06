/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.stage.StageStyle;
import Controllers.CalzadoJpaController;
import Controllers.TrabajadorJpaController;
import Controllers.VentaJpaController;
import Controllers.exceptions.NonexistentEntityException;
import Entities.Calzado;
import Entities.Trabajador;
import Entities.Venta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author LENOVO
 */
public class FXMLDocumentController implements Initializable {
    
    private CalzadoJpaController ControlCalzado;
   
    private List<Calzado> list;
    @FXML
    private TextField txtModelo;
    @FXML
    private Button btnVentas;
    @FXML
    private TableView<Calzado> tlbVentas;
    private ObservableList<Calzado> listCalzado;
    
    @FXML TableView<Calzado> tblCambio;
    
     @FXML private TextField txtUser;
     @FXML private TextField txtPass;

    @FXML
    private TableColumn<Calzado, String> clmnMarca;
    @FXML
    private TableColumn<Calzado, String> clmnEstilo;
    @FXML
    private TableColumn<Calzado, Number> clmnNumero;
    @FXML
    private TableColumn<Calzado, String> clmnColor;
    @FXML
    private TableColumn<Calzado, String> clmnFecha;
    @FXML
    private TableColumn<Calzado, Number> clmnPrecio;
    
    @FXML private TextField txtMarca;
    @FXML private TextField txtTalla;
    @FXML private TextField txtPrecio;
    @FXML private TextField txtMonto;
    
    @FXML private TextField txtModeloNuevo;
    @FXML private TextField txtMarcaNueva;
    @FXML private TextField txtTallaNueva;
    @FXML private TextField txtPrecioNuevo;
    @FXML private TextField txtDiferencia;
    @FXML private TextField txtMontoNuevo;
    
    @FXML private TextField txtMarcaCambio;
    @FXML private TextField txtEstiloCambio;
    @FXML private TextField txtNumeroCambio;
    @FXML private TextField txtColorCambio;
    
    @FXML private DatePicker txtFecha;
    
    private VentaJpaController controlVenta;
    private TrabajadorJpaController controlEmpleado;
    

    @FXML
    private void vntVentas(){
        Ventanas vtnVentas=new Ventanas();
        
        vtnVentas.ventas();
    }
    
    @FXML
    private void vtnPropietario(){
        ventana.checador();
    }
    
    @FXML
    private void vender() throws ParseException, NonexistentEntityException, Exception{
       Venta venta=new Venta();
        
        Alert boxAlert=new Alert(AlertType.CONFIRMATION);
        boxAlert.setTitle("Confirmar Venta");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Confirmar Venta");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            String modelo, marca, talla, precio, monto;
            modelo=txtModelo.getText();
            marca=txtMarca.getText();
            talla=txtTalla.getText();
            precio=txtPrecio.getText();
            monto = txtMonto.getText();
            monto=monto+".00";
            String prec=precio.substring(1);
            double pre =Double.parseDouble(prec);
            double mont=Double.parseDouble(monto);
            
            
            if (modelo.equals("") || marca.equals("") || talla.equals("") || precio.equals("") || monto.equals("")) {
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Completa Todos los datos");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Completa todos los campos para poder realizar la venta");
                boxAlertCampos.showAndWait();
            }else if(pre > mont){
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Efectivo Insuficiente");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Efectivo insuficiente...");
                boxAlertCampos.showAndWait();
            }else{
                //double cambio;
                Calendar calendar= new GregorianCalendar();
                
                int dia = calendar.get(Calendar.DATE);
                int mes = calendar.get(Calendar.MONTH);
                int año = calendar.get(Calendar.YEAR);
                mes++;
                String fecha=dia+"/"+mes+"/"+año;
                
                venta.setCodigo(calzado);
                
                
                venta.setFechaVenta(fecha);
                
                venta.setIdTrabajador("ABC003");
                calzado.setStatus("Vendido");
                ControlCalzado.edit(calzado);            
                controlVenta.create(venta);
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Venta Exitosa");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Venta Realizada Con Exito. Su cambio es : $"+(mont-pre));
                boxVentaOk.showAndWait();
            }
            
           
        }
    }

    @FXML
    public void cancelar() {
        txtModelo.setText("");
        txtMarca.setText("");
        txtTalla.setText("");
        txtPrecio.setText("");
        txtMonto.setText("");
        txtModeloNuevo.setText("");
        txtMarcaCambio.setText("");
        txtMarcaNueva.setText("");
        txtTallaNueva.setText("");
        txtDiferencia.setText("");
        txtEstiloCambio.setText("");
        txtMontoNuevo.setText("");
        txtColorCambio.setText("");
        txtNumeroCambio.setText("");
        
    }
    
    @FXML
    private void filtrarResult() {

        String texto = txtModelo.getText();
        if (texto.equals("")) {
            System.out.println("Hola Cadena Vacia");
        } else {

            listCalzado = FXCollections.observableArrayList(ControlCalzado.findByNombreLike(texto));
            
            tlbVentas.setItems(listCalzado);
            clmnMarca.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Marca"));
            clmnEstilo.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Modelo"));
            clmnNumero.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Numero"));
            clmnColor.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Color"));
            clmnPrecio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Precio"));
            clmnFecha.setCellValueFactory(new PropertyValueFactory<Calzado, String>("FechaRegInv"));
        }

    }
    Calzado calzado=new Calzado();
    Calzado calzadoCambio=new Calzado();
    @FXML
    public void selectItem(){
        try{
            calzado=tlbVentas.getSelectionModel().getSelectedItem();
            txtModelo.setText(calzado.getModelo());
            txtMarca.setText(calzado.getMarca());
            txtTalla.setText("#"+String.valueOf(calzado.getNumero()));
            txtPrecio.setText("$"+String.valueOf(calzado.getPrecio())+"0");
        }catch(NullPointerException e){
            System.out.println("Segunda Parte de try");
            try{
                calzado=tblCambio.getSelectionModel().getSelectedItem();
                System.out.println("Hola 222");
                if(txtMarcaCambio.getText().equals("")){
                    txtMarcaCambio.setText(calzado.getMarca());
                    txtEstiloCambio.setText(calzado.getModelo());
                    txtNumeroCambio.setText("#"+String.valueOf(calzado.getNumero()));
                    txtColorCambio.setText(calzado.getColor());
                }else{
                    System.out.println("Hola 229");
                    calzadoCambio=tblCambio.getSelectionModel().getSelectedItem();
                    System.out.println("Hola 231");
                    txtModeloNuevo.setText(calzadoCambio.getModelo());
                    txtMarcaNueva.setText(calzadoCambio.getMarca());
                    txtTallaNueva.setText("#"+String.valueOf(calzadoCambio.getNumero()));
                    txtPrecioNuevo.setText("$"+String.valueOf(calzadoCambio.getPrecio()));
                    double diferencia=calzadoCambio.getPrecio()-calzado.getPrecio();
                    if(diferencia<0){
                        diferencia=0;
                    }
                    txtDiferencia.setText("$"+String.valueOf(diferencia));
                }
                
            }catch(Exception a){
                System.out.println("Excepción="+a);
            }
        }
        
        
    }
    
    
    Ventanas ventana= new Ventanas();
    @FXML
    public void close(){
        
        ventana.inicio();
    }
    
    @FXML
    public void vtnChecar(){
        ventana.vtnRegistro();
    }
    

    
    @FXML
    public void iniciar(){
        Trabajador empleado=new Trabajador();
        empleado=controlEmpleado.findTrabajador("SLV100");
       
        String user=txtUser.getText();
        String pass=txtPass.getText();
        
        if(empleado.getNomCompleto().equals(user) && empleado.getIdTrabajador().equals(pass)){
            ventana.propietario();
        } else {
            Alert boxAlertCampos = new Alert(AlertType.INFORMATION);
            boxAlertCampos.setTitle("Datos Incorrectos");
            boxAlertCampos.setHeaderText(null);
            boxAlertCampos.initStyle(StageStyle.UTILITY);
            boxAlertCampos.setContentText("Verifique Usuario Y Contraseña");
            boxAlertCampos.showAndWait();
        }
    }
    
    @FXML
    public void realizarCambio(){
        Alert boxAlert=new Alert(AlertType.CONFIRMATION);
        boxAlert.setTitle("Confirmar Cambio");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("solo se permite un solo cambio, esta seguro de hacerlo");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            if(calzado != null && calzadoCambio != null){
                Alert boxVentaOk = new Alert(AlertType.INFORMATION);
                boxVentaOk.setTitle("Venta Exitosa");
                boxVentaOk.setHeaderText(null);
                boxVentaOk.initStyle(StageStyle.UTILITY);
                boxVentaOk.setContentText("Cambio Realizado Con Exito");
                boxVentaOk.showAndWait();
            }else{
                Alert boxAlertCampos= new Alert(AlertType.INFORMATION);
                boxAlertCampos.setTitle("Completa Todos los datos");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("Completa todos los campos para poder realizar la venta");
                boxAlertCampos.showAndWait();
            }
        }
        
        
        
    }
    
    private ObservableList<Venta> listVentas;
    private ObservableList<Calzado> listCalzadoCambio;

    @FXML
    private TableColumn<Calzado, String> clmnMarcaCambio;
    @FXML
    private TableColumn<Calzado, String> clmnEstiloCambio;
    @FXML
    private TableColumn<Calzado, Number> clmnNumeroCambio;
    @FXML
    private TableColumn<Calzado, String> clmnColorCambio;
    @FXML
    private TableColumn<Calzado, String> clmnFechaCambio;
    @FXML
    private TableColumn<Calzado, Number> clmnPrecioCambio;
    List<Calzado> listaFinal= new ArrayList();
    @FXML
    public void cambio(){
        String fecha=txtFecha.getEditor().getText();
        String[] fechaAux=fecha.split("/");
        String dia=fechaAux[0];
        int Dia=Integer.parseInt(dia);
        String mes=fechaAux[1];
        int Mes=Integer.parseInt(mes);
        
        String Fecha=Dia+"/"+Mes+"/"+fechaAux[2];
        System.out.println(Dia+"/"+Mes+"/"+fechaAux[2]);
        //if()
        System.out.println("Contenido de fecha: "+Fecha);
        listVentas = FXCollections.observableArrayList(controlVenta.findVentaByFecha(Fecha));
        System.out.println("Tamaño de ListVentas= "+listVentas.size());
        for(int i=0; i<listVentas.size();i++){
            calzado.setCodigo(listVentas.get(i).getCodigo().getCodigo());
            calzado.setMarca(listVentas.get(i).getCodigo().getMarca());
            calzado.setModelo(listVentas.get(i).getCodigo().getModelo());
            calzado.setNumero(listVentas.get(i).getCodigo().getNumero());
            calzado.setColor(listVentas.get(i).getCodigo().getColor());
            calzado.setPrecio(listVentas.get(i).getCodigo().getPrecio());
            calzado.setFechaRegInv(listVentas.get(i).getCodigo().getFechaRegInv());
            System.out.println(calzado.getMarca());
            listaFinal.add(calzado);
        }
        
        listCalzadoCambio=FXCollections.observableArrayList(listaFinal);
        System.out.println("Tamaño de Lista = "+listCalzadoCambio.size()+"Contenido de listCalzadoCambio = "+listCalzadoCambio.get(0).getMarca());
        tblCambio.setItems(listCalzadoCambio);
        clmnMarcaCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Marca"));
        clmnEstiloCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Modelo"));
        clmnNumeroCambio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Numero"));
        clmnColorCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Color"));
        clmnPrecioCambio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Precio"));
        clmnFechaCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("FechaRegInv"));
        
    }
    
    @FXML 
    private void filtrarResultCambio() {

        String texto = txtModeloNuevo.getText();
        if (texto.equals("")) {
            System.out.println("Cadena Vacia");
        } else {

            listCalzado = FXCollections.observableArrayList(ControlCalzado.findByNombreLike(texto));
            for(int i=0; i<listCalzado.size();i++){
                String status=listCalzado.get(i).getStatus();
                if(status.equals("Vendido")){
                    listCalzado.remove(i);
               }
            }
            
            tblCambio.setItems(listCalzado);
            clmnMarcaCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Marca"));
            clmnEstiloCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Modelo"));
            clmnNumeroCambio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Numero"));
            clmnColorCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Color"));
            clmnPrecioCambio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Precio"));
            clmnFechaCambio.setCellValueFactory(new PropertyValueFactory<Calzado, String>("FechaRegInv"));
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ControlCalzado=new CalzadoJpaController();
        controlEmpleado=new TrabajadorJpaController();
        controlVenta= new VentaJpaController();
    }

}
