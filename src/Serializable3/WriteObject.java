package Serializable3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        try {
            FileOutputStream fos = new FileOutputStream("\\C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);

            fos.close();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
