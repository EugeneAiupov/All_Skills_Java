import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MFCOchered {
    public static void main(String[] args) throws NoSuchElementException {
        Scanner sc = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
        int n = sc.nextInt();
        String name = null;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equalsIgnoreCase("Добавить")){
                myList.add(sc.next());
            }
            if (str.equalsIgnoreCase("Следующий")){
                myList.remove(0);
            }
            if (!str.equalsIgnoreCase("Добавить") && !str.equalsIgnoreCase("Следующий")){
                sc.next();
                sc.next();
                name = sc.next();
                int index = myList.indexOf(name);
                myList.add(index+1, str);
            }


        }
        System.out.println(String.join(" ", myList));

    }
}
