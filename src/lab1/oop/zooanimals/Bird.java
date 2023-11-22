package lab1.oop.zooanimals;

public class Bird extends Animal{
private float wingSpan;

    public Bird(float wingSpan) {
        setWingSpan(wingSpan);
    }

    public Bird(String name, String sound, float wingSpan) {
        super(name, sound);
        setWingSpan(wingSpan);
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird");
        System.out.println(wingSpan);
        super.makeSound();
    }
}
