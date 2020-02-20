package edd;

public class VueloImpl_Test {
    public static void main (String[] args) {
        Fecha fecha1 = new FechaImpl(1,1,2020);
        Vuelo vuelo1 = new VueloImpl("IB2349","Sevilla",60.00,150,120,fecha1);
        System.out.println(vuelo1);
    }
}
