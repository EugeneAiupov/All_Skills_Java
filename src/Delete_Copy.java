import java.util.Arrays;
// my delete copy from array program
public class Delete_Copy {
    public static void main(String[] args) {
        int[] arr = {1,1,0,2,2,2,3,4,5,7,8,9,1,2,3,4,5,2,2,3};

        System.out.println(Arrays.toString(removeElement(arr,2)));
        }

    public static int[] removeElement(int[] num, int value) {
        int offSet = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==value){
                offSet++;
            }else{
                num[i-offSet]=num[i];
            }
        }
        return Arrays.copyOf(num, num.length-offSet);
    }
}
