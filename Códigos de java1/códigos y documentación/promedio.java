import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float calf, calfalta, calfbaja, i, n, promedio1, suma;
        int opcion;

        System.out.println("Ingrese el número de calificaciones a registrar: ");
        n = scanner.nextFloat();
        suma = 0;
        calfbaja = 10; 
        calfalta = 0; 

        for (i = 1; i <= n; ++i) {
            System.out.println("Ingrese calificación " + i + ":");
            calf = scanner.nextFloat();
            suma = suma + calf;

            if (calf < calfbaja) {
                calfbaja = calf;
            }
            if (calf > calfalta) {
                calfalta = calf;
            }
        }

        promedio1 = suma / n;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Ver la calificación más baja :(");
        System.out.println("2. Ver la calificación más alta :)");
        System.out.println("3. Ver el promedio de las calificaciones");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La calificación más baja es: " + calfbaja);
                break;
            case 2:
                System.out.println("La calificación más alta es: " + calfalta);
                break;
            case 3:
                System.out.println("El promedio de las calificaciones es: " + promedio1);
                break;
            default:
                System.out.println("Opción no válida compañero :(.");
        }
    }
}
