import java.util.Scanner;

public class SentenciaIf2 {
    public static void main(String[] args){
        Scanner gato = new Scanner(System.in);

        System.out.print("Introduce dos numeros enteros separados por un espacio:\n");
        int dat1 = gato.nextInt();
        int dat2 = gato.nextInt();

        if(dat1 == dat2){
            System.out.println("el numero: "+ dat1 + " y el numero: "+ dat2+ " son iguales");
        }
        else if(dat1 > dat2){
            System.out.println("el numero: "+ dat1 + " es mayor a el numero: "+ dat2);
        }
        else if(dat1 < dat2){
            System.out.println("el numero: "+ dat1 + " es menor a el numero: "+ dat2);
        }else{
            System.out.println("no valido carnal.");
        }
        gato.close();
    }
}
