import java.util.Scanner;

public class LeerDatos {
    /* la clase escanner
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inroduce tu nombre: \n");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: \n");
        String edad = scanner.nextLine();


        System.out.println("Tu nombre es: "+ nombre +" y tu edad es: "+ edad);
        scanner.close();

    }
}
