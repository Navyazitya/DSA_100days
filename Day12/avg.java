public class avg
{
    public static int avg(int a,int b,int c)
    {
        int sum=a+b+c;
        int avg=(sum/3);
        return avg;
    }
    public static void main(String args[])
    {
        System.out.println(avg(1,2,3));
    }
}