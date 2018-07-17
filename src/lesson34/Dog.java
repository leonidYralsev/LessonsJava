package lesson34;



public class Dog extends Animal{
    private String name;
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public String toString() {
        return this.name;
    }
}


