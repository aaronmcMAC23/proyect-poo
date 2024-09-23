import java.util.Scanner;

public class LeerDatos2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre y tu edad seaparados por un espacio: ");
        String nombre = scanner.next();
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: "+ nombre + " Tu edad es: "+ edad);
        scanner.close();


    }
}
