package coding.interview.javaClass.overridableTrap;

class A {
    A() {
        System.out.println("A constructor");
        show();
    }

    void show() {
        System.out.println("A show");
    }
}