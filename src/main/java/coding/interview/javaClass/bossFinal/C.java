package coding.interview.javaClass.bossFinal;

class C extends B {
    int c = initC();

    {
        System.out.println("C instance block");
        show();
    }

    C() {
        System.out.println("C()");
    }

    int initC() {
        System.out.println("C field init");
        return 3;
    }

    @Override
    void show() {
        System.out.println("C show: a = " + a + ", b = " + b + ", c = " + c);
    }
}