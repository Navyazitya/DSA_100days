class clrb
{
    public static int clrb(int n,int i)
    {
        int bitmask=~(1<<i);;
        return n&bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(clrb(10,1));

    }
}