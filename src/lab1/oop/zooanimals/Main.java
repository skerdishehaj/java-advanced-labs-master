package lab1.oop.zooanimals;

public class Main {
    public static void main(String[] args) {
       Mammal m1 = new Mammal("Panda" , "oghh", "Black and White");
       Bird b1 = new Bird("Bilbil", "Ciu Ciu", 10.5F);
       m1.makeSound();
       b1.makeSound();
    }
}
