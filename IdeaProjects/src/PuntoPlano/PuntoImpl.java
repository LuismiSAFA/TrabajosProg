package PuntoPlano;

public class PuntoImpl implements Punto {
    //Generación de variables
     Integer x;
     Integer y;

    //Constructor
    public PuntoImpl(Integer x1, Integer y1) {
        x = x1;
        y = y1;
    }

    //Métodos
    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    //Métodos modificables
    public void setX(Integer x1) {
        x = x1;
    }
    public void setY(Integer y1) {
        y = y1;
    }
}
