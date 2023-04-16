public class testing_Class_Git_Version {
    public static void main(String[] args) {

    }
}
class Human{
    private int age;
    private String name;

    public Human(String name, int age){
        this.age = age;
        this.name = name;

    }
    @Override
    public String toString(){
        return String.format("Првиет меня зовут %s мне %d лет", name,age);
    }

}

class Employee extends Human{
    public Employee(String name, int age){
        super(name, age);

    }
}



