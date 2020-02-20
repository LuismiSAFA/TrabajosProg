package edd;

public class HorarioImpl implements Horario{
    Integer hora;
    Integer minutos;
    Integer segundos;

    public HorarioImpl( Integer h, Integer m,Integer s) {
        hora = h;
        minutos = m;
        segundos = s;
    }

    @Override
    public Integer getHora() {
        return hora;
    }

    @Override
    public Integer getMinutos() {
        return minutos;
    }

    @Override
    public Integer getSegundos() {
        return segundos;
    }

    @Override
    public void setHora(Integer NuevaHora) {
        hora = NuevaHora;
    }

    @Override
    public void setMinutos(Integer NuevoMin) {
        minutos = NuevoMin;
    }

    @Override
    public void setSegundos(Integer NuevoSegundos) {
        segundos = NuevoSegundos;
    }
}
