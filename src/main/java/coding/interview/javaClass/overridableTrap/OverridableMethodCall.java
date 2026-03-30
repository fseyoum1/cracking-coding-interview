package coding.interview.javaClass.overridableTrap;

public class OverridableMethodCall
{
    public static void main(String[] args) {
        B obj = new B();
        // Ans A constructor, B show: x = 0, B constructor

        // Explanation
        /*
        Enters A() before B() finishes initialization.
        B show: x = 0, Now show() is overridden in B, so Java uses runtime polymorphism, at this moment B's instance fields have only their default values
        Only after parent construction finishes does Java continue with child field initialization and then the child constructor body.
        So x = 10 and child constructor body executes
         */

        // Never call overridable methods from a constructor b/s the subclass may not be fully instantiated yet, This the classic JAVA TRAP!!!!

        /*
        Super important rule

        During object creation:

        memory allocated
        fields get default values
        parent constructor runs
        child instance fields/initializers run
        child constructor body runs

        That is why overridden methods inside parent constructors can see half-initialized child state.

        Interview rule

        When a parent constructor calls an overridden child method, the child fields may still be at default values:
        int → 0
        boolean → false
        object references like String → null


        JAVA Object CREATION DEEP DIVE

        1. default values
            a). Java allocates memory for the object
            b). ALL fields get default values first
            Ex:
            class B {
                    int x = 5;
                    String name = "Java";
            }
            * Before any constructor runs:
                x = 0, name = null
        2. parent constructor
            Java always calls the parent constructor first
            Java inserts it automatically, super();
            class A {
                A() {
                    System.out.println("A");
                }
            }

            class B extends A {
                B() {
                    System.out.println("B");
                }
             }
            // out put will be A, B
           // Parent constructor runs before child initialization, child fields are still default and overridden methods can behave unexpectedly
        3. child field initializers + instance blocks (top to bottom)

           3a, Field Initializers: what ever you have in the child will run and gets initialized, replaces the default values
           3b, Instance Initializer Blocks: Runs every time an object is created, Runs in the order written in the class
           so this could override Field Initializers
           {
                x = 20;
                System.out.println("instance block");
           }
           so due to this the value of x will be 20 and then the Constructor runs.
           class B {
                int x = 5;

                {
                    x = 20;
                    System.out.println("block");
                }
            }

            Ans:
            x = 0        (default)
            → parent constructor
            → x = 5      (field initializer)
            → x = 20     (instance block)
            → constructor
            Field initializers + instance blocks run top to bottom exactly as written
        4. child constructor

           B() {
                System.out.println(x);
            }

            Runs AFTER everything else
            Now fields are fully initialized
        */
        }
}
