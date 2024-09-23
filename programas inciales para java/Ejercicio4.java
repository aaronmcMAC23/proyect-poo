import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String euro = "";
        // realizar un conversor de euros a pesetas 1 eruo vale 166.386 pesetas

        System.out.println("Ingresa numero de Euros:\n");
        euro = scanner.nextLine();  // Captura el valor en euros introducido por el usuario como cadena (String).

        double euros = Double.parseDouble(euro);  // Convierte el valor de la cadena a tipo 'double'.
        double pesetas = euros * 166.386;  // Realiza la conversión de euros a pesetas.

        // Muestra el resultado con formato de 2 decimales.
        System.out.printf("El equivalente en Pesetas es: %.2f\n", pesetas);
        scanner.close();  // Cierra el Scanner para liberar recursos.
    }
}
