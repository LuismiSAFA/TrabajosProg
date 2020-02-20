package PEP2T_4.Array_Version;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilotAtlas {
    public static void main(String[] args) throws Exception {
        boolean continua;
        int opc = 0;
        Programa_Atlas atlas = new Programa_Atlas();
        Scanner sc = new Scanner(System.in);
        while (opc <= 6) {

            System.out.println("\n\t\t\t\t\t\t\t\t\t\tPROGRAMA ATLAS");
            System.out.println("\t\t\t\t\t\t\t\t\t=====================\n");
            System.out.println("\t\t1.Añadir una entrada al atlas           2.Mostrar el contenido actual del atlas");
            System.out.println("\t\t3.Buscar una entrada del atlas          4.Modificar una entrada del atlas");
            System.out.println("\t\t5.Eliminar una entrada del atlas        6.Eliminar el contenido completo del atlas");
            System.out.println("\t\t7.Salir ");

            do {
                try {
                   continua = false;
                    System.out.print("\n\t\t\t\t\tTeclea una de las opciones: ");
                    opc = sc.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar obligatoriamente un número entero.");
                    sc.nextLine();
                    continua = true;
               }
            } while (continua);

            switch (opc) {
                case 1:
                    atlas.OpcionUno();
                    break;
                case 2:
                    atlas.OpcionDos();
                    break;
                case 3:
                    atlas.OpcionTres();
                    break;
                case 4:
                    atlas.OpcionCuatro();
                    break;
                case 5:
                    atlas.OpcionCinco();
                    break;
                case 6:
                    atlas.OpcionSeis();
                    break;
            }
        }
    }
}