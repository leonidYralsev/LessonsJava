package lesson33;

import java.util.ArrayList;
import java.util.List;

/**
 * Введение в Generics
 */
public class Test {
    public static void main(String[] args) {
        /////////////Java 5//////////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = animals.get(1).toString();

        System.out.println(animal);

        ////////////С появлением Generics//////////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("frog");

        animal = animals1.get(1);

        System.out.println(animal);
        ////////////Java 7//////////////////////////
        List<String> animals2 = new ArrayList<>();

    }
}
