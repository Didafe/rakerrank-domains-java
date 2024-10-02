import java.util.*;

// Java Loops 2
class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            gerarEImprimirSerie(a, b, n);
        }
        in.close();
    }
    
    public static void gerarEImprimirSerie(int a, int b, int n) {
        for (int j = 0; j < n; j++) {
            a += (Math.pow(2, j) * b);
            System.out.print(a + " ");
        }
        System.out.println();
    }
}