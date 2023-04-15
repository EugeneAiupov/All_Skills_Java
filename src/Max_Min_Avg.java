
public class Max_Min_Avg {
    public static void main (String[] args){
        int n = 5;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100;

        }
        double max = arr[0];
        double min = arr[0];
        double average=0;

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
            average += arr[i]/arr.length;
        }
        System.out.print("max = " + (int)max+" | min = " +(int)min+ " | average = " + (int)average);

    }
}
