package geeksForGeeks;

public class BuilderBuffer {
    static void concat1(String s1){
        s1= s1 + "for geeks";
        System.out.println("inside "+s1);
    }
    static void concat2(StringBuilder s2){
        s2.append("for geeks");
    }
    static void concat3(StringBuffer s3){
        s3.append("for geeks");
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        concat1(s1);
        System.out.println(s1);

        StringBuilder builder = new StringBuilder("Geeks");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer("Geeks");
        concat3(buffer);
        System.out.println(buffer);
    }
}
