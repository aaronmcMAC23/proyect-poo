import java.util.Scanner;
public class Menu {
    public static void main(String[] args){{
        Scanner gato = new Scanner(System.in);

        System.out.println("CALCULO DE AREAS.");
        System.out.println("__________________");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triángulo");
        System.out.print("\n Elija una opción (1_3):");
        int opcion = gato.nextInt();

        double lado;
        double base;
        double altura;

        switch (opcion) {
            case 1:
                System.out.print("\n Introduce el lado del cuadrado en cm: ");
                lado = gato.nextDouble();
                System.out.println("\n El área del cuadrado es: "+ (lado * lado) + "cm2");
                break;
            case 2:
                System.out.print("\n Introduce la base del rectangulo en cm: ");
                base = gato.nextDouble();
                System.out.print("\n Introduce la altura del rectangulo en cm: ");
                altura = gato.nextDouble();
                System.out.println("\n El área del rectangulo es: "+ (base * altura) + "cm2");
                break;
            case 3:
                System.out.print("\n Itruduzca la base del rectángulo en cm: ");
                base = gato.nextDouble();
                System.out.print("\n Introduzca la altura del triángulo en cm: ");
                altura = gato.nextDouble();
                System.out.println("\n El área del triángulo es: "+ ((base * altura) / 2) + "cm2");
                break;
            default:
            System.out.println("\n Opción incorrecta carnal.");
                break;
        }
        gato.close();
    }}
    
}
