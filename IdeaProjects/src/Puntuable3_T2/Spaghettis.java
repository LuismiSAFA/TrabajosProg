package Puntuable3_T2;

public class Spaghettis extends Noodle {
    public Spaghettis() {
        super(20, 0.3, "estirada", "suave", "sémola");
    }
    public String preparacion(){
        String prep = "Cueza los spaghettis, de 8 a 10 minutos y añada la salsa al gusto, queso o aceite y ajo.";
        return prep;
}
    public String tipoHarina () {
        String tipH = "Básicamente hecho de harina de sémola";
        return tipH;
    }

}
