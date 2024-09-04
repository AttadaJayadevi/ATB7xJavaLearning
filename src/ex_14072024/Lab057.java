package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_price = course+GST;//implicit narrowing
        int total_price = course+(int)GST;//explicit narrowing--loss
        System.out.println(total_price);

    }
}
