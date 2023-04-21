public class Sort_Puzirkom {
    public static void main(String[] args) {
        int n = 100000;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                count++;
            }


        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print((int)arr[i]+" ");
        }
    }
}


