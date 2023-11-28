package org.example.intPgms;

public class PrimeNumber {
    public static void main(String[] args) {
        int no=7;
        int i=2;

        while (i<no){
            if(i%2 ==0){
                break;
            }else {
                i++;
            }
        }

        if(i ==no ){
            System.out.println("prime no");
        }else {
            System.out.println("not a prime");
        }
    }
}
