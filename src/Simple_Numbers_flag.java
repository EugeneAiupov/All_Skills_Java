public class Simple_Numbers_flag {
    public static void main(String[] args) {
        int n = 100;
        search:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i ; j++) {
                if (i%j==0){
                    continue search;
                }

            }
            System.out.print(i + " ");

        }
    }
}
