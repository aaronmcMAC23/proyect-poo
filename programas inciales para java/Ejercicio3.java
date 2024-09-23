import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, direccion, telefon;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        telefon = scanner.nextLine();


        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de teléfono: " + telefon);
        scanner.close();



    }
}
