package coding.interview.javaClass;

public class Child extends Parent
{
    /*
     Constructors has the same name as a class no return types
     Interview Trap:

     Constructor -> initializes class
     super() ->  calls parent constructor
     Default behavior -> Java inserts super() automatically
     when required if parent has no default constructor ( means parent define parameterized constructor)
     The Rule is    super() must be the first line

     What happen when you create a child class, Java first calls the parent constructor using super(), either
     explicitly or implicitly, and then executes the child constructor.

     */
    Child(int x)
    {
        super(x); //this is due ot the parent construction
        // argument though child does not have instance variable, if avoid will complain
        System.out.println("Child");
    }
}
