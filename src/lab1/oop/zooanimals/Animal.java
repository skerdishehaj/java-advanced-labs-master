package lab1.oop.zooanimals;

public class Animal {
    private String name;
    private String sound;

    public Animal() {
    }

    public Animal(String name, String sound) {
        setName(name);
        setSound(sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound);
    }
}
