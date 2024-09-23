import java.util.Scanner;
public class UsoWhile2 {
    public static void main(String[] args){
        Scanner gato = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int data = gato.nextInt();
        if (data > 0){
            System.out.println("el dato ingresado es un numero psitivo. ");
            for (int i = 0; i <= data; i++){
                System.out.println(i);
            }
        }
        else if(data == 0){
            System.out.println("el dato ingresado es cero. ");
        }
        else if(data < 0){
            System.out.println("El numero ingresado es un numero negativo.");
            while(data <= 0){
                System.out.println(data);
                data++;
            }
        }
        else{
            System.out.println("El dato ingresado no es un numero carnal.");
        }
        gato.close();
    }
}
