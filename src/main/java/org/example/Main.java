package org.example;

import java.util.*;

public class Main {

    private static int errors = 0; //учет количества ошибок
    private static final int errorsMax = 7; // максимальное количество ошибок
    private static final Set<String> errorsLetter = new HashSet<>(); //учет неправильных букв
    private static char[] word;// загаданное слово
    private static char[] wordCopy;// копия загаданного слова

    public static void main(String[] args) {

        do {

            word = Dictionary.getRandomWord().toCharArray(); // получаем случайное слово из словаря
            wordCopy = new char[word.length]; // создаем копию полученного слова
            Arrays.fill(wordCopy, '_'); // скрываем буквы в копии
            Scanner scanner = new Scanner(System.in);
            printHangman(); //печатаем виселицу
            do {
                boolean win = true;
                for (char c : wordCopy) { //проверяем победил ли игрок
                    if (c == '_') {
                        win = false;
                    }
                }

                if (errors == errorsMax) { //проверяем проиграл ли игрок

                    System.out.println("\nВы проиграли!\n");
                    System.out.println("Новая игра!");
                    errors = 0;
                    errorsLetter.clear();
                    break;
                } else if (win) {   //проверяем победил ли игрок
                    System.out.println("\nВы победили!\n");
                    System.out.println("Новая игра!");
                    errors = 0;
                    errorsLetter.clear();
                    break;
                }

                System.out.println("\nВведите букву:");
                String enteredLetter = scanner.nextLine().toLowerCase();

                if (errorsLetter.contains(enteredLetter)) {
                    System.out.println("Вы уже использовали данную букву! Введите другую букву!");
                    continue;
                } else if (!enteredLetter.matches("[а-яА-Я]+")) {
                    System.out.println("Вы ввели некорректный символ! Введите букву!");
                    continue;
                }
                check(enteredLetter);//проверяем есть ли введенный символ в загаданном слове
                printHangman();
            } while (true);

        } while (true);
    }

    public static void check(String enteredLetter) {

        boolean errorBoolean = true;
        for (int i = 0; i < word.length; i++) {
            if (enteredLetter.contains(String.valueOf(word[i]))) {//проверяем есть ли введенный символ в загаданном слове
                wordCopy[i] = enteredLetter.charAt(0);
                errorBoolean = false;
            }
        }
        if (errorBoolean) {
            errorsLetter.add(enteredLetter); // добавляем неправильно введенные буквы в множество
            errors++; // увеличиваем количество ошибок
        }
    }

    public static void printHangman() { // распечатываем виселицу

        switch (errors) {
            case (0) -> {
                System.out.println(Hangman.getHangmanErrorZero());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (1) -> {
                System.out.println(Hangman.getHangmanErrorOne());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (2) -> {
                System.out.println(Hangman.getHangmanErrorTwo());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (3) -> {
                System.out.println(Hangman.getHangmanErrorThree());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (4) -> {
                System.out.println(Hangman.getHangmanErrorFour());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (5) -> {
                System.out.println(Hangman.getHangmanErrorFive());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (6) -> {
                System.out.println(Hangman.getHangmanErrorSix());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
            case (7) -> {
                System.out.println(Hangman.getHangmanErrorSeven());
                System.out.println("Слово:" + String.valueOf(wordCopy));
                System.out.println("Ошибки" + "(" + errors + "):" + errorsLetter);
            }
        }
    }
}