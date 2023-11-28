package interviewBit;

public class ToggleCharacters {
    public static void main(String[] args) {
        String word = "aPplE7";
        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                str.append((char) (ch + 32));
            }else if(ch >= 'a' && ch<='z'){
                str.append((char) (ch-32));
            }else {
                str.append(ch);
            }
        }

        System.out.println(str);
    }
}
