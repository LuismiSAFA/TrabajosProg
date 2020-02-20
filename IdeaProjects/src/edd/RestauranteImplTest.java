package edd;


class RestauranteImplTest {

    public static void main (String[] args) {
        Horario horaApe = new HorarioImpl(8, 00,00) {
        };
        Horario horaCie = new HorarioImpl(16, 30,00) {
        };
       Restaurante rest1 = new RestauranteImpl("La Gorda de Calatrava ","Sevilla",25,60.6,20,horaApe,horaCie,Boolean.TRUE);
        System.out.println(rest1);
    }

}