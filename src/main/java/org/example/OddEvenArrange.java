package org.example;

import org.testng.annotations.Test;

public class OddEvenArrange {
    @Test
    public void arrangeEven() {
        int[] arr = {1, 3, 2, 5, 6, 4, 7, 8, 9};
        int[] arr2 = new int[arr.length];

        int m = 0;
        int n = arr2.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[m] = arr[i];
                m++;
            } else {
                arr2[n] = arr[i];
                n--;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    @Test
    public void withOutNewArray(){
        int[] arr = {1, 3, 2, 5, 6, 4, 7, 8, 9};
        int evenIndex = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                int temp = arr[evenIndex];
                arr[evenIndex]= arr[i];
                arr[i] = temp;
                evenIndex++;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


}