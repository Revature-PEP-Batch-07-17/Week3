package Week3.Day1.CodeEx;

public class Dog extends Animal implements Swimmer {
    private String breed;

    public Dog(String name){
        super(name);
    }

    //getters/setters
    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void eat(){
        System.out.println(name + " eats kibble, but their owner always gives them lots of treats too!");
    }

    public void swim(){
        System.out.println(name + " loves to swim in the pool!");
    }

    public void dive(){
        System.out.println("Because I'm a dog, I'm not very good at diving, but I do dive underwater for the occasional ball!");
    }

    public void show(){
        System.out.println(name + " was voted Best in Show last year since they won the " + breed + " breed division!");
    }
}
