public class Arrays {
    /*es un tipo de dato capaz de almacenar múltiples valores se utiliza para agrupar datos muy parecidos
     * en matematicas un array de una dimensión se llama vector.
     */
    public static void main(String[] args){
        int[] n; // se define n como un array de enteros
        n = new int[4]; //se reserva el espacio para 4 enteros 

        n[0] = 10;
        n[1] = 20;
        n[2] = 30;
        n[3] = 40;

        System.out.println("los valores del array n son los siguientes: ");
        System.out.println(n[0]+" "+n[1]+" "+n[2]+" "+n[3]); // esta es la forma de poder imprmir completo el array

        int suma = n[0] + n[3]; // esta es la forma de realizar la suma de array
        System.out.println("El resultado de la suma del primer elemento y el ultimo es:"+ suma);


    }
}
