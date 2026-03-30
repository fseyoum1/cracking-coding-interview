package coding.interview.javaClass;

public class Result extends Student
{
    int result;
    Result(String name, int id, int result)
    {
        super(name, id); // key line it has to be 1st
        this.result = result;
    }

    void displayResult()
    {
        display(); // inherited method
        System.out.println("Result is " + result);
    }
}
