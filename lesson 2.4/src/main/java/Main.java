import java.io.IOException;
import java.util.*;

public class Main {
    static final String FILE_NAME1 = "C://JAVA/Java2Lesson3Homework3.txt";
    static final String FILE_NAME2 = "array.txt";


    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Не удалось заполнить массив из файла!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Не удалось заполнить массив из файла!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Иванов");
        phonebook.add(5678794, "Иванов");
        phonebook.add(3456783, "Петров");
        phonebook.add(3456278, "Сидоров");
        phonebook.add(9786053, "Сидоров");
        phonebook.add(6475893, "Сидоров");

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Макеев");
    }
}
