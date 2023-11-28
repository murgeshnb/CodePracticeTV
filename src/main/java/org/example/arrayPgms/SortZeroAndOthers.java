package org.example.arrayPgms;

public class SortZeroAndOthers {
    public static void main(String[] args) {
        int[] a = {1, 4, 0, 9, 0, 88, 0, 30, 5};
        int[] b = new int[a.length];

        int m =0;
        int n = b.length-1;

        for (int i=0; i<a.length; i++){
            if(a[i]==0){
                b[m] = a[i];
                m++;
            }else {
                b[n]=a[i];
                n--;
            }
        }

        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
