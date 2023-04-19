package Serializable;

import java.io.Serializable;

//Сериализация и десериализация нужна для записи объекта, для сериализации необходимо имплементировать интерфейс Serializable
public class Person implements Serializable {
    private int Id;
    private String name;

    public Person(int Id, String name){
        this.Id = Id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return Id+" : "+name;
    }
}
