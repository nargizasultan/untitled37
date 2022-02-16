package peaksoft;

public class Horse extends AbstractAnimal{
    private String color;

    public Horse(float weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }
    public Horse(){}


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}