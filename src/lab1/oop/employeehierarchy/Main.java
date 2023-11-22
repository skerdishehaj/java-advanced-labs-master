package lab1.oop.employeehierarchy;

public class Main {
    public static void main (String[] args) {
        Employee e1 = new Employee("Skerdi", 1000);
        Manager m1 = new Manager(e1, 5);
        Director d1 = new Director(m1, 95000);
        System.out.println(e1);
        System.out.println();
        System.out.println(m1);
        System.out.println();
        System.out.println(d1);
    }
}
