import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Formatter;

public class App extends Methods {
    public static long counter = 0;


    public static void main(String args[]) {

        knapSackHBResultados();

    }

    private static void knapSackResultados() {
        //caso 1
        int[] pesos = {23, 31, 29, 44, 53, 38, 63, 85, 89, 82};
        int[] valores = {92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
        int capacidade = 165;

        System.out.println("------------Caso 1----------");

        System.out.println("Knapsack = " + knapsack(pesos, valores, capacidade));

        //caso 2
        int[] pesos1 = {56, 59, 80, 64, 75, 17};
        int[] valores1 = {50, 50, 64, 46, 50, 05};
        int capacidade1 = 190;

        System.out.println("------------Caso 1----------");

        System.out.println("Knapsack = " + knapsack(pesos1, valores1, capacidade1));
    }

    private static void knapSackHBResultados() {
        //caso 1

        System.out.println("------------Caso 1----------");

        ArrayList<Item> itens = inicializarItensCaso1();
        System.out.println("KnapsackAutoria = " + knapsack(165, itens));

        System.out.println("------------Caso 2----------");

        ArrayList<Item> itens2 = inicializarItensCaso2();
        System.out.println("KnapsackAutoria = " + knapsack(190, itens2));

        //System.out.println("------------Caso 1----------");

       // System.out.println("KnapsackHB = " + knapsack(pesos1, valores1, capacidade1));
    }




    private static void imprimeFiboEfiboMem() {
        System.out.println("-------------128-----------");


        zeraContador();
        fibo(128);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[129], 128);
        System.out.println("fiboMem = " + getCounter());

        System.out.println("-------------1000-----------");


        zeraContador();
        fibo(1000);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[1001], 1000);
        System.out.println("fiboMem = " + getCounter());


        System.out.println("-------------10000-----------");


        zeraContador();
        fibo(10000);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[10001], 10000);
        System.out.println("fiboMem = " + getCounter());
    }

    private static void imprimeFiboEfiboMemResultados() {
        System.out.println("-------------128-----------");

        System.out.println("fibo = " +  fibo(128));

        System.out.println("fiboMem = " + fiboMem(new long[129], 128));

        System.out.println("-------------1000-----------");

        System.out.println("fibo = " + fibo(1000));

        System.out.println("fiboMem = " + fiboMem(new long[1001], 1000));


        System.out.println("-------------10000-----------");

        System.out.println("fibo = " + fibo(10000));

        System.out.println("fiboMem = " + fiboMem(new long[10001], 10000));
    }

    private static void imprimeTodosIteracoes() {

        System.out.println("--------------4-----------");

        zeraContador();
        fiboRec(4);
        System.out.println("fiboRec = " + getCounter());

        zeraContador();
        fibo(4);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[5], 4);
        System.out.println("fiboMem = " + getCounter());


        System.out.println("-------------8-----------");


        zeraContador();
        fiboRec(8);
        System.out.println("fiboRec = " + getCounter());

        zeraContador();
        fibo(8);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[9], 8);
        System.out.println("fiboMem = " + getCounter());

        System.out.println("-------------16-----------");


        zeraContador();
        fiboRec(16);
        System.out.println("fiboRec = " + getCounter());

        zeraContador();
        fibo(16);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[17], 16);
        System.out.println("fiboMem = " + getCounter());


        System.out.println("-------------32-----------");


        zeraContador();
        fiboRec(32);
        System.out.println("fiboRec = " + getCounter());

        zeraContador();
        fibo(32);
        System.out.println("fibo = " + getCounter());

        zeraContador();
        fiboMem(new long[33], 32);
        System.out.println("fiboMem = " + getCounter());
    }

    private static void imprimeTodosResultados() {

        System.out.println("--------------4-----------");

        System.out.println("fiboRec = " + fiboRec(4));

        System.out.println("fibo = " +  fibo(4));


        System.out.println("fiboMem = " + fiboMem(new long[5], 4));


        System.out.println("-------------8-----------");


        System.out.println("fiboRec = " + fiboRec(8));

        System.out.println("fibo = " +  fibo(8));

        System.out.println("fiboMem = " + fiboMem(new long[9], 8));

        System.out.println("-------------16-----------");

        System.out.println("fiboRec = " + fiboRec(16));


        System.out.println("fibo = " +    fibo(16));

        System.out.println("fiboMem = " + fiboMem(new long[17], 16));


        System.out.println("-------------32-----------");

        System.out.println("fiboRec = " + fiboRec(32));


        System.out.println("fibo = " +  fibo(32));

        System.out.println("fiboMem = " + fiboMem(new long[33], 32));
    }
}




