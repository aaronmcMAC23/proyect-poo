import java.util.Scanner;
public class calificaciones {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		float promedio, suma;
		System.out.print("Ingrese el numero de calificaciones a ingresar: \n");
		int n = scanner.nextInt();
		suma = 0;
		for(int i = 1; i<=n; i++) {
			System.out.print("Ingrese calificación "+ i +": \n");
			float calf = scanner.nextFloat();
			suma += calf;
		}
		promedio = suma / n;
		System.out.print("El proemdio de las " + n + " calificaciones es:" + promedio);
	}
}
