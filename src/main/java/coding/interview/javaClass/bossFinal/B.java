package coding.interview.javaClass.bossFinal;

class B extends A {
    int b = initB();

    {
        System.out.println("B instance block");
        show();
    }

    B() {
        this(5);
        System.out.println("B()");
    }

    B(int x) {
        super(x);
        System.out.println("B(int)");
    }

    int initB() {
        System.out.println("B field init");
        return 2;
    }

    @Override
    void show() {
        System.out.println("B show: a = " + a + ", b = " + b);
    }
}