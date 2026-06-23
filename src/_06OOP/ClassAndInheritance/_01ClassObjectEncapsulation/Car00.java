package _06OOP.ClassAndInheritance._01ClassObjectEncapsulation;

public class Car00 {
    // These are the fields/states of the Car class
    public String make;
    public String model;
    public String color;
    private int doors;
    private boolean convertible;

    // These are the methods/behaviors of the Car class
    public void start() {
        System.out.println("Vroom!");
    }

    public void stop() {
        System.out.println("Brrrr!");
    }

    public String carInfo() {
        String info = "Make: " + make +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nDoors: " + doors +
                "\nConvertible: " + convertible;
        return info;
    }
}
