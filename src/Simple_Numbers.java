public class Simple_Numbers {
    public static void main(String[] args){
        int n = 100;

        for (int i = 2; i < n; i++) {
            if (i<=-1 && i>=1){
                continue;
            }
            if (i>3 && (i%2==0 || i%3==0)) {
                continue;
            } else{
                System.out.print(i+" Простое ");
            }

        }
    }
}
