package _06OOP.ClassAndInheritance._04Inheritance;

import java.util.Objects;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super();
    }

    public Dog(String earShape, String tailShape) {
        this(earShape, tailShape, "Chihuahua", 10);
    }

    public Dog(String type, double weight) {
        this("Perky", "Straight", type, weight);
    }

    public Dog(String earShape, String tailShape, String type, double weight) {
        super(type,
                (weight < 15 ) ? "Small" : (weight < 70) ? "Medium" : "Large",
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    public void bark() {
        System.out.println("The dog barks");
    }

    public void run() {
        System.out.println("The dog runs");
    }

    public void walk() {
        System.out.println("The dog walks");
    }

    public void wagTail() {
        System.out.println("The dog wags its tail");
    }

    public void makeNoise() {
        bark();
        if (type.equals("Wolf")) {
            System.out.println("Ow woooooo! ");
        } else {
            System.out.println("Woof! ");
        }
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("The dog walks, runs  and barks");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            bark();
            run();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
