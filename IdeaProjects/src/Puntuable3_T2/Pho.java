package Puntuable3_T2;

public class Pho extends Noodle{
    public Pho() {
        super(40, 0.7, "rizada", "gelatinosa", "arroz");
    }
    public String preparacion(){
        String prep = "Hidrate los pho durante 1 hora, para luego cocerlos 1 minuto en caldo. Finalmente sazónelos con cilantro y jalapeños.";
        return prep;
    }
    public String tipoHarina () {
        String tipH = "Básicamente hecho de harina de arroz";
        return tipH;
    }

}

