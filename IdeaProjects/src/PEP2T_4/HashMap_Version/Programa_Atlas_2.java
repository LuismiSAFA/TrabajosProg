package PEP2T_4.HashMap_Version;

import java.util.*;


public class Programa_Atlas_2 {
    String pais;
    String busca;
    String capital;
    HashMap<String, String> pais_capital = new HashMap<String, String>();
    Scanner sc = new Scanner(System.in);

    public void OpcionUno2() {
        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        pais = sc.next();
        System.out.print("\t\t\t\t\t\t\t\t\tTeclea una Capital: ");
        capital = sc.next();
        pais_capital.put(pais,capital);
        System.out.println("\t\t\t\t\t\t\t\t Nueva entrada incorporada");
    }
    public void OpcionDos2() {
        Iterator it = pais_capital.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pais_capital = (Map.Entry) it.next();
            System.out.println("\t\t\t\t\t\t\t\t\tPais: " + pais_capital.getKey() + "\t\tCapital: " + pais_capital.getValue());
        }System.out.println("\n\t\t\t\t\t\t\t\t Hay " + pais_capital.size() + " elemento/s en el Atlas");
    }


    public void OpcionTres2() throws IllegalArgumentException {
        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        busca = sc.next();
        try {
            if (!pais_capital.containsKey(busca)) {
                throw new IllegalArgumentException();
            } else {
                        System.out.println("\t\t\t\t\t\t\t\t\tCapital: " + pais_capital.get(busca));
                    }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\tDe este pais no se encuentra capital");
        }
    }

    public void OpcionCuatro2(){
        String mod;
        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        busca = sc.next();

        try {
            if (!pais_capital.containsKey(busca)) {
                throw new IllegalArgumentException();
            } else {
                        System.out.print("\t\t\t\t\t\t\t\t\tTeclea modificación de capital: ");
                        mod = sc.next();
                        pais_capital.replace(busca,mod);
                        System.out.println("\t\t\t\t\t\t\t\t\tEntrada modificada");
                    }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\tDe este pais no se encuentra capital");
        }}

    public void OpcionCinco2() {
        System.out.print("\n\t\t\t\t\t\t\t\tTeclea un País a eliminar: ");
        busca = sc.next();
        try {
            if (!pais_capital.containsKey(busca)) {
                throw new IllegalArgumentException();
            } else {
                        pais_capital.remove(busca);
                        System.out.println("\t\t\t\t\t\t\t\t\t"+ busca + " eliminada del Atlas");

                    }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\tNo se encuentra el país");
        }}

    public void OpcionSeis2() {
        pais_capital.clear();
        System.out.println("\t\t\t\t\t\t\t\tEliminado el Atlas por completo");
    }
}
