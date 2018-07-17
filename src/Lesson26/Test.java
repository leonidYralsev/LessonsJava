package Lesson26;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");

        animal.sleep();
        person.sayHello();

        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Denis");

        info1.showInfo();
        info2.showInfo();

        outputInfo(animal);
        outputInfo(person);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
