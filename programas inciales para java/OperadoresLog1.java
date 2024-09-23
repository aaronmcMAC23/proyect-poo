import java.util.Scanner;
public class OperadoresLog1 {
    public static void main(String[] args){
        Scanner gato = new Scanner(System.in);

        System.out.println("Adivina el numero que estoy pensando");
        System.out.print("Ingresa un numero entre el 1 y el 100: ");
        int numero = gato.nextInt();

        if((numero < 1) || (numero > 100) ){
            System.out.print("El número introducido debe estar en el intervalo 1 - 100.\n");
            System.out.print("Tienes otra oprtunidad, introduce un número: ");
            numero = gato.nextInt();
        }

        if(numero == 24){
            System.out.println("Efectivamente adivinaste.");
        }else {
            System.out.println("Lo siento no es el numero que estoy pensando :(");
        }
        gato.close();
    }
    
}
