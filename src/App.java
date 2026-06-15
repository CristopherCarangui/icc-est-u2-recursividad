public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Suma consecutiva del 5");
        int res = runEjercicio1(5);
        System.out.println(res);
        System.out.println("Ejercicio 2 ");
        long ecc2 = runEjercicio2(2,31);
        System.out.println(ecc2);
        
    }
    //Escribe una funcnio recursiva que calcule la suma de todos
    //los numeros enteros consecutivos desde 1 hasta a un numero dado
    // n. Por ejemplo, si n es igual a 5,

    private static long runEjercicio2(long b, long e) {
        if(e == 1){
            return b;
        }else{
            long res = b* runEjercicio2(b, e-1);
            return res;
        }
        
    }

    private static int runEjercicio1(int n) {
        // TODO Auto-generated method stub
        if(n ==1){
            return 1;
        }
        int respuesta =n + runEjercicio1(n-1);
        return  respuesta ;        

        
    }
    
}
