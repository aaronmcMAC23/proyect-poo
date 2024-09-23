import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // crear el lector
        String nombre = "";

        System.out.println("Ingrese su nombre:");
        nombre = scanner.nextLine(); // leer el nombre


        System.out.println("Su nombre es: "+ nombre);
        scanner.close(); // cerrar el scanner para liberar recursos

        
    }
}
