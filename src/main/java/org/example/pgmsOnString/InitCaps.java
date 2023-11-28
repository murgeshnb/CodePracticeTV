package org.example.pgmsOnString;

public class InitCaps {
    public static void main(String[] args) {
        String sentence = "welcome to testVagrant";
        char firstWord = (char) (sentence.charAt(0) - 32);
        System.out.print(firstWord);

        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                char word = (char) (sentence.charAt(i + 1) - 32);
                System.out.print(" "+word);
                i++;
            } else {
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
