package interviewBit;

public class CountDigits {
    public static void main(String[] args) {
        int n = -1;
        if(n<0) n = -n;
        System.out.println("po "+n);
        int count = 0;
        while (n>0){
            count = count+1;
//            int c = n%10;
            n=n/10;
        }
        System.out.println(count);
    }
}
