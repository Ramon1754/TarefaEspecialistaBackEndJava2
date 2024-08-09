public class Fatorial {
    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(4));
        System.out.println(fatorial(9));
    }
}

//Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva?
//
//Usar recursão para calcular o fatorial de números muito grandes (como 100) pode levar a um erro de estouro de pilha (StackOverflowError) devido à profundidade da pilha de chamadas.
// Portanto, para números maiores, seria melhor usar uma abordagem iterativa ou técnicas de programação dinâmica.
