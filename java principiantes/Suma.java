import java.util.Scanner; // clase Scanner

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // crea un objeto Scanner para obtener la entrada de la ventana de comandos

        int numero1;
        int numero2;
        int suma;

        System.out.print("Escriba el primer entero: \n");
        numero1 = scanner.nextInt();// lee el primer dato ingresado 

        System.out.print("Escriba el segundo entero: \n");
        numero2 = scanner.nextInt(); // lee el segundo dato ingresado

        suma = numero1 + numero2; // realiza la suma

        System.out.println("La suma es: " + suma); // muestra el resultado en pantalla
        scanner.close(); // cierra el objeto Scanner para liberar los recursos de la memoria.
    } // fin del metodo main
} // fin de la clase suma 

