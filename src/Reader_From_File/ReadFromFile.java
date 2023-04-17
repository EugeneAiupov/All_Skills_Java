package Reader_From_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separ = File.separator;
        String path = "C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\ForReader";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        /*while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }*/
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
