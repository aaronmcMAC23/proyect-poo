import java.util.Scanner;
public class Par {
 public static void main (String [] args) {
	 Scanner scanner = new Scanner (System.in);
	 
	 System.out.print("Ingrese un nuero entero: \n");
	 int numero = scanner.nextInt();
	 if(numero %2 == 0) {
		 System.out.println("El numero es par. ");
		 
	 } else {
		 System.out.println("El numero no es par. ");
		 
	 }
 }
}
