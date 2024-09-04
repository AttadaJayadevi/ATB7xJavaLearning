package ex_14072024;

public class Lab055 {
    public static void main(String[] args) {
        //Widening
        byte b = 10;
        int a = b;// valid Implicit casting
        int a1 = (int)b;//valid Explicit casting

        //Narrowing
        int val = 300;
       // byte b1 = val;// invalid implicit casting
        byte b1 = (byte)val;//invalid explicit casting
    }
}
