import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tres numeros(pueden ser decimales) separados por espacion: ");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        double media = (d1 + d2 + d3) / 3;

        System.out.println("La media de los tres numero ingresados es: \n"+ media);
        scanner.close();
    }
}
