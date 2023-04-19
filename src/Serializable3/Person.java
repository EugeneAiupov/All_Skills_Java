package Serializable3;

import java.io.Serializable;
//запрет на сериализацию поля нейм ключевое слово transient
//serial version new uid -> необходим для сохранения структуры класса в сохранении объекта класса
public class Person implements Serializable {
    private int Id;
    private transient String name;
    private static final long serialVersionUID = -12838947123894732L;
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
