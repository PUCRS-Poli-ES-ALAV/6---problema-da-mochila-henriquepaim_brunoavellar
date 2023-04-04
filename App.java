import java.util.ArrayList;

public class App {

    public static void main(String args[]) {

        //int valTeste = 4; //4 - 8 - 16 - 32
        //int[] vetTeste = new int[33];

        //System.out.println(fiboRec(valTeste));
        //System.out.println(fibo(valTeste));
        //System.out.println(fiboMem(vetTeste, valTeste));
        //knapsack();
        System.out.println(knapsack(7));

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

    public static int fibo(int n){
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static int fiboMem(int f[],int n){
        for(int i=0; i<=n; i++){
            f[i] = -1;
        }
        return fiboLookUp(f,n);
    }

    public static int fiboLookUp(int f[],int n){
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
        iinicializarItens(itens);

        int maxTab[][] = new int[itens.size() ][capacidade];
        inicializaMochila(maxTab, capacidade, itens.size());

        for(int i = 1; i<itens.size(); i++) {
            for(int j = 1; j<capacidade; j++) {
                maxTab[i][j] = itens.get(i).getPeso() <= j ?
                        Math.max(maxTab[i-1][j],itens.get(i).getCusto() + maxTab[i-1][j - itens.get(i).getPeso()]) :
                        maxTab[i-1][j];
            }
        }
        return maxTab[itens.size()][capacidade-1];
    }

    private static void inicializaMochila(int[][] maxTab, int capacidade,int numLinhas) {
        for(int i = 0; i<capacidade ; i++) {
            maxTab[0][i] = 0;
        }
        for (int i=0; i<numLinhas; i++) {
            maxTab[i][0] = 0;
        }
    }


    public static void iinicializarItens(ArrayList<Item> itens) {
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
    Custos: Remoção=R, Inserção=I , Substituição=S e Match=M=0;m = tamanho[A];
    n = tamanho[B];
    matriz[0][0] = 0;
    Para i = 1 até m
    matriz[i][0] = matriz[i-1][0] + 1 // soma uma I;
    Para j = 1 até n
    matriz[0][j] = matriz[0][j-1] + 1 // Soma uma R;
    Para i = 1 até m
    Para j = 1 até n
    Se A[i] == B[j]
    custoExtra = 0 //Operação M;
    Senão
            custoExtra = 1 //Operação S;
    matriz[i][j] = Mínimo(matriz[i-1][j] +1, matriz[i][j-1] +1,
                          matriz[i-1][j-1] + custoExtra];
    devolva matriz[m][n];
}

