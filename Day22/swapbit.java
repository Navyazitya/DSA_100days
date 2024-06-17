class swapbit
{
    public static void main(String args[])
    {
     int x=3,y=4;
     System.out.println("before"+x+" "+y);
     x=x^y;
     y=x^y;
     x=x^y;
     System.out.println("after"+x+" "+y);
    }
}