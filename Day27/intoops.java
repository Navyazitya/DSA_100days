class intoops
{
    public static void main(String args[])
    {
        queen q=new queen();
        q.moves() ;   }
}
interface chessp{
    void moves();

}
class queen implements chessp{
    public void moves()
    {
        System.out.println("up down left right");
    }
}
class king implements chessp{
    public void moves()
    {
        System.out.println("up down left right diagonals");
    }
}