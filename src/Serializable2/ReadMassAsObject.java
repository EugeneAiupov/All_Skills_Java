package Serializable2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadMassAsObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\massive.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] person = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(person));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
