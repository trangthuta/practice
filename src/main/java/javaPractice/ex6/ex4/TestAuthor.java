package javaPractice.ex6.ex4;

public class TestAuthor {
    public static void main(String[] args) {
        ex4.Author a = new ex4.Author("Ta Thi Thu Trang", "trangthuta9999@gmail.com", 'f');
        System.out.println(a);
        System.out.println("Ten : " + a.getName());
        a.setEmail("trang@email.com");
        System.out.println("Email : " + a.getEmail());
        String gt ;
        if (a.getGender() == 'f')
        {
            gt = " Female";
        }else {
            gt = "men";
        }
        System.out.println("Gioi tinh : " + gt);


    }
}
