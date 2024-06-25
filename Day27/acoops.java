class acoops
{
    public static void main(String args[])
    {
        horse h=new horse();
        h.eat();
        h.walk();
        chicken c=new chicken();
        c.eat();
        c.walk();

    }
}
abstract class animal{
    void eat()
    {
        System.out.println("eats");
    }
    abstract void walk();
}
class horse extends animal{
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}