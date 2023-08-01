package Week3.Day1.CodeEx;

public class Pelican extends Animal implements Flyer, Swimmer {

    private int diveDepth;

    public Pelican(String name){
        super(name);
    }

    //create getters/setters
    public int getDiveDepth(){
        return diveDepth;
    }

    public void setDiveDepth(int diveDepth){
        this.diveDepth = diveDepth;
    }

    @Override
    public void eat(){
        System.out.println(name + " loves to eat fish that it catches when diving");
    }

    public void swim(){
        System.out.println(name+" swims on top of the water for a rest");
    }

    public void dive(){
        System.out.println(name+" dives at a depth of "+this.diveDepth+" meters");
    }

    public void fly(){
        System.out.println(super.name + " flies over the ocean looking for food" );
    }
}
