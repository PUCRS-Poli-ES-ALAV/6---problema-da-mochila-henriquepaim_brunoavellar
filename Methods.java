import java.util.ArrayList;

public class Methods {
    static int counter = 0;

    // Método que calcula o problema da mochila


    public static void zeraContador() {
        counter = 0;
    }

    public static int getCounter() {
        return counter;
    }
    public static int knapsack(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int[][] table = new int[n+1][capacidade+1];
        
        // Preenchimento da tabela
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacidade; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (pesos[i-1] <= j) {
                    table[i][j] = Math.max(valores[i-1] + table[i-1][j-pesos[i-1]], table[i-1][j]);
                } else {
                    table[i][j] = table[i-1][j];
                }
            }
        }
        
        // Retorno da solução ótima
        return table[n][capacidade];
    }
    public static int fiboRec(int n){
        counter++;
        if (n <= 1) {
            return n;
        }
        int a = fiboRec(n - 1);
        int b = fiboRec(n - 2);
        return a + b;
    }


    public static long fibo(int n){
        long f[] = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {

            f[i] = f[i-1] + f[i-2];
            counter++;
        }
        return f[n];
    }


    public static long fiboMem(long f[],int n){
        for(int i=0; i<=n; i++){
            counter++;
            f[i] = -1;
        }
        return fiboLookUp(f,n);
    }

    public static long fiboLookUp(long f[],int n){
        counter++;
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

    public static int knapsack(int capacidade, ArrayList<Item> itens) {
        capacidade++;

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


    public static ArrayList<Item> inicializarItensCaso1() {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(null);
        itens.add(new Item(23, 92));
        itens.add(new Item(31, 57));
        itens.add(new Item(29, 49));
        itens.add(new Item(44, 68));
        itens.add(new Item(53, 60));
        itens.add(new Item(38, 43));
        itens.add(new Item(63, 67));
        itens.add(new Item(85, 84));
        itens.add(new Item(89, 87));
        itens.add(new Item(82, 72));
        return itens;

    }
    public static ArrayList<Item> inicializarItensCaso2() {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(null);
        itens.add(new Item(56, 50));
        itens.add(new Item(59, 50));
        itens.add(new Item(80, 64));
        itens.add(new Item(64, 64));
        itens.add(new Item(75, 50));
        itens.add(new Item(17, 5));
        return itens;

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

    public static int editDistanceHB(String primeiraPalavra, String segundaPalavra) {
        int[] dp = new int[segundaPalavra.length() + 1];
        for (int j = 0; j <= segundaPalavra.length(); j++) {
            dp[j] = j;
        }

        for (int i = 1; i <= primeiraPalavra.length(); i++) {
            int prev = dp[0];
            dp[0] = i;
            for (int j = 1; j <= segundaPalavra.length(); j++) {
                int temp = dp[j];
                dp[j] = primeiraPalavra.charAt(i - 1) == segundaPalavra.charAt(j - 1) ?  prev :  1 + Math.min(prev, Math.min(dp[j], dp[j - 1]));
                prev = temp;
            }
        }

        return dp[segundaPalavra.length()];
    }


}
