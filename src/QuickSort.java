import java.util.Arrays;
import java.util.Random;
;

public class QuickSort {

    public static void main(String[] args) {
        Random  rd = new Random();
        int n = 10000000;
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = rd.nextInt(100000);
        }
        int min = 0;
        int max = mass.length-1;
        quickSorted(mass,min,max);
        System.out.println(Arrays.toString(mass));




    }
    public static void quickSorted(int[] mass, int min, int max){
        if (mass.length==0){
            return;
        }
        if (min>=max){
            return;
        }
        //выбрать опроный элемент
        int middle = min + (max-min) / 2;
        int opornyiElement = mass[middle];

        // разделить на подмасивы которые больше и меньше опроного элемента
        int i = min, j = max;
        while(i<=j){
            while(mass[i]<opornyiElement){
                i++;
            }
            while(mass[j]>opornyiElement){
                j--;
            }
            if (i<=j){ // меняем местами
                int temp = mass[i];
                mass[i] = mass[j];
                mass[j] = temp;
                i++;
                j--;
            }
        }
        //вызов рекурсии для сортировки левой и правой части
        if (min<j){
            quickSorted(mass, min, j);
        }
        if (max>i){
            quickSorted(mass,i, max );
        }
    }
}
