package javaPractice.ex5;

class MyException extends Exception {

    // Biến để lưu String
    private String message;

    // Constructor nhận String và lưu vào object
    public MyException(String message) {
        this.message = message;
    }

    // Phương thức in ra String đã lưu
    public void printMessage() {
        System.out.println(message);
    }
}