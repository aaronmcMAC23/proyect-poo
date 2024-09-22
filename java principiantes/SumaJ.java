import javax.swing.JOptionPane; //JOptionPane   
public class SumaJ {
    public static void main(String[] args) {
        //obtener la netrada del ususario de los dialogos de entrada de JOptionPane1
        String num1 = JOptionPane.showInputDialog("Ingrese el primer numero: \n");
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero: \n");

        // convierte las entradas String en valores int para usarlos
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);

        // realiza la suma
        int suma = numero1 + numero2;

        //muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null,"La suma es: "+ suma);
    } // fin del metodo main
} // fin de la clase SumaJ

/* Convertir objetos Strign en valores int 
 * Integer.parseInt(String s) convierte una cadena de caracteres en un entero.
 *
 * Ejemplo:
 * String num1 = "10";
 * int numero1 = Integer.parseInt(num1); // numero1 = 10
 *
 */