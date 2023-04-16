package interfaces;

import jdk.jshell.PersistentSnippet;

public class Person implements Info{
    public String name;
    public Person(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello i am human!");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is "+name);
    }
}
