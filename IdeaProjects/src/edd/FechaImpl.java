package edd;

public class FechaImpl implements Fecha{
   private Integer dia;
   private Integer mes;
   private Integer anio;

    public FechaImpl(Integer day, Integer month, Integer year){
        dia = day;
        mes = month;
        anio = year;
    }

    @Override
    public Integer getDia() {
        return dia;
    }

    @Override
    public Integer getMes() {
        return mes;
    }

    @Override
    public Integer getAnio() {
        return anio;
    }
    public  String toString(){
        String s= dia + "/" + mes + "/" + anio;
        return s;
    }
}
