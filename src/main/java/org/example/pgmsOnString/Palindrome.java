package org.example.pgmsOnString;

public class Palindrome {
    public static void main(String[] args) {
        String word = "gadag";
        String rev = "";

        for (int i=word.length()-1; i>=0; i--){
            rev = rev + word.charAt(i);
        }

        if(word.equals(rev)){
            System.out.println("palindrome "+ word);
        }
    }
}
