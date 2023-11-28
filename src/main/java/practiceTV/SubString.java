package practiceTV;

public class SubString {
    public static void main(String[] args) {
        String word = "abcd";

        for (int i=0; i<word.length(); i++){
            for (int j=i; j<word.length(); j++){
                String substring = word.substring(i, j + 1);
                System.out.print(substring+" ");
            }

        }
    }

}
