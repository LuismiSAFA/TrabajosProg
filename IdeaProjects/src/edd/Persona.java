package edd;

public interface Persona {
    String getNombre();
    String getApellidos();
    String getDni();
    Integer getEdad();
    Double getAltura();
    Double getPeso();

    //métodos modificables
    void setNombre(String nom);
    void setApellidos(String ape);
    void setAltura(Double a1);
    void setPeso(Double p1);
}
