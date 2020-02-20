package PEP2T_4.HashMap_Version;

import PEP2T_4.Array_Version.Programa_Atlas;

import java.util.Scanner;

public class PilotAtlas_2 {
    public static void main(String[] args) throws Exception {
        int opc = 0;
        Programa_Atlas_2 atlas1 = new Programa_Atlas_2();
        Scanner sc = new Scanner(System.in);
        while (opc <= 6) {

            System.out.println("\n\t\t\t\t\t\t\t\t\t\tPROGRAMA ATLAS");
            System.out.println("\t\t\t\t\t\t\t\t\t=====================\n");
            System.out.println("\t\t1.Añadir una entrada al atlas           2.Mostrar el contenido actual del atlas");
            System.out.println("\t\t3.Buscar una entrada del atlas          4.Modificar una entrada del atlas");
            System.out.println("\t\t5.Eliminar una entrada del atlas        6.Eliminar el contenido completo del atlas");
            System.out.println("\t\t7.Salir ");

            System.out.print("\n\t\t\t\t\tTeclea una de las opciones: ");
            opc = sc.nextInt();


            switch (opc) {
                case 1:
                    atlas1.OpcionUno2();
                    break;
                case 2:
                    atlas1.OpcionDos2();
                    break;
                case 3:
                    atlas1.OpcionTres2();
                    break;
//                case 4:
//                    atlas1.OpcionCuatro2();
//                    break;
//                case 5:
//                    atlas1.OpcionCinco2();
//                    break;
//                case 6:
//                    atlas1.OpcionSeis2();
//                    break;
            }
        }
    }
}
