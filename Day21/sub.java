public class sub
{
    public static String sub(String str,int si,int ei)
    {
        String sub="";
      for(int i=si;i<ei;i++)
      {
        sub=sub+str.charAt(i);
    }
    return  sub;
    }
    public static void main(String args[])
    {
     String str="Hello world";
     System.out.println(str.substring(0,5));
     System.out.println(sub(str,0,5));
    }
}