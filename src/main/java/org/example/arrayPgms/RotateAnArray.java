package org.example.arrayPgms;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int noOfTimesToRotate = scanner.nextInt();
        int[] arrNos = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++){
            arrNos[i] = scanner.nextInt();
        }

        //logic
        for (int i=0; i<noOfTimesToRotate; i++){
            int temp = arrNos[0];
            for (int j=0; j<arrNos.length-1; j++){
                arrNos[j] = arrNos[j+1];
            }
            arrNos[arrNos.length-1] = temp;
        }

        for (int i=0; i<arrNos.length; i++){
            System.out.print(arrNos[i]+" ");
        }
    }
}
