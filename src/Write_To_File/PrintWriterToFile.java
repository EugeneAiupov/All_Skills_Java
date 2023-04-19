package Write_To_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\ForReader");
        //данный класс PrintWriter предназначен для записи строк
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello!");
        pw.println("It is my first write in this file:)");
        int x = 0;

        for (int i = 0; i < 1000000; i++) {
            pw.println(i+" - " +x);
            x++;
        }
        pw.close();

    }
}
