package practiceTV;

public class mergeTwoArraysUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 40, 50};
        int[] arr2 = {1, 5, 10, 20, 20, 65, 100};

        int maxLength = arr1.length + arr2.length;
        int[] mergedArray = new int[maxLength];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        //bubble sort
        for (int j = 0; j < mergedArray.length; j++) {
            for (int i = 1; i < mergedArray.length; i++) {
                if (mergedArray[i-1] > mergedArray[i]) {
                    int temp = mergedArray[i-1];
                    mergedArray[i-1] = mergedArray[i];
                    mergedArray[i] = temp;
                }
            }
        }
        System.out.println();
        for (int i=0; i<mergedArray.length; i++){
            System.out.print(mergedArray[i]+" ");
        }

    }
}