package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = new String("promod");
        String s2 = new String("promod");
        String s3 = new String("promod");

        System.out.println(s1 == s2);//check for reference
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));//check for content
    }
}
