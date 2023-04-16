package CodeWars;

import java.lang.reflect.Array;

public class FirstLetterToUpper {
    public static void main(String[] args) {
        System.out.println(camelCase("  "));
    }

    public static String camelCase(String str) {
        StringBuilder stb = new StringBuilder();
        String[] arr = str.trim().replaceAll("\\s+"," ").split(" ");
        if (str==null || str.isEmpty() || str == "" || str.trim().equals("")){
            return str.trim();
        }
        for(String word : arr){
            stb.append(word.substring(0,1).toUpperCase()+word.substring(1));

        }
        return stb.toString();
    }
}
