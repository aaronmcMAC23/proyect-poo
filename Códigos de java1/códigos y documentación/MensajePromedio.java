import java.util.Scanner;
public class MensajePromedio {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		float calf;
		System.out.println("Ingrese la calificación obtenida:\n");
		calf = scanner.nextFloat();
		if (calf<6) {
            System.out.println("No lo lograste :(");
        } else {
            if (calf>=6 && calf<8) {
                System.out.println("Puedes hacerlo mejor");
            } else {
                if (calf>=8 && calf<9) {
                    System.out.println("Bien hecho");
                } else {
                    if (calf>=9 && calf<10) {
                        System.out.println("Muy bien");
                    } else {
                        if (calf==10) {
                            System.out.println("Excelente");
                        } else {
                            System.out.println("Datos mal ingresados");
                        }
                    }
                }
            }
        }
	}
}
