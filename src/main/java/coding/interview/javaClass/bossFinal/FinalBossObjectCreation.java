package coding.interview.javaClass.bossFinal;

public class FinalBossObjectCreation
{
    public static void main(String[] args) {
        new C();
    }

    // Do this
    /*
    A field init
A instance block
C show: a = 1, b = 0, c = 0
A(int)
B field init
B instance block
C show: a = 1, b = 2, c = 0
B(int)
B()
C field init
C instance block
C show: a = 1, b = 2, c = 3
C()
     */
}
