import java.util.Scanner;
// uso del if
public class Comparacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        if(num1 == num2){
            System.out.printf("%d == %d\n", num1, num2);
        }
        if(num1 != num2){
            System.out.printf("%d != %d\n", num1, num2);
        }
        if(num1 < num2){
            System.out.printf("%d  < %d\n", num1, num2);
        }
        if(num1 > num2){
            System.out.printf("%d > %d\n", num1, num2);
        }
        if(num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
        if(num1 >= num2){
            System.out.printf("%d >= %d\n", num1, num2);
        }
        scanner.close();
    }
}
