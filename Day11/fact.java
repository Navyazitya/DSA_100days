public class fact{
public static int fact(int n)
{
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
    }
    return f;
}
public static void main(String args[])
{
   int fact=fact(7);
   System.out.println(fact);
}
}