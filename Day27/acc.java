class acc
{
    public static void main(String ags[])
    {
        bank b=new bank();
        b.username="navya";
        b.setpass("navya@2004");
    }
}
class bank
{
    public String username;
    private String password;
    public void setpass(String pwd)
    {
        password=pwd;
    }
}