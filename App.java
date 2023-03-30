public class App {

    public static void main(String args[]) {

        int valTeste = 4; //4 - 8 - 16 - 32
        int[] vetTeste = new int[33];

        System.out.println(fiboRec(valTeste));
        System.out.println(fibo(valTeste));
        System.out.println(fiboMem(vetTeste, valTeste));
        

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
}