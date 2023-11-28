package org.example.intPgms;

public class Factorial {
    public static void main(String[] args) {
        int no =5;
        int factValue = 1;

        for (int i=no; i>=1; i--){
            factValue = factValue * i;
        }
        System.out.println(factValue);
    }
}
