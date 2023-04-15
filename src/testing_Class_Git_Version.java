public class testing_Class_Git_Version {
    public static void main(String[] args) {
        Human h1 = new Human("Вася", 26);
        System.out.println(h1.toString());
    }
}
class Human{
    private final int age;
    private final String name;

    public Human(String name, int age){
        this.age = age;
        this.name = name;

    }
    @Override
    public String toString(){
        return String.format("Првиет меня зовут %s мне %d лет", name,age);
    }

}
