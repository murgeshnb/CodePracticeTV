package org.example.pgmsOnString;

public class Immutable {
    public static void main(String[] args) {
        String word = "hello";
        word = word.concat("world");
        System.out.println(word);
    }

}
