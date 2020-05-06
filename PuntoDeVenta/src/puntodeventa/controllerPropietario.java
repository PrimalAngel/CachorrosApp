package puntodeventa;

import Controllers.CalzadoJpaController;
import Controllers.TrabajadorJpaController;
import Controllers.VentaJpaController;
import Controllers.exceptions.IllegalOrphanException;
import Controllers.exceptions.NonexistentEntityException;
import Entities.Calzado;
import Entities.Trabajador;
import Entities.Venta;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class controllerPropietario implements Initializable{
    private Pane contentPane;
    @FXML private VBox vBoxInventario;
    private List<ToolBar> toolbar=new ArrayList<ToolBar>();
    private List<TextField> text=new ArrayList<TextField>();
    private List<DatePicker> date=new ArrayList<DatePicker>();
    int i=0;
    int j=0;
    private TrabajadorJpaController empleadoControl;
    
    private ObservableList<Calzado> listCalzado;
    private ObservableList<Trabajador> listEmpleado;
    private ObservableList<Venta> listVenta;
    private List<Calzado> list;
    
    @FXML private TableView<Calzado> tlbInv;
    @FXML private TableView<Trabajador> tlbEmpleado;
    @FXML private TableView<Venta> tlbVenta;
    
    @FXML
    private TableColumn<Calzado, String> clmnMarca;
    @FXML
    private TableColumn<Calzado, String> clmnStatus;
    @FXML
    private TableColumn<Calzado, String> clmnCategoria;
    @FXML
    private TableColumn<Calzado, String> clmnModelo;
    @FXML
    private TableColumn<Calzado, Number> clmnNumero;
    @FXML
    private TableColumn<Calzado, String> clmnColor;
    @FXML
    private TableColumn<Calzado, String> clmnFecha;
    @FXML
    private TableColumn<Calzado, Number> clmnPrecio;
    
    
    @FXML
    private TableColumn<Venta, String> clmnVenta;
    @FXML
    private TableColumn<Venta, String> clmnTrabajador;
    @FXML
    private TableColumn<Venta, String> clmnCodigo;
    @FXML
    private TableColumn<Venta, String> clmnFechaVenta;
    
    
    @FXML
    private TableColumn<Calzado, String> clmnId;
    @FXML
    private TableColumn<Calzado, String> clmnNombre;
    @FXML
    private TableColumn<Calzado, String> clmnCargo;
    @FXML
    private TableColumn<Calzado, String> clmnDireccion;
    @FXML
    private TableColumn<Calzado, Number> clmnEdad;
    
    private CalzadoJpaController calzadoControl;
    
    @FXML private VBox vBoxAdd;
    
    @FXML private TextField txtCategoria;
    @FXML private TextField txtMarca;
    @FXML private TextField txtModelo;
    @FXML private TextField txtColor;
    @FXML private TextField txtPrecio;
    
    @FXML private TextField idEmp;
    @FXML private TextField nombre;
    @FXML private TextField cargo;
    @FXML private TextField direccion;
    @FXML private TextField edad;
    private VentaJpaController controlVenta;
    
    @FXML
    public void agregarElemento() {
        
        TextField txt=new TextField();
        txt.setMaxWidth(70);
        text.add(txt);
        
        DatePicker fecha=new DatePicker();
        fecha.setMaxWidth(95);
        date.add(fecha);
        
        ToolBar tb=new ToolBar();
        tb.getItems().addAll(txt,fecha);
        toolbar.add(tb);
        
        vBoxInventario.getChildren().add(tb);
    }
    
    @FXML
    public void guardar() throws Exception{
        String categoria=txtCategoria.getText();
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        String color=txtColor.getText();
        String precio=txtPrecio.getText();
        float prec=Float.parseFloat(precio);
        System.out.println(date.get(i).getEditor().getText());
        for(int i=0; i<= text.size()-1;i++){
            //String fecha=date.get(i).getEditor().getText();
            
            Calzado calzado=new Calzado();
            calzado.setCodigo(0);
            calzado.setCategoria(categoria);
            calzado.setMarca(marca);
            calzado.setModelo(modelo);
            calzado.setColor(color);
            calzado.setPrecio(prec);
            Float talla=Float.parseFloat(text.get(i).getText());
            calzado.setNumero(talla);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            calzado.setFechaRegInv(String.valueOf(formatter.parse(date.get(i).getEditor().getText())));
            calzadoControl.create(calzado);
            mostrarTabla();
        }  
        Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("Exito");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("Se agregaron con exito");
            Optional<ButtonType> result = boxAlert.showAndWait();
    }
    
    public void mostrarTabla(){
        listCalzado = FXCollections.observableArrayList(calzadoControl.findCalzadoEntities());
        System.out.println(listCalzado.get(1).getFechaRegInv());
        tlbInv.setItems(listCalzado);

        clmnCategoria.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Categoria"));
        clmnMarca.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Marca"));
        clmnModelo.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Modelo"));
        clmnNumero.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Numero"));
        clmnColor.setCellValueFactory(new PropertyValueFactory<Calzado, String>("Color"));
        clmnPrecio.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("Precio"));
        clmnFecha.setCellValueFactory(new PropertyValueFactory<Calzado, String>("FechaRegInv"));
        clmnStatus.setCellValueFactory(new PropertyValueFactory<Calzado, String>("status"));
    }
    
    public void mostrarTablaVentas() {
        listVenta = FXCollections.observableArrayList(controlVenta.findVentaEntities());
        //System.out.println(listCalzado.get(1).getFechaRegInv());
        tlbVenta.setItems(listVenta);

        clmnVenta.setCellValueFactory(new PropertyValueFactory<Venta, String>("idventa"));
        clmnTrabajador.setCellValueFactory(new PropertyValueFactory<Venta, String>("idTrabajador"));
        clmnCodigo.setCellValueFactory(new PropertyValueFactory<Venta, String>("codigo"));
        clmnFechaVenta.setCellValueFactory(new PropertyValueFactory<Venta, String>("fechaVenta"));
    }
    
    public void mostrarTablaEmpleados() {
        listEmpleado = FXCollections.observableArrayList(empleadoControl.findTrabajadorEntities());
        //System.out.println(listCalzado.get(1).getFechaRegInv());
        tlbEmpleado.setItems(listEmpleado);

        clmnId.setCellValueFactory(new PropertyValueFactory<Calzado, String>("idTrabajador"));
        clmnNombre.setCellValueFactory(new PropertyValueFactory<Calzado, String>("nomCompleto"));
        clmnCargo.setCellValueFactory(new PropertyValueFactory<Calzado, String>("cargo"));
        clmnDireccion.setCellValueFactory(new PropertyValueFactory<Calzado, String>("direccion"));
        clmnEdad.setCellValueFactory(new PropertyValueFactory<Calzado, Number>("edad"));
    }
    

    
    @FXML
    public void cancelar(){
        txtCategoria.setText(null);
        txtMarca.setText(null);
        txtModelo.setText(null);
        txtColor.setText(null);
        txtPrecio.setText(null);
        idEmp.setText(null);
        nombre.setText(null);
        cargo.setText(null);
        direccion.setText(null);
        edad.setText(null);
        agregarEmpleado.setDisable(false);
    }

    private Ventanas ventana=new Ventanas();
    @FXML
    public void close(){
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Cerrar Sesión");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro se cerrar sesión");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            ventana.inicio();
        }
        
    }
    
    private String carEdad;
            
    @FXML
    public void delimitTextField(){
        limitTextField(idEmp, 6);
        limitTextField(cargo, 25);
        limitTextField(edad,2);
        
    }
    

    public static void limitTextField(TextField textField, int limit) {
        UnaryOperator<Change> textLimitFilter = change -> {
            if (change.isContentChange()) {
                int newLength = change.getControlNewText().length();
                if (newLength > limit) {
                    String trimmedText = change.getControlNewText().substring(0, limit);
                    change.setText(trimmedText);
                    int oldLength = change.getControlText().length();
                    change.setRange(0, oldLength);
                }
            }
            return change;
        };
        textField.setTextFormatter(new TextFormatter(textLimitFilter));
    }
    Trabajador empleado=new Trabajador();
    @FXML
    private void guardarEmpleado() throws Exception{
        Trabajador empleado=new Trabajador();
        if (Integer.parseInt(edad.getText()) > 18) {
            String id = idEmp.getText();
            String nombreEmp = nombre.getText();
            String cargoEmp = cargo.getText();
            String dir = direccion.getText();
            String age = edad.getText();

            empleado.setIdTrabajador(id);
            empleado.setNomCompleto(nombreEmp);
            empleado.setCargo(cargoEmp);
            empleado.setDireccion(dir);
            empleado.setEdad(Integer.parseInt(age));
            empleadoControl.create(empleado);
            mostrarTablaEmpleados();
            Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("Exito");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("Se agrego con exito");
            Optional<ButtonType> result = boxAlert.showAndWait();
        } else {
            Alert boxAlert = new Alert(Alert.AlertType.INFORMATION);
            boxAlert.setTitle("");
            boxAlert.setHeaderText(null);
            boxAlert.initStyle(StageStyle.UTILITY);
            boxAlert.setContentText("No puedes Registrar a menores de edad, debido a la ley federal de trabajo");
            Optional<ButtonType> result = boxAlert.showAndWait();
        }

    }
    
    @FXML
    public void eliminarEmpleado() throws IllegalOrphanException, NonexistentEntityException{
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Eliminar Empleado");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro de eliminar el empleado");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            empleadoControl.destroy(idEmp.getText());
            mostrarTablaEmpleados();
            cancelar();
            
        }
        
    }
    
    @FXML Button agregarEmpleado;
    
    Calzado calzadoDel=new Calzado();
    @FXML
    public void selectItem(){
        calzadoDel=tlbInv.getSelectionModel().getSelectedItem();

        txtCategoria.setText(calzadoDel.getCategoria());
        txtMarca.setText(calzadoDel.getMarca());
        txtModelo.setText(calzadoDel.getModelo());
        txtColor.setText(calzadoDel.getColor());
        txtPrecio.setText(String.valueOf(calzadoDel.getPrecio()));
        
    }
    
    
    @FXML
    public void selectItemEmpleado(){
        empleado=tlbEmpleado.getSelectionModel().getSelectedItem();
        
        idEmp.setText(empleado.getIdTrabajador());
        nombre.setText(empleado.getNomCompleto());
        cargo.setText(empleado.getCargo());
        direccion.setText(empleado.getDireccion());
        edad.setText(String.valueOf(empleado.getEdad()));
        
    }
    
    @FXML
    public void eliminarCalzado() throws IllegalOrphanException, NonexistentEntityException{
        
        Alert boxAlert=new Alert(Alert.AlertType.CONFIRMATION);
        boxAlert.setTitle("Eliminar Calzado");
        boxAlert.setHeaderText(null);
        boxAlert.initStyle(StageStyle.UTILITY);
        boxAlert.setContentText("Esta seguro de eliminar calzado");
        Optional<ButtonType> result= boxAlert.showAndWait();
        
        if(result.get()==ButtonType.OK){
            calzadoControl.destroy(calzadoDel.getCodigo());
            mostrarTabla();
        }
    }
    
    private GenerateDocument generate;
    @FXML
    public void generarArchivo() {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("JavaFX Projects");
        //File defaultDirectory = new File("c:/dev/javafx");
        //chooser.setInitialDirectory(defaultDirectory);
        File selectedDirectory = chooser.showDialog(new Stage());
        if (!selectedDirectory.canRead()) {
            selectedDirectory.setReadable(true);
        }
        String ruta=selectedDirectory.getAbsolutePath();
        ruta=ruta+File.separator+"Inventario.xls";
        
        list=new ArrayList<Calzado>();
        list=calzadoControl.findCalzadoEntities();
        generate=new GenerateDocument();
        generate.generateExcel(list, ruta);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        calzadoControl=new CalzadoJpaController();
        empleadoControl=new TrabajadorJpaController();
        controlVenta=new VentaJpaController();
        mostrarTabla();
        mostrarTablaEmpleados();
        mostrarTablaVentas();
    }
    
}