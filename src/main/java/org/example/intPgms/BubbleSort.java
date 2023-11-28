package org.example.intPgms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 10, 50, 78};

        for (int j=0; j<arr.length; j++){
            for (int i=1; i<=arr.length-1; i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
