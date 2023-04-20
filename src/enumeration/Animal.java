package enumeration;

public enum Animal {
    DOG("Домашняя"), CAT("Домашняя"), FROG("Дикая");
    private String type;
    Animal(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
