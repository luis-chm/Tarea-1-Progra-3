
import java.util.Scanner;

public class Matriz2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        int[][] A = new int[50][50];
        
        System.out.print("INTRODUZCA EL NUMERO DE FILAS: ");
        n = sc.nextInt();
        
        System.out.print("INTRODUZCA EL NUMERO DE COLUMNAS: ");
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
        }
        
        sc.close();
    }
    
}