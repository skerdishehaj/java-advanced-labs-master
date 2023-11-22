package lab1.oop.zooanimals;

public class Mammal extends Animal{
    private String furColor;

    public Mammal(String furColor) {
        this.furColor = furColor;
    }

    public Mammal(String name, String sound, String furColor) {
        super(name, sound);
        setFurColor(furColor);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound () {
        System.out.println("Mammal");
        System.out.println(getFurColor());
        super.makeSound();
    }

}
