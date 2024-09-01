
/**
 * Write a description of class calculadora here.
 * 
 * Martínez de la Cruz Aarón
 * @version (a version number or a date)
 */
import java.io.*;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double num1;
        double num2;
        String operacion;
        double resultado = 0; // Inicializar el resultado
        
        System.out.println("Ingrese el primer valor:");
        num1 = Double.parseDouble(bufEntrada.readLine());
        
        System.out.println("Ingrese el segundo valor:");
        num2 = Double.parseDouble(bufEntrada.readLine());
        
        System.out.println("Ingrese la operación a realizar (+, -, *, /):");
        operacion = bufEntrada.readLine();
        
        switch (operacion) {
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
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error compañero :( División por cero no se puede ");
                    return; 
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return; 
        }
        
        System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
    }
}
