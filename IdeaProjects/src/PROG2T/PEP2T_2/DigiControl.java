package PROG2T.PEP2T_2;

public class DigiControl {

        public void verificaDigitos (String nBanco,String nSucursal,String digcontrl,String nCuenta, String digicontrol1,String digicrontrol2){

            System.out.println("\nNúmero de cuenta a validar: " +
                    nBanco + " " + nSucursal + " " + digcontrl + " " + nCuenta);

            if (Integer.parseInt(String.valueOf(digcontrl.charAt(0))) ==
                    Integer.parseInt(String.valueOf(digicontrol1))
                    & Integer.parseInt(String.valueOf(digcontrl.charAt(1))) ==
                    Integer.parseInt(String.valueOf(digicrontrol2))) {

                System.out.println("Dígitos calculados: " +
                        digicontrol1 + digicrontrol2 +
                        "\t\tVerificación: Correcta");

            } else {
                System.out.println("Dígitos calculados: " +
                        digicontrol1 + digicrontrol2 +
                        "\t\tVerificación: Incorrecta");
            }

        }

        public String calculaDigitos1(String numBanco, String numsucursal){
            int i,acum= 0;
            int multi,rest;
            String[] numeros = {"1","2","4","8","5","10","9","7","3","6"};
            String result = "00"+numBanco+numsucursal;
            for(i=0;i<result.length();i++){
                int num = Integer.parseInt(String.valueOf(result.charAt(i)));
                int mult = Integer.parseInt(numeros[i]);
                multi = num * mult;
                acum += multi;
            }
           rest = acum%11;
           int dig1 = 11-rest;
           String digito1 = String.valueOf(dig1);
           return digito1;
        }

        public String calculaDigitos2(String numCuenta){
            int i,acum= 0;
            int multi,rest;
            String[] numeros = {"1","2","4","8","5","10","9","7","3","6"};
            for(i=0;i<numCuenta.length();i++){
            int num = Integer.parseInt(String.valueOf(numCuenta.charAt(i)));
            int mult = Integer.parseInt(numeros[i]);
            multi = num * mult;
            acum += multi;
            }
          rest = acum%11;
          int dig2 = 11-rest;
          String digito2 = String.valueOf(dig2);
          return digito2;
        }
}