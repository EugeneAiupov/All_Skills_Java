package Serializable2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\massive.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            Person[] person = new Person[count];

            for (int i = 0; i < count; i++) {
                person[i] = (Person) ois.readObject();

            }
            System.out.print(Arrays.toString(person));
            fis.close();
            ois.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
