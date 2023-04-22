package ej3.pkg2;
import java.util.Scanner;

public class Ej32 {

    public static void main(String[] args) {
        
        /*Determine el valor de Y= X*C-2 donde C es una constante con valor C=2.5.
        b) Considerando a X un valor cualquiera */
     
        Scanner teclado =  new Scanner(System.in);
        double x, c, y;
        
        System.out.println("Ingrese el Valor de X y presiona ENTER: ");
        x = teclado.nextDouble();
        c = 2.5;

        y = x * c - 2;

        System.out.println("El valor de Y es: " + y);

        
    }
    
}
