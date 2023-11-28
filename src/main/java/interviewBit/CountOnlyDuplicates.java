package interviewBit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOnlyDuplicates {
    public static void main(String[] args) {
        String word = "hello world";
        word = word.replaceAll("\\s", "").toLowerCase();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        //print
        for (Map.Entry e:map.entrySet()){
            System.out.println(e);
        }
    }
}
