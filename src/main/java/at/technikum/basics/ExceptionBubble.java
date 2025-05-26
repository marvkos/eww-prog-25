package at.technikum.basics;

public class ExceptionBubble {

    public static void main(String[] args) {
        try {
            one();
        } catch (Exception e) {
            // solve exception
            throw new RuntimeException(e);
        } finally {
            System.out.println("this is the finally block");
        }

    }

    public static void one() throws Exception {
        two();
    }

    public static void two() throws Exception {
        three();
    }

    public static void three() throws Exception {
        four();
    }

    public static void four() throws Exception {
        throw new Exception();
    }
}
