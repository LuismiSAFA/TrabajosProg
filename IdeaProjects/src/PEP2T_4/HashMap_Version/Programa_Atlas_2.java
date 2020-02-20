package PEP2T_4.HashMap_Version;

import java.util.*;

public class Programa_Atlas_2 {
    int i;
    int opc = 0;
    String pais;
    String capital;
    HashMap<String, String> pais_capital = new HashMap<String, String>();
    Scanner sc = new Scanner(System.in);

    public void OpcionUno2() {
        System.out.println("\nTeclea un País:");
        pais = sc.next();
        System.out.println("Teclea una Capital:");
        capital = sc.next();
        pais_capital.put(pais,capital);
        System.out.println("\t\tNueva entrada incorporada");
    }
    public void OpcionDos2() {
        Iterator it = pais_capital.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pais_capital = (Map.Entry) it.next();
            System.out.println("Pais: " + pais_capital.getKey() + "\t\tCapital: " + pais_capital.getValue());
        }System.out.println("\n\t\tHay " + pais_capital.size() + " elemento/s en el Atlas");
    }


    public void OpcionTres2() throws IllegalArgumentException {
        String busca;
        System.out.println("\nTeclea un País:");
        busca = sc.next();
        try {
            if (!pais_capital.containsKey(busca)) {
                throw new IllegalArgumentException();
            } else {
                    //    System.out.println("\tCapital: " + .get(capital));
                    }
        }catch (IllegalArgumentException iae){
            System.out.println("\tDe este pais no se encuentra capital");
        }
    }
//
//    public void OpcionCuatro2(){
//        String busca;
//        String mod;
//        System.out.println("\nTeclea un País: ");
//        busca = sc.next();
//
//        try {
//            if (!paises.contains(busca)) {
//                throw new IllegalArgumentException();
//            } else {
//                for (i = 0; i < paises.size(); i++) {
//                    if (busca.equals(paises.get(i))) {
//                        capitales.remove(i);
//                        System.out.println("Teclea modificación de capital: ");
//                        mod = sc.next();
//                        capitales.add(i,mod);
//                    } } }
//        }catch (IllegalArgumentException iae){
//            System.out.println("\tDe este pais no se encuentra capital");
//        }}
//
//    public void OpcionCinco2() {
//        String busca;
//
//        System.out.println("\nTeclea un País a eliminar: ");
//        busca = sc.next();
//        try {
//            if (!paises.contains(busca)) {
//                throw new IllegalArgumentException();
//            } else {
//                for (i = 0; i < paises.size(); i++) {
//                    if (busca.equals(paises.get(i))) {
//                        paises.remove(i);
//                        capitales.remove(i);
//                        System.out.println("\t\t"+ busca + " eliminada del Atlas");
//
//                    } } }
//        }catch (IllegalArgumentException iae){
//            System.out.println("\tNo se encuentra el país");
//        }}
//
//    public void OpcionSeis2() {
//        paises.clear();
//        capitales.clear();
//        System.out.println("\tEliminado el Atlas por completo");
//    }
}
