// ===== 1️⃣ Tạo hierarchy 3 cấp Exception =====
class Level1Exception extends Exception {
    public Level1Exception(String msg) {
        super(msg);
    }
}

class Level2Exception extends Level1Exception {
    public Level2Exception(String msg) {
        super(msg);
    }
}

class Level3Exception extends Level2Exception {
    public Level3Exception(String msg) {
        super(msg);
    }
}

// ===== 2️⃣ Base class A =====
class A {
    void test() throws Level1Exception {
        throw new Level1Exception("Exception from level 1 (A)");
    }
}

// ===== 3️⃣ Class B kế thừa A =====
class B extends A {
    @Override
    void test() throws Level2Exception {
        throw new Level2Exception("Exception from level 2 (B)");
    }
}

// ===== 4️⃣ Class C kế thừa B =====
class C extends B {
    @Override
    void test() throws Level3Exception {
        throw new Level3Exception("Exception from level 3 (C)");
    }
}

// ===== 5️⃣ Main class =====
public class ExceptionHierarchyTest {

    public static void main(String[] args) {

        try {
            A obj = new C();   // Upcasting
            obj.test();       // Gọi method
        } catch (Level1Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
