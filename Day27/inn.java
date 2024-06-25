class inn
{
   public static void main(String args[])
   {
    fish shark=new fish();
    shark.eat();
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
class fish extends annin
{
int fins;
void swim()
{
    System.out.println("swims in water");
}
}

