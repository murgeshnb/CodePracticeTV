package org.example.intPgms;

public class NumPalindrome {
    public static void main(String[] args) {
        int no = 1001;
        System.out.println(no % 10);
        System.out.println(no / 10);
        if (isPalindrome(no)) {
            System.out.println("it is a palindrome " + no);
        } else {
            System.out.println("not a palindrome " + no);
        }

    }

    private static boolean isPalindrome(int no) {
        if (no < 0) {
            return false;
        }
        int orgNumber = no;
        int reverseNumber = 0;

        while (orgNumber!= 0) {
            int lastDigit = orgNumber % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            orgNumber = orgNumber / 10;
        }
        System.out.println(no+" "+reverseNumber);
        return reverseNumber == no;
    }
}
