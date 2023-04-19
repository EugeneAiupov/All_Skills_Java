package Serializable2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Первый метод записывания массива в файл
public class WriteObjectMaassive {
    public static void main(String[] args) throws IOException {
        Person[] people = {new Person(1, "Tom"), new Person(2, "Madison"), new Person(3, "Tom")};

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Марго\\IdeaProjects\\Study_Project\\Content\\massive.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(people.length);
        for(Person person : people){
            oos.writeObject(person);
        }
        fos.close();
        oos.close();
    }
}
