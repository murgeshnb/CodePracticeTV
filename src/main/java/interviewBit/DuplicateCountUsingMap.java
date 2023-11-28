package interviewBit;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateCountUsingMap {
    public static void main(String[] args) {
        String word = "aabcFGGdddd";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else {
                int count = map.get(ch);
                count = count+1;
                map.put(ch, count);
            }
        }

        for (Map.Entry<Character, Integer> a :map.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
