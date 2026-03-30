package coding.interview.javaClass.bossFinal;

class A {
    int a = initA();

    {
        System.out.println("A instance block");
        show();
    }

    A() {
        System.out.println("A()");
    }

    A(int x) {
        System.out.println("A(int)");
    }

    int initA() {
        System.out.println("A field init");
        return 1;
    }

    void show() {
        System.out.println("A show: a = " + a);
    }
}
