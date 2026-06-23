package _06OOP.ClassAndInheritance._01ClassObjectEncapsulation;

public class Main {
    public static void main(String[] args) {

        // Java automatically assigns default values if an Object is created without any arguments
        Car00 car = new Car00();
        System.out.println(car.carInfo() + "\n"); // null, null, null, 0, false

        // Object created with default values modified in its class
        Car newCar = new Car();
        System.out.println(newCar.carInfo() + "\n");

        // Use setters to modify values without accessing the fields directly
        newCar.setMake("Tesla");
        newCar.setModel("Model S");
        newCar.setColor("Red");
        newCar.setDoors(4);
        System.out.println(newCar.carInfo() + "\n");

        // Uninitialized object
        Car car2;
        // car2.setMake("Ferrari");  //car2 is not initialized yet, so this will cause an error at compile time

        // Null object
        Car car3 = null;
        // car3.setMake("Lamborghini");  //car3 is null, so this will throw an exception at runtime
    }
}
