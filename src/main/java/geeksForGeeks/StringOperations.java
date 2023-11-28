package geeksForGeeks;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Tam";
        String s2 = "Shyam";

        String s3 = new String("Hi");
        String s4 = new String("Hi");


        // == operator
        System.out.println(s1 == s2);

        // equals()
        System.out.println(s1.equals(s2));

        // compareTo
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s4));
    }
}
