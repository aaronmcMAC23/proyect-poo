import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args){
        Scanner gato = new Scanner(System.in);
        int[] x = new int[5]; 
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;

        System.out.println("El array tine 5 elementos ¿Cual de todos quieres ver?");
        System.out.print("Introduzca un numero del 0 al 4: ");
        int indice = gato.nextInt();
        System.out.println("El elemento que se encuentra en la posicion: "+ indice);
        System.out.println("es el: "+x[indice]);
        
        gato.close();
    }
}
