package coding.interview.javaClass;

public class Student {

    String name;
    int id;

    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    void display()
    {
        System.out.println("name: "+ name + " and  id : " + id);
    }
}
