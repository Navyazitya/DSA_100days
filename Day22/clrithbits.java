class clrithbits
{
    public static int clrithbits(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[])
    {
System.out.println(clrithbits(15,2));
    }
}