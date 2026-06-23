package _06OOP.ClassAndInheritance.Exercise6;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double height) {
        this.width = (width >= 0) ? width : 0;
        this.length = (height >= 0) ? height : 0;
    }

    public double getArea() {
        return this.width * this.length;
    }
}


