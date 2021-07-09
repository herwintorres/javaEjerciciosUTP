import java.util.Scanner;
public class Variable {
    public static void main(String[] args){
        int numEntero = 45;
        float numFlotante = 3.45f;
        String cadena = "Hola";
        var numVar = 60;//inferencia de tipos en java
        /*System.out.println(numEntero);
        System.out.println(numFlotante);
        System.out.println(cadena);
        System.out.println(numVar);*/
        //concatenación de string 
        var usuario = "Herwin";
        var titulo = "Ingeniero";
        var union = titulo + " " +usuario;
        //caracteres especiales
        System.out.println(union + numEntero);
        System.out.println("linea espacio : \n"+numFlotante);//salto de linea
        System.out.println("linea tabulacion : \t"+numEntero);//tabulación
        System.out.println("linea retroceso: \b"+titulo);
        System.out.println("Comilla simple: \'"+usuario+"\'");
        System.out.println("comilla doble: \""+usuario+"\"");
        //clase scanner
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario2 = consola.nextLine();
        System.out.println("Su usuario es: \t"+usuario2);
        System.out.println("Escribe su titulo: \n");
        var titulo2 = consola.nextLine();
        System.out.println("Su titulo es: \t"+titulo2);
        //tipos primitivos byte, short, int, long
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        //tipos primitivos de tipoflotante: float y double
        float numFloat = 3.4028235E38F;
        System.out.println("valor minimo de tipo float: "+Float.MIN_VALUE);
        System.out.println("valor maximo de tipo float: "+Float.MAX_VALUE);
        System.out.println("valor minimo de tipo double: "+Double.MIN_VALUE);
        System.out.println("valor maximo de tipo double: "+Double.MAX_VALUE);
    }
}
