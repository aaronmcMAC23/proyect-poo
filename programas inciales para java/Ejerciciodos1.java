import java.util.Scanner;

public class Ejerciciodos1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /* realiza un progrma que pida dos numeros y que luego muestre el resultado de su multiplicacíón  */

        System.out.print("Ingrese dos numeros separados por un espacio:\n");
        double dat1 = scanner.nextDouble();
        double dat2 = scanner.nextDouble();

        double multi = dat1 * dat2;

        System.out.println("La multiplicación de los dos tados es: "+ multi);
        scanner.close();

    }
}
