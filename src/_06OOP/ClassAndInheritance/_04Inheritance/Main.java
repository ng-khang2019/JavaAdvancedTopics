package _06OOP.ClassAndInheritance._04Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal unknown = new Animal();
        doAnimalStuff(unknown, "slow");

        Dog unknownDog = new Dog();
        doAnimalStuff(unknownDog, "fast");

        doAnimalStuff(new Dog("Stayed Up","Curled"),"slow");
        doAnimalStuff(new Dog("American Pitbull",65.0),"fast");
        doAnimalStuff(new Dog("Pointy","Short","Doberman",80 ),"very fast");
        doAnimalStuff(new Dog("Pointed Backwards","Curly Hairy","Wolf",150),"very fast");

        Fish fish = new Fish("Bluefin Tuna",550,8,7);
        doAnimalStuff(fish,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------");
    }
}
