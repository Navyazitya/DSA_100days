public class cons
{
    public static void main(String args[])
    {
      student s1=new student("navya");
      System.out.println(s1.name);
    }
}
class student
{
    String name;
    int roll;
    student(String name)
    {
        this.name=name;
        System.out.println("called");
    }
}