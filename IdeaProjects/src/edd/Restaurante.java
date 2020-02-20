package edd;

public interface Restaurante {
    String getNombre();
    String getLocalizacion();
    Integer getMesas();
    Double getDimensiones();
    Integer getNumtrabajadores();
    Horario getHoraApe();
    Horario getHoraCie();
    Boolean getMercancía();
    Double getAforo();


    //métodos modificables
    void setMesas(Integer mesas);
    void setNumTrabajadores(Integer numtrab);
    void setHoraApe(Horario horaApe);
    void setHoraCie(Horario horaCie);
    void setMercancía(Boolean merca);

}
