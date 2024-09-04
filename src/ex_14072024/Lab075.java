package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String name = "The testing academy";
        String name1 = "The testing academy";

        String name2 = new String("The testing academy");//heap area
        String name3 = new String("The testing academy");

        System.out.println(name == name1);//check for reference
        System.out.println(name.equals(name1));//check for content

        System.out.println(name1 == name2);//check for reference
    }
}
