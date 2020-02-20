package Puntuables;

import java.util.Scanner;

public class Puntuable1_T2 {
    float saldo;

    public static void main (String[] args) {
        int opc = 0;
        Puntuable1_T2 cuenta = new Puntuable1_T2();
        float cantidad;

        cuenta.saldo = Float.parseFloat(args[0]);


        System.out.println("\t\t\t\tPROGRAMA CAJERO AUTOMÁTICO\t\t\t\t");
        Scanner sc = new Scanner(System.in);
        float maximo = Float.parseFloat(args[1]);
        while (opc<=2){
            System.out.println("\n\t\t\t\t\tMenú de opciones");
            System.out.println("\t\t\t\t\t================\n");
            System.out.println("\t\t1) Retirada de dinero");
            System.out.println("\t\t2) Ingreso de dinero");
            System.out.println("\t\t3) Salir");
            System.out.print("\n\t\t\t\t\tOpción: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("");
                    cuenta.consulta(cuenta.saldo);
                    System.out.println("Teclee dinero a retirar:");
                    do{
                        cantidad = sc.nextFloat();
                    }while(cantidad<=0);
                    if(cuenta.saldo-cantidad>=Float.parseFloat(args[0])-maximo){
                        cuenta.saldo = cuenta.retirar(cantidad,cuenta.saldo,maximo);
                    }else{
                        System.out.println("Intenta retirar " + cantidad + "€");
                        System.out.println("Tiene establecido un tope diario de " + maximo + "€ ");
                        break;
                    }
                    break;

                case 2:
                    cuenta.consulta(cuenta.saldo);
                    System.out.println("Teclee dinero a ingresar:");
                    cantidad = sc.nextFloat();
                    cuenta.saldo= cuenta.ingresar(cantidad,cuenta.saldo);
                    break;
            }
            cuenta.consulta(cuenta.saldo);
        }
    }

    public void consulta(float fsaldo){
        System.out.println("Su saldo actual es "+ fsaldo + "€");
    }


    public float retirar(float fcantidad,float fsaldo,float maximo){
        if(fcantidad>maximo) {
            System.out.println("Intenta retirar " + fcantidad + "€");
            System.out.println("Tiene establecido un tope de " + maximo + "€");
            fcantidad=0;
        }else{
            System.out.println("Usted retiró " + fcantidad + "€" );
        }
        return fsaldo-fcantidad;
    }

    public float ingresar(float fcantidad,float fsaldo){
        System.out.println("Usted ingresó " + fcantidad + "€");
        return fsaldo+fcantidad;
    }
}