package edd;

public interface Vuelo {

    String  getCodVuelo();
    String getDestino();
    Double getPrecio();
    Integer getNumPlazas();
    Integer getNumPasajeros();
    Fecha getFechaSalida();
    Double recaudacion();
    Persona piloto();


    void setPrecio(Double nuevoPrecio);
    void setNumpasajeros(Integer nuevoPasajeros);
}
