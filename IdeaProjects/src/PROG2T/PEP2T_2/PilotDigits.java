package PROG2T.PEP2T_2;

import java.util.Scanner;

public class PilotDigits {
    public static void main(String[] args) {
        String nCuenta;
        String nBanco;
        String nSucursal;
        String digcontrl;
        String iban;
        String digicontrol1, digicrontrol2;

        int opc=0 ;

        while (opc <= 4) {

            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t\t\t\t\tMenú de opciones");
            System.out.println("\t\t\t\t\t================\n");
            System.out.println("\t\t1) Generación dígitos de control");
            System.out.println("\t\t2) Validación dígitos de control");
            System.out.println("\t\t3) Generación de IBAN");
            System.out.println("\t\t4) Validación de IBAN ");
            System.out.println("\t\t5) Salir ");
            System.out.print("\n\t\t\t\t\tOpción: ");
                opc = sc.nextInt();
            Scanner leer = new Scanner(System.in);

            switch (opc) {
                case 1:
                    System.out.println("\n\t\t   Generación dígitos de control\n");
                    DigiControl cuenta1 = new DigiControl();
                    System.out.println("Introduzca su número de banco: ");
                        nBanco = leer.nextLine();
                        if(nBanco.length()!=4){
                            System.out.println("Introduzca unos numeros válidos (Son 4)");
                        }else {
                            System.out.println("Introduzca su número de sucursal: ");
                            nSucursal = leer.nextLine();
                            if(nSucursal.length()!=4){
                                System.out.println("Introduzca unos numeros válidos (Son 4)");
                            }else{
                                System.out.println("Introduzca su número de cuenta: ");
                                nCuenta = leer.nextLine();
                                if(nCuenta.length()!=10){
                                    System.out.println("Introduzca unos numeros válidos (Son 10)");
                                }else{
                                    digicontrol1 = cuenta1.calculaDigitos1(nBanco, nSucursal);
                                    digicrontrol2 = cuenta1.calculaDigitos2(nCuenta);
                                    System.out.println("\n" + nBanco + " " + nSucursal + " " + digicontrol1 + digicrontrol2 + " " + nCuenta );
                                }
                            }
                        }break;

                case 2:
                    System.out.println("\n\t\t   Validación dígitos de control\n");
                    DigiControl cuenta2 = new DigiControl();
                    System.out.println("Introduzca su número de banco: ");
                    nBanco = leer.nextLine();
                    if(nBanco.length()!=4){
                        System.out.println("Introduzca unos numeros válidos (Son 4)");
                    }else {
                        System.out.println("Introduzca su número de sucursal: ");
                        nSucursal = leer.nextLine();
                        if (nSucursal.length() != 4) {
                            System.out.println("Introduzca unos numeros válidos (Son 4)");
                        } else {
                            System.out.println("Introduzca su número de cuenta: ");
                            nCuenta = leer.nextLine();
                            if (nCuenta.length() != 10) {
                                System.out.println("Introduzca unos numeros válidos (Son 10)");
                            } else {
                                System.out.println("Introduzca números de control: ");
                                digcontrl = leer.nextLine();
                            if (digcontrl.length()!=2){
                                System.out.println("Introduzca unos numeros válidos (Son 2)");
                            }else{
                                digicontrol1 = cuenta2.calculaDigitos1(nBanco, nSucursal);
                                digicrontrol2 = cuenta2.calculaDigitos2(nCuenta);
                                cuenta2.verificaDigitos(nBanco, nSucursal, digcontrl, nCuenta, digicontrol1, digicrontrol2);
                            }
                            }
                        }
                    }break;

                case 3:
                    System.out.println("\n\t\t   Generación de IBAN\n");
                    System.out.println("Introduzca su número de banco: ");
                        nBanco = leer.nextLine();
                    if(nBanco.length()!=4){
                        System.out.println("Introduzca unos numeros válidos (Son 4)");
                    }else {
                        System.out.println("Introduzca su número de sucursal: ");
                        nSucursal = leer.nextLine();
                        if (nSucursal.length() != 4) {
                            System.out.println("Introduzca unos numeros válidos (Son 4)");
                        } else {
                            System.out.println("Introduzca su número de cuenta: ");
                            nCuenta = leer.nextLine();
                            if (nCuenta.length() != 10) {
                                System.out.println("Introduzca unos numeros válidos (Son 10)");
                            } else {
                                System.out.println("Introduzca números de control: ");
                                digcontrl = leer.nextLine();
                                if (digcontrl.length() != 2) {
                                    System.out.println("Introduzca unos numeros válidos (Son 2)");
                                } else {
                                    String cad = nBanco + nSucursal + digcontrl + nCuenta + "1428" + "00";
                                    DigiIban cuenta3 = new DigiIban();
                                    iban = cuenta3.calculaIban(cad);
                                    System.out.println("\nES" + iban + " " + nBanco + " " + nSucursal + " " + digcontrl + " " + nCuenta);
                                }
                            }
                        }
                    } break;

                case 4:
                    System.out.println("\n\t\t   Validación de IBAN \n");
                    System.out.println("Introduzca su número de banco: ");
                        nBanco = leer.nextLine();
                    if(nBanco.length()!=4){
                        System.out.println("Introduzca unos numeros válidos (Son 4)");
                    }else {
                        System.out.println("Introduzca su número de sucursal: ");
                        nSucursal = leer.nextLine();
                        if (nSucursal.length() != 4) {
                            System.out.println("Introduzca unos numeros válidos (Son 4)");
                        } else {
                            System.out.println("Introduzca su número de cuenta: ");
                            nCuenta = leer.nextLine();
                            if (nCuenta.length() != 10) {
                                System.out.println("Introduzca unos numeros válidos (Son 10)");
                            } else {
                                System.out.println("Introduzca números de control: ");
                                digcontrl = leer.nextLine();
                                if (digcontrl.length() != 2) {
                                    System.out.println("Introduzca unos numeros válidos (Son 2)");
                                } else {
                                    System.out.println("Introduzca IBAN: ");
                                    iban = leer.nextLine();
                                    if (iban.length() != 2) {
                                        System.out.println("Introduzca unos numeros válidos (Son 2)");
                                    } else {
                                        DigiIban cuenta4 = new DigiIban();
                                        cuenta4.validaIban(nBanco, nSucursal, digcontrl, nCuenta, iban);
                                    }
                                }
                            }
                        }
                    }break;
            }
        }
    }
}


