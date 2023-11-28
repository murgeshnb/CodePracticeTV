package interviewBit;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String word = "ghost shiva";
        word = word.replaceAll("\\s", "").toLowerCase();


    }

    static boolean isVowel(char ch){
        if(ch == 'a'|| ch == 'e'|| ch =='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }

}
