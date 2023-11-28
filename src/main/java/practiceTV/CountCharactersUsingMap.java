package practiceTV;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountCharactersUsingMap {
    public static void main(String[] args) {
        String word = "AABBBCCCC";
        TreeSet<Character> set = new TreeSet();

        char[] charArray = word.toCharArray();

        for (char d : charArray) {
            set.add(d);
        }

        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (char c : set) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    treeMap.put(c, treeMap.getOrDefault(c, 0)+1);
                }
            }
        }

        for (Map.Entry<Character, Integer> map:treeMap.entrySet()){
            System.out.println(map.getKey()+" "+ map.getValue());
        }
    }
}
