class minn
{
   public static void main(String args[])
   {
    dog dobby=new dog();
    dobby.eat();
    dobby.legs=4;
    System.out.println(dobby.legs);
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
int legs;

}
class dog extends mammal
{
    String breed;
}

