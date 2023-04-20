package enumeration;

public class EnumTest {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        System.out.println(animal.name());
        Animal animal2 = Animal.valueOf("CAT");

    }
}
