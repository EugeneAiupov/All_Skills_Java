import java.util.Arrays;
import java.util.List;
//количество букв в самом маленьком слове в строке
public class testing {

    public static void main(String[] args) {
        String a = "Hello my name is bob";
        System.out.print(findShort(a));
    }


    public static int findShort(String s) {
        String[] str = s.split(" ");
        String shortestW = Arrays.asList(str).stream().sorted((e2, e1) -> e1.length() > e2.length() ? -1:1).findFirst().get();
        int a = 0;
        for (int i = 0; i < shortestW.length(); i++) {
            a++;
        }
        return a;

    }
}
