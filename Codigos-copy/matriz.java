import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor para columnas y filas");
        int n = scanner.nextInt();
        if(n != 0 && n % 2 != 0){
        
        int[][] matriz = new int[n][n];
        int i = 0; //cordenada para i
        int j = n / 2; // cordenada para j
        matriz[i][j] = 1;  // en esa cordenada se va a colocar el valor de la matriz 

        for (int num = 2; num <= n * n; num++) { // iniciamos la matriz desde 2 asta n*n = 25 numeros 
            int ni = (i - 1 + n) % n; // calcula la fila siguiente
            int nj = (j + 1) % n; // calcula la columna siguiente 
    
            if (matriz[ni][nj] != 0) { //esepción por si la cordenada esta ocupada 
                ni = (i + 1) % n;
                nj = j;
            }

            matriz[ni][nj] = num; // asigan el numero actual num a la poso¿ición calculada 
            i = ni;// actualiza las occrdenadas 
            j = nj;
        }

        System.out.println("La matriz es:");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }else{
        System.out.println("dato no valido compañero");
    
}
}
}
