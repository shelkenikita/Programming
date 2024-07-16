class recursion
{
    public static void rec(int num)
    {
        if (num<=3500)
        {
            System.out.println(num);
            rec(num+1);   //recursive CS 
        }
    }

    public static void main(String [] args)
    {
        rec(10); //MCS
        
    }
}