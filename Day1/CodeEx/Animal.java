package Week3.Day1.CodeEx;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("ZZZzzzZZZ");
    }
}
