import java.util.Scanner;
public class bisiesto {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el año de su preferancia: ");
		int anio = scanner.nextInt();
		
		if((anio % 4 == 0 && anio % 100 != 0) || (anio %400 == 0)) {
			System.out.println(anio + " Es un año bisiesto. ");
			
		} else {
			System.out.println(anio + " No es uno año bisiesto. ");
		}
	}

}
