package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

    private static final List<String> dictionary = new ArrayList<>();

    public static String getRandomWord() {

        try (FileReader fileReader = new FileReader("src/main/resources/dictionary.txt"); Scanner scanner = new Scanner(fileReader)) {

            while (scanner.hasNextLine()) {
                dictionary.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dictionary.get(new Random().nextInt(dictionary.size()));

    }
}
