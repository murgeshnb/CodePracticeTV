package org.example.pgmsOnString;

import java.util.LinkedHashSet;

public class RemoveDuplWord {
    public static void main(String[] args) {
        Object[] obj = {1,  "2", 2, "d", 'd'};
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        for (int i=0; i<obj.length; i++){
            System.out.println(obj[i]);;
        }


        for(String h:hashSet){
            System.out.print(h+" ");
        }

    }
}
