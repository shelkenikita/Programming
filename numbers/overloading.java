class overloading
{
    public static int over(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static int over(int a,int b,int c)
    {
        if(a<b && b<c)
        {
            return a;
        }
        else if(b<c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static int over(int a,int b,int c,int d)
    {
        if(a<b && b<c && c<d)
        {
            return a;
        }
        else if(b<c && c<d)
        {
            return b;
        }
        else if( c<d)
        {
            return c;
        }
        else
        {
            return d;
        }
    }
    public static int over(int a,int b,int c,int d,int e)
    {
        if(a<b && b<c && c<d && d<e)
        {
            return a;
        }
        else if(b<c && c<d && d<e)
        {
            return b;
        }
        else if( c<d && d<e)
        {
            return c;
        }
        else if(d<e)
        {
            return d;
        }
        else
        {
            return e;
        }
    }
    public static int over(int a,int b,int c,int d,int e,int f)
    {
        if(a<b && b<c && c<d && d<e && e<f)
        {
            return a;
        }
        else if(b<c && c<d && d<e && e<f)
        {
            return b;
        }
        else if( c<d && d<e && e<f)
        {
            return c;
        }
        else if(d<e&& e<f)
        {
            return d;
        }
        else if(e<f)
        {
            return e;
        }
        else
        {
            return f;
        }
    }
    public static void main(String[]args)
    {
        int r=over(10,20);
        int s=over(10,20,30);
        int t=over(10,20,30,40);
        int u=over(10,20,30,40,50);
        int v=over(10,20,30,40,50,60);

        System.out.println("The smallest no. is :"+r);
        System.out.println("The smallest no. is :"+s);
        System.out.println("The smallest no. is :"+t);
        System.out.println("The smallest no. is :"+u);
        System.out.println("The smallest no. is :"+v);

    }
}