class pow2
{
    public static boolean pow2(int n)
    {
        return (n&(n-1))==0;
    }
    public static void main(String args[])
    {
System.out.println(pow2(8));
    }
}