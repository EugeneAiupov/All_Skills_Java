package Serializable;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1+"\n"+person2);
            fis.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("Ошибка!");;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
