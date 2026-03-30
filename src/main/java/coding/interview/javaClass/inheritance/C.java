package coding.interview.javaClass.inheritance;

public class C extends B {
    C() {
        this(10); //A() B() C(int)
        System.out.println("C()"); //A() B() C(int) C()
    }

    C(int x) {
        // java inserts super() so B() called in here // A() B() C(int)
        System.out.println("C(int)");
    }
}
