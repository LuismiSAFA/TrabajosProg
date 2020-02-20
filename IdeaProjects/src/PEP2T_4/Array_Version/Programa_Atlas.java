package PEP2T_4.Array_Version;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa_Atlas {
    int i;
    String busca;
    String pais;
    String capital;
    ArrayList<String> paises = new ArrayList<String>();
    ArrayList<String> capitales = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);


    public void OpcionUno() {
        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        pais = sc.next();
        System.out.print("\t\t\t\t\t\t\t\t\tTeclea una Capital: ");
        capital = sc.next();
        paises.add(pais);
        capitales.add(capital);
        System.out.println("\t\t\t\t\t\t\t\t Nueva entrada incorporada");
    }

    public void OpcionDos() {
        System.out.println("\n");
        for (i = 0; i < paises.size(); i++) {
            System.out.println("\t\t\t\t\t\t\t\t\tPais: " + paises.get(i) + "\t\tCapital: " + capitales.get(i));
        }
        System.out.println("\n\t\t\t\t\t\t\t\t Hay " + paises.size() + " elemento/s en el Atlas");
    }

    public void OpcionTres() throws IllegalArgumentException {

        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        busca = sc.next();
        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        System.out.println("\t\t\t\t\t\t\t\t\tCapital: " + capitales.get(i));
                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\tDe este pais no se encuentra capital");
        }
}

    public void OpcionCuatro(){

        String mod;
        System.out.print("\n\t\t\t\t\t\t\t\t\tTeclea un País: ");
        busca = sc.next();

        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        capitales.remove(i);
                        System.out.print("\t\t\t\t\t\t\t\t\tTeclea modificación de capital: ");
                        mod = sc.next();
                        capitales.add(i,mod);
                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\tDe este pais no se encuentra capital");
        }}

    public void OpcionCinco() {


        System.out.print("\n\t\t\t\t\t\t\t\t  Teclea un País a eliminar: ");
        busca = sc.next();
        try {
            if (!paises.contains(busca)) {
                throw new IllegalArgumentException();
            } else {
                for (i = 0; i < paises.size(); i++) {
                    if (busca.equals(paises.get(i))) {
                        paises.remove(i);
                        capitales.remove(i);
                        System.out.println("\t\t\t\t\t\t\t\t\t"+ busca + " eliminada del Atlas");

                    } } }
        }catch (IllegalArgumentException iae){
            System.out.println("\t\t\t\t\t\t\t\t\t No se encuentra el país");
        }}

    public void OpcionSeis() {
        paises.clear();
        capitales.clear();
        System.out.println("\t\t\t\t\t\t\t\tEliminado el Atlas por completo");
    }
}

