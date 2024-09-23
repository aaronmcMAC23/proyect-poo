
public class ConversionDeTipos {
    public static void main(String [] args){
        /*la convercion de tipos que podemos llamar de igual forma casting
         * en ocaciones es importante convertir una variable de un tipo a otro 
         * 
         */
        int x = 2;
        int y = 9;
        double division;

        division = (double) y / (double) x; // los convierte en numeros con decimales por lo tanto el resultado queda como 4.5
        // en lugar de dar 4

        System.out.println("La division es: " + division);
    }
}
