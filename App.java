import java.util.ArrayList;

public class App {

    public static void main(String args[]) {

        int valTeste = 4; //Teste para todos com tamanho: 4, 8, 16, 32 e para fibo e fiboMem com as variáveis 128, 1000, 10.000
        long[] vetTeste = new long[33];

        System.out.println(fiboRec(valTeste));
        System.out.println(fibo(valTeste));
        System.out.println(fiboMem(vetTeste, valTeste));

        String A = "Mola";
        String B = "Bola";

        System.out.println(knapsack(7));
        System.out.println(distDeEdicao(A, B));
    }

    public static int fiboRec(int n){

        if (n <= 1) {
            return n;
        } else {
            int a = fiboRec(n - 1);
            int b = fiboRec(n - 2);
            return a + b;
        }
    }

    public static long fibo(int n){
        long f[] = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static long fiboMem(long f[],int n){
        for(int i=0; i<=n; i++){
            f[i] = -1;
        }
        return fiboLookUp(f,n);
    }

    public static long fiboLookUp(long f[],int n){
        if (f[n] >= 0) {
            return f[n];
        }
        if (n <= 1) {
            f[n] = n;
        } else {
            f[n] = fiboLookUp(f, n - 1) + fiboLookUp(f, n - 2);
        }
        return f[n];
    }

    public static int knapsack(int capacidade) {
        capacidade++;
        ArrayList<Item> itens = new ArrayList<Item>();
        inicializarItens(itens);

        int maxTab[][] = new int[itens.size() ][capacidade];
        inicializaMochila(maxTab, capacidade, itens.size());

        for(int i = 1; i<itens.size(); i++) {
            for(int j = 1; j<capacidade; j++) {
                maxTab[i][j] = itens.get(i).getPeso() <= j ?
                        Math.max(maxTab[i-1][j],itens.get(i).getCusto() + maxTab[i-1][j - itens.get(i).getPeso()]) :
                        maxTab[i-1][j];
            }
        }
        return maxTab[itens.size()-1][capacidade-1];
    }

    private static void inicializaMochila(int[][] maxTab, int capacidade,int numLinhas) {
        for(int i = 0; i<capacidade ; i++) {
            maxTab[0][i] = 0;
        }
        for (int i=0; i<numLinhas; i++) {
            maxTab[i][0] = 0;
        }
    }


    public static void inicializarItens(ArrayList<Item> itens) {
        itens.add(null);
        itens.add(new Item(5, 2));
        itens.add(new Item(2, 4));
        itens.add(new Item(2, 2));
        itens.add(new Item(1, 3));
    }

    static class Item {
       private  int peso;
        private int custo;

        public Item() {
            peso = 0;
            custo = 0;
        }

        public Item(int peso, int custo) {
            this.peso = peso;
            this.custo = custo;
        }

        public int getPeso() {
            return peso;
        }

        public int getCusto() {
            return custo;
        }

    }

    public static int distDeEdicao(String A, String B){
        int m = A.length();
        int n = B.length();
        int[][] matriz = new int[m+1][n+1];

        matriz[0][0] = 0;

        for (int i = 1; i <= m; i++) {
            matriz[i][0] = matriz[i-1][0] + 1;
        }

        for (int j = 1; j <= n; j++) {
            matriz[0][j] = matriz[0][j-1] + 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int custoExtra;
                if (A.charAt(i-1) == B.charAt(j-1)) {
                    custoExtra = 0;
                } else {
                    custoExtra = 1;
                }
                matriz[i][j] = Math.min(matriz[i-1][j] + 1,
                                        Math.min(matriz[i][j-1] + 1,
                                                matriz[i-1][j-1] + custoExtra));
            }
        }

        return matriz[m][n];
    }
}

