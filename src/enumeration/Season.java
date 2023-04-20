package enumeration;

public enum Season {
    SUMMER("Лето"), WINTER("Зима"), AUTUMN("Осень"), SPRING("Весна");
    private String translation;
    private Season(String translotion){
        this.translation = translotion;
    }
    public String getTranslation(){
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык: "+translation;
    }
}
