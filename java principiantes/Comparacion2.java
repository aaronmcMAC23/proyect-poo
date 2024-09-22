import java.util.Scanner;

public class Comparacion2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: \n");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("El número ingresado es positivo.");
        }else if(numero < 0){
            System.out.println("El número ingresado es negativo.");
        }else {
            System.out.println("El número ingresado es cero.");
        }
        scanner.close();
    }
}
