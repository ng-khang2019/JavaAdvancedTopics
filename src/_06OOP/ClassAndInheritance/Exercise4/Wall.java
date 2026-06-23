package _06OOP.ClassAndInheritance.Exercise4;

public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {
        this.height = (height >= 0) ? height : 0;
        this.width = (width >= 0) ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height >= 0) ? height : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 0) ? width : 0;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
