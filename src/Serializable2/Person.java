package Serializable2;

import java.io.Serializable;

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
