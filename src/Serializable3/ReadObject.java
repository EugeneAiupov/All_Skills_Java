package Serializable3;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person = (Person) ois.readObject();
            System.out.println(person);
            fis.close();
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
