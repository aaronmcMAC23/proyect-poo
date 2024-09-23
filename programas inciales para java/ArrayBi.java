public class ArrayBi {
    public static void main(String[] args)throws InterruptedException{

            int[][] n = new int[3][2]; //array de 3 filas por 2 columnas

            n[0][0] = 20;
            n[1][0] = 30;
            n[1][1] = 40;
            n[2][1] = 50;

            int fila, columna;

            for(fila = 0; fila < 3; fila++){
                System.out.println("fila: " + fila);
                for(columna = 0; columna < 2; columna++){
                    System.out.printf("%10d ", n[fila][columna]);
                    Thread.sleep(1000); // retardo de un segundo 
                }
                System.out.println();
            }
    }
}
