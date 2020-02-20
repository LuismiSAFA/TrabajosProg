package PEP2T_4.Array_Version;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa_Atlas {
    int i;
    int opc = 0;
    String pais;
    String capital;
    ArrayList<String> paises = new ArrayList<String>();
    ArrayList<String> capitales = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);


    public void OpcionUno() {
        System.out.println("\nTeclea un País:");
        pais = sc.next();
        System.out.println("Teclea una Capital:");
        capital = sc.next();
        paises.add(pais);
        capitales.add(capital);
        System.out.println("\t\tNueva entrada incorporada");
    }

    public void OpcionDos() {
        System.out.println("\n");
        for (i = 0; i < paises.size(); i++) {
            System.out.println("Pais: " + paises.get(i) + "\t\tCapital: " + capitales.get(i));
        }
        System.out.println("\n\t\tHay " + paises.size() + " elemento/s en el Atlas");
    }

    public void OpcionTres() throws IllegalArgumentException {
        String busca;
        System.out.println("\nTeclea un País:");
        busca = sc.next();
        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        System.out.println("\tCapital: " + capitales.get(i));
                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\tDe este pais no se encuentra capital");
        }
}

    public void OpcionCuatro(){
        String busca;
        String mod;
        System.out.println("\nTeclea un País: ");
        busca = sc.next();

        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        capitales.remove(i);
                        System.out.println("Teclea modificación de capital: ");
                        mod = sc.next();
                        capitales.add(i,mod);
                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\tDe este pais no se encuentra capital");
        }}

    public void OpcionCinco() {
        String busca;

        System.out.println("\nTeclea un País a eliminar: ");
        busca = sc.next();
        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        paises.remove(i);
                        capitales.remove(i);
                        System.out.println("\t\t"+ busca + " eliminada del Atlas");

                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\tNo se encuentra el país");
        }}

    public void OpcionSeis() {
        paises.clear();
        capitales.clear();
        System.out.println("\tEliminado el Atlas por completo");
    }
}

