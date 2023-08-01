package Week3.Day1.CodeEx;

public class Main {
    public static void main(String[] args){
        Dog rover = new Dog("Rover");
        rover.eat();
        rover.setBreed("Pug");
        rover.show();
        rover.swim();
        rover.dive();
        System.out.println("~~~~~~~~~~~~~~~");

        Pelican pete = new Pelican("Pete");
        pete.eat();
        pete.setDiveDepth(32);
        pete.dive();
        pete.swim();
        pete.fly();
        System.out.println("~~~~~~~~~~~~~~~");


        Tortoise topsy = new Tortoise("Topsy");
        topsy.eat();
        topsy.sleep();

    }
}
