
/**
 * Write a description of class AñoBisiesto here.
 * 
 * Martínez de la Cruz Aarón
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AñoBisiesto
{
    public static void main (String [] srgs) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el año de su elección: ");
        int anio = scanner.nextInt();
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio %400 ==0)){
            System.out.println(anio+ " es un año bisiesto ");
        } else {
            System.out.println(anio+ " no es un año bisiesto ");
        }
    }
}
