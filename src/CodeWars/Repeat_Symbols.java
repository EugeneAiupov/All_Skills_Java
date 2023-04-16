package CodeWars;

import java.util.Map;

public class Repeat_Symbols {
    public static void main(String[] args) {

    }

    public static int duplicateCount(String text) {
        int count = 0;
        text = text.toLowerCase();
        while(text.length()>0){
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)){
                count++;
            }
            text = text.replace(firstLetter,"");
        }
        return count;

    }
}
