package coding.interview.javaClass.inheritance;

public class B extends A {
    B() {
        // java insert super() so A() will be called
        System.out.println("B()");
    }

    B(int x) {
        super(x); // If you write this() → Java will NOT insert super() so no super()
        System.out.println("B(int)");
    }
}
