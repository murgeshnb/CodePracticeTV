package practiceTV;

public class CountWords {
    public static void main(String[] args) {
        String str = "One two three  four five";
        String[] split = str.split(" ");
        for (int i=0; i<split.length; i++){
            System.out.print(split[i]+" ");
        }

//        str = str.replaceAll("\n", " ");
//        str = str.replaceAll("\t", " ");
//        System.out.println(str);
//        System.out.println(str.split(" ").length);

    }
}
