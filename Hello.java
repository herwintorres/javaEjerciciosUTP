//import java.io.BufferedReader;
//import java.util.Scanner;
class Hello{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Hola Mundo desde java");
        int x = 0;//int
        String nombre = "Angel";//string 
        double a = 3.5;
        boolean nuevo = true;
        int[] datos;
        var apellido = "Torres";
        if (nuevo){
            System.out.println(nombre + " "+apellido+" Nota: " + a);
        }
        //System.out.println("Por favor ingrese su Apodo: ");
        //String apodo = sc.nextLine();
        //System.out.println(apodo);
        /**
         * Estructuras de control
         */
        //Estructura IF
        int h = 50;
        if(h > 50 & h < 60){
            System.out.println("El número es mayor a 50");
        }else if(h == 50){
            System.out.println("El numero es igual a 50");
        }else{
            System.out.println("El numero es menor a 50");
        }
        
    }
}