import java.util.ArrayList;

public class Methods {
    static int counterIteration = 0;
    static int counterInstruction = 0;
    // Método que calcula o problema da mochila


    public static void zeraContador() {
        counterIteration = 0;
    }

    public static void zeraContadorInstrucoes() {
        counterInstruction = 0;
    }

    public static int getCounterIteration() {
        return counterIteration;
    }
    public static int getCounterInstruction() {
        return counterInstruction;
    }
    public static int knapsack(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        counterInstruction++;

        int[][] table = new int[n+1][capacidade+1];
        counterInstruction++;

        counterInstruction++;
        // Preenchimento da tabela
        for (int i = 0; i <= n; i++) {
            counterInstruction+=2;
            counterInstruction++;
            for (int j = 0; j <= capacidade; j++) {
                counterInstruction+=2;
                if (i == 0 || j == 0) {
                    counterInstruction++;
                    table[i][j] = 0;
                } else if (pesos[i-1] <= j) {
                    counterInstruction++;
                    table[i][j] = Math.max(valores[i-1] + table[i-1][j-pesos[i-1]], table[i-1][j]);
                } else {
                    counterInstruction++;
                    table[i][j] = table[i-1][j];
                }
            }
        }
        counterInstruction++;
        // Retorno da solução ótima
        return table[n][capacidade];
    }
    public static int fiboRec(int n){
        counterIteration++;
        if (n <= 1) {
            counterInstruction++;
            return n;
        }
        counterInstruction++;
        int a = fiboRec(n - 1);
        counterInstruction++;
        int b = fiboRec(n - 2);
        counterInstruction++;
        return a + b;
    }


    public static long fibo(int n){
        long f[] = new long[n+1];
        counterInstruction++;
        f[0] = 0;
        counterInstruction++;
        f[1] = 1;
        counterInstruction++;

        counterInstruction++;
        for (int i = 2; i <= n; i++) {

            f[i] = f[i-1] + f[i-2];
            counterIteration++;
            counterInstruction+=2;
        }
        counterInstruction++;
        return f[n];
    }


    public static long fiboMem(long f[],int n){
        counterInstruction++;
        for(int i=0; i<=n; i++){
            counterInstruction+=2;
            counterIteration++;
            f[i] = -1;
            counterInstruction++;
        }
        counterInstruction++;
        return fiboLookUp(f,n);
    }

    public static long fiboLookUp(long f[],int n){
        counterIteration++;
        if (f[n] >= 0) {
            counterInstruction++;
            return f[n];
        }
        if (n <= 1) {
            counterInstruction++;
            f[n] = n;
        } else {
            counterInstruction++;
            f[n] = fiboLookUp(f, n - 1) + fiboLookUp(f, n - 2);
        }
        counterInstruction++;
        return f[n];
    }

    public static int knapsack(int capacidade, ArrayList<Item> itens) {
        capacidade++;
        counterInstruction++;
        int maxTab[][] = new int[itens.size() ][capacidade];
        counterInstruction++;
        inicializaMochila(maxTab, capacidade, itens.size());
        counterInstruction++;

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
        counterInstruction++;
        for(int i = 0; i<capacidade ; i++) {
            counterInstruction+=2;
            maxTab[0][i] = 0;
            counterInstruction++;
        }
        counterInstruction++;
        for (int i=0; i<numLinhas; i++) {
            counterInstruction+=2;
            maxTab[i][0] = 0;
            counterInstruction++;
        }
    }


    public static ArrayList<Item> inicializarItensCaso1() {
        ArrayList<Item> itens = new ArrayList<>();
        counterInstruction++;
        itens.add(null);
        counterInstruction++;
        itens.add(new Item(23, 92));
        counterInstruction++;
        itens.add(new Item(31, 57));
        counterInstruction++;
        itens.add(new Item(29, 49));
        counterInstruction++;
        itens.add(new Item(44, 68));
        counterInstruction++;
        itens.add(new Item(53, 60));
        counterInstruction++;
        itens.add(new Item(38, 43));
        counterInstruction++;
        itens.add(new Item(63, 67));
        counterInstruction++;
        itens.add(new Item(85, 84));
        counterInstruction++;
        itens.add(new Item(89, 87));
        counterInstruction++;
        itens.add(new Item(82, 72));
        counterInstruction++;

        counterInstruction++;
        return itens;

    }
    public static ArrayList<Item> inicializarItensCaso2() {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(null);
        itens.add(new Item(56, 50));
        itens.add(new Item(59, 50));
        itens.add(new Item(80, 64));
        itens.add(new Item(64, 46));
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

    public static int distEdicao(String A, String B){
        counterIteration++;

        int m = A.length();
        counterInstruction++;
        int n = B.length();
        counterInstruction++;

        int[][] matriz = new int[m+1][n+1];
        counterInstruction++;

        matriz[0][0] = 0;
        counterInstruction++;

        counterInstruction++;
        for (int i = 1; i <= m; i++) {
            counterIteration++;
            counterInstruction+=2;
            matriz[i][0] = matriz[i-1][0] + 1;
            counterInstruction++;
        }
        counterInstruction++;
        for (int j = 1; j <= n; j++) {
            counterIteration++;
            counterInstruction+=2;
            matriz[0][j] = matriz[0][j-1] + 1;
            counterInstruction++;
        }
        counterInstruction++;
        for (int i = 1; i <= m; i++) {
            counterIteration++;
            counterInstruction+=2;

            counterInstruction++;
            for (int j = 1; j <= n; j++) {
                counterIteration++;
                counterInstruction+=2;
                int custoExtra;
                counterInstruction++;
                if (A.charAt(i-1) == B.charAt(j-1)) {
                    counterInstruction++;
                    custoExtra = 0;
                } else {
                    counterInstruction++;
                    custoExtra = 1;
                }
                counterInstruction++;
                matriz[i][j] = Math.min(matriz[i-1][j] + 1,
                        Math.min(matriz[i][j-1] + 1,
                                matriz[i-1][j-1] + custoExtra)
                );
                counterInstruction++;
            }
        }
        counterInstruction++;
        return matriz[m][n];
    }

    public static int distEdicaoHB(String primeiraPalavra, String segundaPalavra) {
        counterIteration++;

        int[] dc = new int[segundaPalavra.length() + 1];
        counterInstruction++;

        counterInstruction++;
        for (int j = 0; j <= segundaPalavra.length(); j++) {
            counterIteration++;
            counterInstruction+=2;
            dc[j] = j;
            counterInstruction++;
        }
        counterInstruction++;
        for (int i = 1; i <= primeiraPalavra.length(); i++) {
            counterIteration++;
            counterInstruction+=2;
            int prev = dc[0];
            counterInstruction++;
            dc[0] = i;
            counterInstruction++;

            counterInstruction++;
            for (int j = 1; j <= segundaPalavra.length(); j++) {
                counterIteration++;
                counterInstruction+=2;
                int temp = dc[j];
                counterInstruction++;
                dc[j] = primeiraPalavra.charAt(i - 1) == segundaPalavra.charAt(j - 1) ?  prev :  1 + Math.min(prev, Math.min(dc[j], dc[j - 1]));
                counterInstruction++;

                prev = temp;
                counterInstruction++;
            }
        }

        counterInstruction++;
        return dc[segundaPalavra.length()];
    }
}
