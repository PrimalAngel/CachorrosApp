package puntodeventa;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Dial extends Rectangle{
    Rotate rotate=new Rotate(0,413,240);
    
    public Dial(double body, double tail, double width, Paint fill) {
        super(width, body + tail, fill);
        this.setX(413 - width / 2);
        this.setY(240 - body);
        this.setEffect(new DropShadow());
        this.setArcHeight(width);
        this.setArcWidth(width);
        this.getTransforms().add(rotate);
    }
    
    public void actualizarDial(double angle){
        rotate.setAngle(angle);
    }
}