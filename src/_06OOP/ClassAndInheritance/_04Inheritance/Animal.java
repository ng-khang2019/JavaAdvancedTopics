package _06OOP.ClassAndInheritance._04Inheritance;

public class Animal {
    // protected means that the type is accessible to subclasses in the same package
    String type;
    private String size;
    private double weight;

    public Animal() {
        this.type = "Unknown";
        this.size = "Unknown";
        this.weight = 50;
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed) {
        System.out.println("The " + type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println("The " + type + " makes some kind of noise.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
