import java.util.ArrayList;

public class App extends Methods {
    public static long counter = 0;


    public static void main(String args[]) {

        distEdicaoIteracao();
        distEdicaoHBIteracao();

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
        int[] valores1 = {50, 50, 64, 46, 50, 5};
        int capacidade1 = 190;

        System.out.println("------------Caso 2----------");

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


    private static void imprimeFiboEfiboMemIterations() {
        System.out.println("-------------128-----------");


        zeraContador();
        fibo(128);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[129], 128);
        System.out.println("fiboMem = " + getCounterIteration());

        System.out.println("-------------1000-----------");


        zeraContador();
        fibo(1000);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[1001], 1000);
        System.out.println("fiboMem = " + getCounterIteration());


        System.out.println("-------------10000-----------");


        zeraContador();
        fibo(10000);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[10001], 10000);
        System.out.println("fiboMem = " + getCounterIteration());
    }

    private static void imprimeFiboEfiboMemInstructions() {
        System.out.println("-------------128-----------");


        zeraContadorInstrucoes();
        fibo(128);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[129], 128);
        System.out.println("fiboMem = " + getCounterInstruction());

        System.out.println("-------------1000-----------");


        zeraContadorInstrucoes();
        fibo(1000);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[1001], 1000);
        System.out.println("fiboMem = " + getCounterInstruction());


        System.out.println("-------------10000-----------");


        zeraContadorInstrucoes();
        fibo(10000);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[10001], 10000);
        System.out.println("fiboMem = " + getCounterInstruction());
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
        System.out.println("fiboRec = " + getCounterIteration());

        zeraContador();
        fibo(4);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[5], 4);
        System.out.println("fiboMem = " + getCounterIteration());


        System.out.println("-------------8-----------");


        zeraContador();
        fiboRec(8);
        System.out.println("fiboRec = " + getCounterIteration());

        zeraContador();
        fibo(8);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[9], 8);
        System.out.println("fiboMem = " + getCounterIteration());

        System.out.println("-------------16-----------");


        zeraContador();
        fiboRec(16);
        System.out.println("fiboRec = " + getCounterIteration());

        zeraContador();
        fibo(16);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[17], 16);
        System.out.println("fiboMem = " + getCounterIteration());


        System.out.println("-------------32-----------");


        zeraContador();
        fiboRec(32);
        System.out.println("fiboRec = " + getCounterIteration());

        zeraContador();
        fibo(32);
        System.out.println("fibo = " + getCounterIteration());

        zeraContador();
        fiboMem(new long[33], 32);
        System.out.println("fiboMem = " + getCounterIteration());
    }

    private static void imprimeTodosinstrucoes() {

        System.out.println("--------------4-----------");

        zeraContadorInstrucoes();
        fiboRec(4);
        System.out.println("fiboRec = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fibo(4);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[5], 4);
        System.out.println("fiboMem = " + getCounterInstruction());


        System.out.println("-------------8-----------");


        zeraContadorInstrucoes();
        fiboRec(8);
        System.out.println("fiboRec = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fibo(8);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[9], 8);
        System.out.println("fiboMem = " + getCounterInstruction());

        System.out.println("-------------16-----------");


        zeraContadorInstrucoes();
        fiboRec(16);
        System.out.println("fiboRec = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fibo(16);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[17], 16);
        System.out.println("fiboMem = " + getCounterInstruction());


        System.out.println("-------------32-----------");


        zeraContadorInstrucoes();
        fiboRec(32);
        System.out.println("fiboRec = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fibo(32);
        System.out.println("fibo = " + getCounterInstruction());

        zeraContadorInstrucoes();
        fiboMem(new long[33], 32);
        System.out.println("fiboMem = " + getCounterInstruction());
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

    private static void distEdicaoResultados(){

        System.out.println("-----------------CASO 1--------------");

        String s1 = "Casablanca";
        String s2 = "Portentoso";

        System.out.println("DistEdicao = " + distEdicao(s1, s2));

        System.out.println("-----------------CASO 2--------------");

        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        System.out.println("DistEdicao = " + distEdicao(texto, texto2));
    }

    private static void distEdicaoHBResultados(){

        System.out.println("-----------------CASO 1--------------");

        String s1 = "Casablanca";
        String s2 = "Portentoso";

        System.out.println("DistEdicao HB = " + distEdicaoHB(s1, s2));

        System.out.println("-----------------CASO 2--------------");
        
        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        System.out.println("DistEdicao HB = " + distEdicaoHB(texto, texto2));
    }

    private static void distEdicaoInstruction(){


        System.out.println("-----------------CASO 1--------------");

        zeraContadorInstrucoes();
        String s1 = "Casablanca";
        String s2 = "Portentoso";

        distEdicao(s1, s2);

        System.out.println("DistEdicao Instruction = " + getCounterInstruction());

        System.out.println("-----------------CASO 2--------------");

        zeraContadorInstrucoes();
        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        distEdicao(texto, texto2);

        System.out.println("DistEdicao Instruction = " + getCounterInstruction());
    }

    private static void distEdicaoHBInstruction(){


        System.out.println("-----------------CASO 1--------------");

        zeraContadorInstrucoes();
        String s1 = "Casablanca";
        String s2 = "Portentoso";

        distEdicaoHB(s1, s2);

        System.out.println("DistEdicao HB Instruction = " + getCounterInstruction());

        System.out.println("-----------------CASO 2--------------");

        zeraContadorInstrucoes();
        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        distEdicaoHB(texto, texto2);

        System.out.println("DistEdicao HB Instruction = " + getCounterInstruction());
    }

    private static void distEdicaoIteracao(){


        System.out.println("-----------------CASO 1--------------");

        zeraContador();
        String s1 = "Casablanca";
        String s2 = "Portentoso";

        distEdicao(s1, s2);

        System.out.println("DistEdicao Iteracao = " + getCounterIteration());

        System.out.println("-----------------CASO 2--------------");

        zeraContador();
        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        distEdicao(texto, texto2);

        System.out.println("DistEdicao Iteracao = " + getCounterIteration());
    }

    private static void distEdicaoHBIteracao(){


        System.out.println("-----------------CASO 1--------------");

        zeraContador();
        String s1 = "Casablanca";
        String s2 = "Portentoso";

        distEdicaoHB(s1, s2);

        System.out.println("DistEdicao HB Iteracao = " + getCounterIteration());

        System.out.println("-----------------CASO 2--------------");

        zeraContador();
        String texto = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
                    "simplify the build processes in the Jakarta Turbine project. There were several" + 
                    " projects, each with their own Ant build files, that were all slightly different." +
                    "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
                    "definition of what the project consisted of, an easy way to publish project information" +
                    "and a way to share JARs across several projects. The result is a tool that can now be" +
                    "used for building and managing any Java-based project. We hope that we have created " +
                    "something that will make the day-to-day work of Java developers easier and generally help " +
                    "with the comprehension of any Java-based project.";
        String texto2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
                    "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
                    "ask? I am going to try to answer this question in this article." + 
                    "Go to the profile of Marin Vlastelica Pogančić" + 
                    "Marin Vlastelica Pogančić Jun";

        distEdicaoHB(texto, texto2);

        System.out.println("DistEdicao HB Iteracao = " + getCounterIteration());
    }

    
}





