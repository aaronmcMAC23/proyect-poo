
/**
 * Write a description of class calificacion2 here.
 * 
 * Martínez de la Cruz Aarón
 * @version (a version number or a date)
 */

import java.io.*;
public class calificacion2
{
public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double calf;
		System.out.println("Ingresa la calificación obtenida:");
		calf = Double.parseDouble(bufEntrada.readLine());
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
