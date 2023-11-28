package org.example.pgmsOnString;

import org.testng.annotations.Test;

import java.util.HashSet;

public class StringCount {
    @Test
    public void shouldTestCountOfLetters() {
        String input = "abaacdbb";
        char[] charArray = input.toCharArray();
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < charArray.length; i++) {
            hashSet.add(charArray[i]);
        }

        for (char ind : hashSet) {
            int count = 0;
            for (int i = 0; i < charArray.length - 1; i++) {
                if (ind == charArray[i]) {
                    count++;
                }
            }
            System.out.print(ind + "" + count + " ");
        }


    }

    @Test
    public void countNextToWord() {
        String input = "abaaacdbb";
        char[] charArray = input.toCharArray();

        for (int i = 1; i < charArray.length; i++) {
            int count = 1;
//            if (charArray[i-1] == charArray[i]) {
//                count++;
//                i++;
//            }

            while (charArray[i-1] == charArray[i]){
                count++;
                i++;
            }
            System.out.print(charArray[i-1] + "" + count + " ");
        }


    }


}


//    "Coding :
//    Input: abaacdbb
//    Output:a1b1a2c1d1b2"
