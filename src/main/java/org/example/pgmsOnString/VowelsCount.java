package org.example.pgmsOnString;

public class VowelsCount {
    public static void main(String[] args) {
        String[] s = {"apple", "banana"};

        for (int i=0; i<s.length; i++){
            String word = s[i];
            int count =0;
            for (int j=0; j<word.length(); j++){
                char ch = word.charAt(j);
                if(ch == 'a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                    count++;
                }
            }

                System.out.println(word +" "+ count);
        }
    }

}
