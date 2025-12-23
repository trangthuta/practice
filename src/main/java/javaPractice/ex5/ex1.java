package javaPractice.ex5;

public class ex1 {

    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception message");
        } catch (Exception a) {
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

    }
}
