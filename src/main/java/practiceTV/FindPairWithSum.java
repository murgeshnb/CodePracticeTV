package practiceTV;

import java.util.HashSet;


public class FindPairWithSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3, 9, -1, 11};
        int targetSum = 10;

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;

            if(seenNumbers.contains(complement)){
                System.out.println(num+" and "+ complement);
            }
            seenNumbers.add(num);
        }
    }
}



