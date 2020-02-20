package edd;

public class RestauranteImpl implements Restaurante{

    String nombre;
    String localizacion;
    Integer mesas;
    Double dimensiones;
    Integer numtrabajadores;
    Horario horaApe;
    Horario horaCie;
    Boolean mercancía;


    public RestauranteImpl(String nom, String local,Integer mess,Double dim,
                     Integer numtrab, Horario hape,Horario hcie,Boolean merc) {
        nombre = nom;
        localizacion = local;
        mesas = mess;
        dimensiones = dim;
        numtrabajadores = numtrab;
        horaApe = hape;
        horaCie = hcie;
        mercancía = merc;

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public Integer getMesas() {
        return mesas;
    }

    @Override
    public Double getDimensiones() {
        return dimensiones;
    }

    @Override
    public Integer getNumtrabajadores() {
        return numtrabajadores;
    }

    @Override
    public Horario getHoraApe() {
        return horaApe;
    }

    @Override
    public Horario getHoraCie() {
        return horaCie;
    }

    @Override
    public Boolean getMercancía() {
        return mercancía;
    }

    @Override
    public Double getAforo() {
        return 1.5*dimensiones;
    }

    @Override
    public void setMesas(Integer NuevoMesas) {
        mesas = NuevoMesas;
    }

    @Override
    public void setNumTrabajadores(Integer NuevoNumtrab) {
        numtrabajadores = NuevoNumtrab;
    }

    @Override
    public void setHoraApe(Horario NuevoHoraApe) {
        horaApe = NuevoHoraApe;
    }

    @Override
    public void setHoraCie(Horario NuevoHoraCie) {
        horaCie = NuevoHoraCie;
    }

    @Override
    public void setMercancía(Boolean NuevoMerca) {
        mercancía = NuevoMerca ;
    }

    public  String toString(){
        String s= nombre + "(" + localizacion + ")" + ". Nuestro establecimiento abre a las " + horaApe.getHora() + ":" + horaApe.getMinutos() + ":" + horaApe.getSegundos() +
                " y cierra a las " + horaCie.getHora() + ":" + horaCie.getMinutos() + ":" + horaCie.getSegundos() + ".";
        return s;
    }
}
