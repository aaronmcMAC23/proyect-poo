
/**
 * Write a description of class num here.
 * 
 * Martínez de la Cruz Aarón
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class num
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: \n");
        int numero = scanner.nextInt();
        if(numero %2 == 0){
            System.out.println("El número es par ");
        }else {
            System.out.println("El numero no es par");
        }
        scanner.close();
    }
}
