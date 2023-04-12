public class Methods {

    // Método para calcular a solução ótima do problema da mochila
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] table = new int[n+1][capacity+1];
        
        // Preenchimento da tabela
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (weights[i-1] <= j) {
                    table[i][j] = Math.max(values[i-1] + table[i-1][j-weights[i-1]], table[i-1][j]);
                } else {
                    table[i][j] = table[i-1][j];
                }
            }
        }
        
        // Retorno da solução ótima
        return table[n][capacity];
    }
}
