public class ref
{
    public static void change(int x)
    {
        x=5;
    }
    public static void main(String args[])
    {
        int x=10;
        System.out.println("orig: "+x);
        change(x);
        System.out.println("new: "+x);
    }
}