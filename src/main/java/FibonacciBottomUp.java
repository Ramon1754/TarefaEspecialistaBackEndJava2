public class FibonacciBottomUp {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(14));
        System.out.println(fibonacci(60));
    }
}



//Diferenças entre a solução recursiva e a programação dinâmica:
//Recursiva:
//
//Complexidade de Tempo: O(2n) sem memorização, pois recalcula subproblemas repetidamente.
//
//Complexidade de Espaço: o(n) devido à profundidade da recursão.

//Programação Dinâmica:
//
//Top-Down:
//Complexidade de Tempo: O(n) com memorização.
//Complexidade de Espaço: O(n) para o cache.

//Bottom-Up:
//Complexidade de Tempo: O(n) porque calcula cada valor uma vez.
//Complexidade de Espaço: O(n) para armazenar a tabela de resultados.
