
/**
 * Write a description of class promedio here.
 * 
 * Martínez de la Cruz Aarón
* @version (a version number or a date)
 */
import java.io.*;

public class promedio {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double calf;
        double calificacionmasalta;
        double calificacionmasbaja;
        double i;
        double n;
        int opcion;
        double promedio1;
        double suma;
        System.out.println("Ingrese el número de calificaciones a registrar: ");
        n = Double.parseDouble(bufEntrada.readLine());
        suma = 0;
        calificacionmasbaja = 5;
        calificacionmasalta = 10;
        for (i=1; i<=n; ++i) {
            System.out.println("Ingrese calificación "+i+":");
            calf = Double.parseDouble(bufEntrada.readLine());
            suma = suma+calf;
            if (calf<calificacionmasbaja) {
                calificacionmasbaja = calf;
            }
            if (calf>calificacionmasalta) {
                calificacionmasalta = calf;
            }
        }
        promedio1 = suma/n;
        System.out.println("Selecciona una opción:");
        System.out.println("1. Ver la calificación mas baja :(");
        System.out.println("2. Ver la calificación mas alta :)");
        System.out.println("3. Ver el promedio de las calificaciones");
        opcion = Integer.parseInt(bufEntrada.readLine());
        switch (opcion) {
        case 1:
            System.out.println("La calificación más baja es: "+calificacionmasbaja);
            break;
        case 2:
            System.out.println("La calificación más alta es: "+calificacionmasalta);
            break;
        case 3:
            System.out.println("El promedio de las calificaciones es: "+promedio1);
            break;
        default:
            System.out.println("Opción no valida compañero :(.");
        }
    }


}