package org.example.pgmsOnString;

import org.testng.annotations.Test;

public class ReverseSentence {
    @Test
    public void reverseSentence() {
        String word = "This is sample";
        String[] split = word.split(" ");

        for(int i= split.length-1; i>=0; i--){
            System.out.print(split[i]+" ");
        }
    }

}
