package coding.interview.javaClass.overridableTrap;

class B extends A {
    int x = 10;

    B() {
        // java inserts super()
        System.out.println("B constructor");
    }

    @Override
    void show() {
        System.out.println("B show: x = " + x);
    }
}