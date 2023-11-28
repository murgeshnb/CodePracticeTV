package org.example.pgmsOnString;

public class SeparateCharacters {
    public static void main(String[] args) {
        String word = "Salaga123$%^&*(x";
        String words = "";
        String spl = "";
        String digits = "";
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) >= 65 && word.charAt(i) <= 90) || (word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                words = words+ word.charAt(i);
            }else if(word.charAt(i)>=48 && (word.charAt(i)<=57)) {
                digits = digits + word.charAt(i);
            }else {
                spl = spl + word.charAt(i);
            }
        }

        System.out.println(words+" "+ spl+ " "+ digits);

    }
}
