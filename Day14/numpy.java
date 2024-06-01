class bottomleftri
{
    public static void main(String args[])
    {
        int n=5;
        int tot=n;
        int spaces=n-1;
        int stars=1;
        int current=1;
        while(current<=tot)
        {
            //spaces
            for(int  i=1;i<=spaces;i++)
            {
                System.out.print(" ");
            }
            //stars
            for(int i=1;i<=stars;i++)
            {
                System.out.print(i+" ");
            }
            //prep for next line
            System.out.println();
            current++;
            stars++;
            spaces--;
        }
    }
}