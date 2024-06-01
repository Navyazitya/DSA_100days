class butterfly
{
    public static void main(String args[])
    {
        int n=5;
        int tot=2*n;
        int spaces=2*n-2;
        int stars=1;
        int current=1;
        while(current<=tot)
        {
            //stars
            for(int i=1;i<=stars;i++)
            {
                System.out.print("*");
            }
            //spaces
            for(int i=1;i<=spaces;i++)
            {
                System.out.print(" ");
            }
            //stars
            for(int i=1;i<=stars;i++)
            {
                System.out.print("*");
            }
            //prep for next line
            System.out.println();
            if(current<n)
            {
            spaces=spaces-2;
            stars++;
            }
            else
            {
                stars--;
                spaces=spaces+2;
            }
            current++;
        }
    }
}