package javaPractice.ex5;

import javaPractice.ex5.MyException;

public class TestMyException {

    public static void main(String[] args) {

        try {
            // Ném custom exception
            throw new MyException("This is my custom exception message");
        } catch (MyException e) {
            // Bắt exception và gọi method in message
            e.printMessage();
        }
    }
}