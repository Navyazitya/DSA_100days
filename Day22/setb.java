class getb
{
    public static int setb(int n,int i)
    {
        int bitmask=1<<i;;
        return n|bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(setb(10,2));

    }
}