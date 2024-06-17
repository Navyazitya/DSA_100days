class getb
{
    public static int updb(int n,int i,int newbit)
    {
        int bitmask=~(1<<i);
        n=n&bitmask;
        int bm=newbit<<i;
        return n|bm;
    }
    public static void main(String args[])
    {
        System.out.println(updb(10,2,1));

    }
}