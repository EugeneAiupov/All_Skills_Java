package CodeWars;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        if (sentence==null || sentence.isEmpty() || sentence == "" || sentence.trim().equals("")){
            return sentence;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=5){
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        return String.join(" ", arr);
    }
}
