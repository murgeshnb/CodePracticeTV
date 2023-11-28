package interviewBit;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(c+" ");

        for (int i=0; i<5; i++){
            a=b;
            b=c;
            c=b+a;
            System.out.print(c+" ");
        }
    }
}
