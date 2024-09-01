
/**
 * Write a description of class calificaciones here.
 * 
 * Martínez de la Cruz Aarón 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class calificaciones
{
    public static void main( String [] args) {
        Scanner scanner = new Scanner(System.in);
        float  promedio, suma;
        System.out.print("Ingrese el numero de calificaciones a ingresar: \n");
        int n = scanner.nextInt();
        suma = 0;
        for(int i=1; i <= n; i++){
            System.out.print("Ingrese calificacion:"+ i +":");
            float calf = scanner.nextFloat();
            suma += calf;
        }
        promedio = suma / n;
        System.out.print("El promedio de las " + n + " calificaciones es: "+ promedio);
    }

}
