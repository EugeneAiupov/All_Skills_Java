import java.util.Arrays;
;

public class QuickSort {

    public static void main(String[] args) {

        int n = 100000;
        int[] mass1 = {1,2,6,3478247,92,23847,234,321,41,432,3525634,634534,25235,25352,6235623,235235,235235,23523,5234,23,4,23,4,23,4,23,4,23,4,23,4,2,4,1,5,64,7,78,68,45,8,89,854,735,6,346,34,6,58,56845,7634,6,3,46,346,36,34,6,34,6,34,754,7,6,3,4};
        int min = 0;
        int max = mass1.length-1;
        quickSorted(mass1, min,max);
        System.out.println(Arrays.toString(mass1));




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
