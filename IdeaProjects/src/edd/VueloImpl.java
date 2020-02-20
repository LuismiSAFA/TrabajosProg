package edd;

public class VueloImpl implements Vuelo{
    String codVuelo;
    String destino;
    Double precio;
    Integer numPlazas;
    Integer numPasajeros;
    Fecha fecha;
    Persona piloto;


    public VueloImpl(String cdv1, String dest,Double prec,Integer numPl,
                     Integer numPas, Fecha fecsa) {
        codVuelo = cdv1;
        destino = dest;
        precio = prec;
        numPlazas = numPl;
        numPasajeros = numPas;
        fecha = fecsa;

    }

    @Override
    public String getCodVuelo() {
        return codVuelo;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public Integer getNumPlazas() {
        return numPlazas;
    }

    @Override
    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public Fecha getFechaSalida() {
        return fecha;
    }

    @Override
    public Double recaudacion() {
        return precio*numPasajeros;
    }

    @Override
    public Persona piloto() {
        return piloto;
    }

    @Override
    public void setPrecio(Double nuevoPrecio) {
            precio = nuevoPrecio;
    }

    @Override
    public void setNumpasajeros(Integer nuevoPasajeros) {
            numPasajeros = nuevoPasajeros;
    }


}
