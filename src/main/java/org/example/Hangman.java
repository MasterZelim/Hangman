package org.example;

public class Hangman {
    private static String hangman;
    public static String getHangmanErrorZero() {
        return hangman = """
                  |------|
                  |     
                  |
                  |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorOne() {
        return hangman = """
                  |------|
                  |      О
                  |
                  |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorTwo() {
        return hangman = """
                  |------|
                  |      О
                  |      |
                  |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorThree() {
        return hangman = """
                  |------|
                  |      О
                  |     /|
                  |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorFour() {
        return hangman = """
                  |------|
                  |      О
                  |     /|\\
                  |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorFive() {
        return hangman = """
                  |------|
                  |      О
                  |     /|\\
                  |      |
                  |
                __|___ 
                """;
    }
    public static String getHangmanErrorSix() {
        return hangman = """
                  |------|
                  |      О
                  |     /|\\
                  |      |
                  |     /
                __|___ 
                """;
    }
    public static String getHangmanErrorSeven() {
        return hangman = """
                  |------|
                  |      О
                  |     /|\\
                  |      |
                  |     / \\
                __|___ 
                """;
    }
}
