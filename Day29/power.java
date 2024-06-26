class power
{
    public static void main(String args[])
    {
        System.out.println(pown(2,10));
    }
    public static int pown(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*pown(x,n-1);
    }
}