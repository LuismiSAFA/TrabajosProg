package PuntoPlano;

public class TestPunto {
    public static void main (String[] args) {
        Punto punto1 = new PuntoImpl(2, 3);
        Punto punto2 = new PuntoImpl(3, 4);
        Punto punto3 = new PuntoImpl(punto1.getX() + punto2.getX(), punto1.getY() + punto2.getY());

        System.out.println("Las coordenadas del Punto 1 son x:" + punto1.getX() + ", y:" + punto1.getY());
        System.out.println("Las coordenadas del Punto 2 son x:" + punto2.getX() + ", y:" + punto2.getY());
        System.out.println("Las coordenadas del Punto 3 resultado de la suma del 1 y 2 son x:" + punto3.getX() + ", y:" + punto3.getY());
        System.out.println("La distancia entre el punto 1 y 2 es: " + Math.sqrt(((punto2.getX() ^ 2) - (punto1.getX() ^ 2))
                + ((punto2.getY() ^ 2) - (punto1.getY() ^ 2))) + " u");
    }
}
