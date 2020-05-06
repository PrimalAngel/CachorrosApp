package puntodeventa;

import Entities.Calzado;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.StageStyle;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class GenerateDocument{
    
    public void generateExcel(List<Calzado> list, String ruta){
        WorkbookSettings conf=new WorkbookSettings();
        conf.setEncoding("ISO-8859-1");
        
        try {
            WritableWorkbook wBook=Workbook.createWorkbook(new File(ruta),conf);
            
            WritableSheet sheet= wBook.createSheet("Inventario", 0);
            
            WritableFont h= new WritableFont(WritableFont.ARIAL,14,WritableFont.NO_BOLD);
            
            WritableCellFormat hFormat= new WritableCellFormat(h);
            
            try {
                sheet.addCell(new jxl.write.Label(0,0,"Codigo",hFormat));
                sheet.addCell(new jxl.write.Label(1,0,"Marca",hFormat));
                sheet.addCell(new jxl.write.Label(2,0,"Modelo",hFormat));
                sheet.addCell(new jxl.write.Label(3,0,"Numero",hFormat));
                sheet.addCell(new jxl.write.Label(4,0,"Color",hFormat));
                sheet.addCell(new jxl.write.Label(5,0,"Fecha de Inventario",hFormat));
                int i=1;
                int j=0;
                while(i<list.size()){
                    while(j<7){
                        switch(j){
                            case 0:
                                sheet.addCell(new jxl.write.Label(j,i,String.valueOf(list.get(i).getCodigo()),hFormat));
                                j++;
                            case 1:
                                sheet.addCell(new jxl.write.Label(j,i,list.get(i).getMarca(),hFormat));
                                j++;
                            case 2:
                                sheet.addCell(new jxl.write.Label(j,i,list.get(i).getModelo(),hFormat));
                                j++;
                            case 3:
                                sheet.addCell(new jxl.write.Label(j,i,String.valueOf(list.get(i).getNumero()),hFormat));
                                j++;
                            case 4:
                                sheet.addCell(new jxl.write.Label(j,i,list.get(i).getColor(),hFormat));
                                j++;
                            case 5:
                                sheet.addCell(new jxl.write.Label(j,i,list.get(i).getFechaRegInv(),hFormat));
                                j++;
                                
                        }
                        
                    }
                    i++;
                }
                
                wBook.write();
                wBook.close();
                
                Alert boxAlertCampos= new Alert(Alert.AlertType.INFORMATION);
                boxAlertCampos.setTitle("Archivo Creado");
                boxAlertCampos.setHeaderText(null);
                boxAlertCampos.initStyle(StageStyle.UTILITY);
                boxAlertCampos.setContentText("El Excel se ha realizado satisfactoriamente");
                boxAlertCampos.showAndWait();
            } catch (WriteException ex) {
                Logger.getLogger(GenerateDocument.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        } catch (IOException ex) {
            Logger.getLogger(GenerateDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}