class hinn
{
   public static void main(String args[])
   {
    bird penguin=new bird();
    penguin.eat();
   }
}
class annin
{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}
class mammal extends annin
{
void walk()
{
    System.out.println("walks");
}
}
class fish extends annin
{
void swim()
{
    System.out.println("swims");
}
}
class bird extends annin
{
void fly()
{
    System.out.println("flies");
}
}

