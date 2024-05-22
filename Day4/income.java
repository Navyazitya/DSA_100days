import java.util.*;
class income
{
    public static void main(String args[])
    {
    int tax;
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter your income: ");
    int income= Sc.nextInt();

    if(income<500000)
    {
tax=0;
    }
    else if(income >=500000 && income<1000000)
    {
        tax=(int)(income*0.2);
    }
    else{
        tax=(int)(income*0.3);
    }
    System.out.println("Your tax is : "+ tax);
}
}