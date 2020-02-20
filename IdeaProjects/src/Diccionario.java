import java.util.HashMap;

public class Diccionario {
    public static void main(String[] args) {
// Así se genera un objeto HashMap llamado diccionario con clave y valor de tipo String en este caso
        HashMap<String, String> diccionario = new HashMap<String, String>();
// Añadiendo claves y valores (palEspañol, palInglés)
        diccionario.put("Hola", "Hello");
        diccionario.put("Adiós", "Goodbye");
        diccionario.put("Bienvenido", "Welcome");
        diccionario.put("Gracias", "Thank you");
// Mostrando el contenido del diccionario a las bravas
// en formato {Hola=Hello, Adiós=Goodbye, ..., ...}
        System.out.println(diccionario);
// Obtención del valor según la clave señalada
        System.out.println("En inglés se dice: "+diccionario.get("Hola"));
// Modifica el valor asociado a una clave señalada
        diccionario.replace("Hola", "Hi");
// Mostrando de nuevo el contenido del diccionario a las bravas
// en formato {Hola=Hi, Adiós=Goodbye, ..., ...}
        System.out.println(diccionario);
// Elimina la entrada clave/valor señalada
        diccionario.remove("Adiós");
// Mostrando de nuevo el contenido del diccionario a las bravas
// en formato {Hola=Hi, ..., ...}
        System.out.println(diccionario);
// Elimina la totalidad del diciconario
        diccionario.clear();
    }
}