import java.util.Scanner;
public class calculadora {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		float num1, num2;
		String operacion;
		float resultado =0;
		
		System.out.println("Ingrese el primer valor: ");
		num1 = scanner.nextFloat();
		
		System.out.println("Ingrese el segundo valor: ");
		num2 = scanner.nextFloat();
		
		System.out.println("Ingrese la operación a realizar (+, -, *, /):" );
		operacion = scanner.next();
		
		switch(operacion) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			if(num2 != 0) {
				resultado = num1 / num2;
			}else {
				System.out.println("Error compañero :( división por cero no se puede ");
				
			}
			break;
		default:
			System.out.println("Operación no válida.");
			
		}
		System.out.println("El resultado de "+ num1 + " " + operacion + " " + num2 + " es: " + resultado);
	}

}
