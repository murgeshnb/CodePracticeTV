package org.example.pgmsOnString;

import java.util.HashSet;

public class PrintDupl {
    public static void main(String[] args) {
        String word = "hello";
        HashSet<Character> charactersSet = new HashSet<>();
        for (int i=0; i<word.length(); i++){
            charactersSet.add(word.charAt(i));
        }

        for(char ind:charactersSet){
            int count=0;
            for (int i=0; i<word.length(); i++){
                if(ind == word.charAt(i)){
                    count++;
                }
            }
                System.out.print(ind+""+count);

        }

    }
}
