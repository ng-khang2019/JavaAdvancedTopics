package _06OOP.ClassAndInheritance._04Inheritance;

public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight,int gills, int fins) {
        super(type,
                (weight < 80) ? "Small" : (weight < 180) ? "Medium" : "Large",
                weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("Muscles moves");
    }

    private void moveBackFin() {
        System.out.println("Backfin moves");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed.equals("fast")) {
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                 '\'' +
                "} " + super.toString();
    }
}
