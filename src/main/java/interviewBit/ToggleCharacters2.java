package interviewBit;

public class ToggleCharacters2 {
    public static void main(String[] args) {
        String word = "aPplE7";

        for (char ch:word.toCharArray()){
            if (ch >='a' && ch <='z'){
                System.out.print((char) (ch-32));
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char) (ch+32));
            }else {
                System.out.print(ch);
            }

        }
    }
}
