package PROG2T.PEP2T_2;

public class DigiIban {
    
    public String calculaIban(String cad){
        String numIban;
        int restoint = 98 - mod97(cad);
        if(0<restoint & restoint<9){
            numIban = "0" + restoint;
        }else{
            numIban = Integer.toString(restoint);
        }
        return numIban;
    }
    public int mod97(String cad){
        int resto = 0;
        for (int i = 0; i<cad.length(); i++){
            resto = (resto *10 + Character.getNumericValue(cad.charAt(i)))%97;
        }
        return resto;
    }

    public void validaIban(String nBanco, String nSucursal, String digcontrl, String nCuenta, String iban){
        String cad = nBanco+nSucursal+digcontrl+nCuenta+"1428"+"00";
        String Iban = calculaIban(cad);
        System.out.println("\nNúmero de cuenta a validar: "+"ES" + iban + " " +  nBanco + " " + nSucursal + " " + digcontrl + " " + nCuenta);
        if(Integer.parseInt(String.valueOf(Iban))==
                Integer.parseInt(String.valueOf(iban))){

            System.out.println("Dígitos calculados: "+
                    Iban + "\t\tVerificación: Correcta");

        }else{
            System.out.println("Dígitos calculados: " +
                    Iban + "\t\tVerificación: Incorrecta");
        }
    }
}
