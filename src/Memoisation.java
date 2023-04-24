import java.util.Arrays;

public class Memoisation {
    //мемоизация - сохранение результатов выполнения функций
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n+1];
        Arrays.fill(mem, -1);
        System.out.println(fibSearcher(n, mem));

    }
    private static long fibSearcher(int n, long[] arr){
        if (arr[n]!=-1){
            return arr[n];
        }
        if(n<=1){
            return n;
        }
        long result =  fibSearcher(n-1, arr)+fibSearcher(n-2, arr);
        arr[n] = result;
        return result;
    }
}
