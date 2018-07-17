package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Programming\\LessonsJava\\src\\lesson36\\test";
        File file = new File(path);

        Scanner scanner = new Scanner(file);



        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
