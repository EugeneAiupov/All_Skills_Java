package Serializable2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// запишем сам массив, массив является объектом
public class WriteMassInToFile {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Tom"), new Person(2, "Madison"), new Person(3, "Tom")};
        try {
            FileOutputStream fis = new FileOutputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\massive.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(people);
            oos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
