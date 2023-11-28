package org.example;

import org.testng.annotations.Test;

public class OddEvenArrange2 {
    @Test
    public void arrangeWithNewArray() {
        int[] a = {2, 3, 5, 6, 8, 7, 1};
        int[] b = new int[a.length];

        int m = 0;
        int n = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[m] = a[i];
                m++;
            } else {
                b[n] = a[i];
                n--;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    @Test
    public void arrangeWithoutNewArray() {
        int[] arr = {1, 3, 6, 8, 4, 5, 10, 12, 2, 7, 9};
        int evenIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[i];
                arr[i] = temp;
                evenIndex++;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}