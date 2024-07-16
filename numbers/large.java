class large
{
    public static int largest(int a,int b, int c)
    {
        if(a>b && a>c)
        {
        // System.out.println(a);
        return a;
        }

        else if(b>c)
        {
        // System.out.println(b);
        return b;
        }

        else 
        {
        // System.out.println(c);
        return c;
        }
    }
    public static void main(String[]args)
    {
        int r=largest(10,20,30);
        System.out.println(r);
    }
}