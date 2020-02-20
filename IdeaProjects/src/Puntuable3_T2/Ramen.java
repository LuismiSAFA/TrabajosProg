package Puntuable3_T2;

public class Ramen extends Noodle{
    public Ramen() {
        super(60, 0.6, "ondulada", "firme", "trigo");
    }
    public String preparacion(){
        String prep = "Cueza el ramen 5 minutos en caldo, añada la carne, los champiñones, el huevo y las verduras.";
        return prep;
    }
    public String tipoHarina () {
        String tipH = "Básicamente hecho de harina de trigo";
        return tipH;
    }

}

