package Puntuable3_T2;

public class Noodle {
    Integer longitud;
    Double grosor;
    String forma;
    String textura;
    String harinaBase;

    public Noodle(int longitud, double grosor, String forma, String textura, String harinaBase) {
        this.longitud = longitud;
        this.grosor = grosor;
        this.forma = forma;
        this.textura = textura;
        this.harinaBase = harinaBase;
    }

    public String preparacion(){
        String prep = "";
        return prep;
    }

    public String tipoHarina () {
        String tipH = "";
        return tipH;
    }

    public static void main(String[] args) {
        int i;
        Noodle[] pasta = new Noodle[3];

        Noodle spagueti = new Spaghettis();
        Noodle ramen = new Ramen();
        Noodle pho = new Pho();

        pasta[0] = spagueti;
        pasta[1] = ramen;
        pasta[2] = pho;

        for(i=0;i<pasta.length;i++){
            System.out.println("\n" + pasta[i].preparacion() +
                    "\n\t\t" + pasta[i].tipoHarina());
        }
    }
}


