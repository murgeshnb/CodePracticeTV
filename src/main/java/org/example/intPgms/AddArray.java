package org.example.intPgms;

public class AddArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 8};
        int[] b = {4, 5, 6, 7};

        int maxLength = a.length;
        if(b.length > a.length){
            maxLength = b.length;
        }

        for (int i=0; i<maxLength; i++){
            try {
                System.out.print(a[i]+b[i]+" ");
            }catch (Exception e){
                if(a.length>b.length){
                    System.out.print(a[i]+" ");
                }else {
                    System.out.print(b[i]+" ");
                }
            }
        }

    }
}
