package _06OOP.ClassAndInheritance._01ClassObjectEncapsulation;

// Class is like a blueprint for creating objects
public class Car {

    // These are the fields/states of the Car class
    public String make = "Ford";
    public String model = "Mustang";
    public String color = "Navy Blue";
    private int doors = 2;
    private boolean convertible = false;

    // These are the methods/behaviors of the Car class
    public void start() {
        System.out.println("Vroom!");
    }

    public void stop() {
        System.out.println("Brrrr!");
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
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
