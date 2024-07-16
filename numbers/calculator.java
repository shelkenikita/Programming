class calculator
{
    public static int add(int a, int b)
    {
        int c=a+b;
        // System.out.println(c);
        return c;
    }

    public static int add(int a,int b,int c)
    {
        int d=a+b+c;
        // System.out.println(d);
        return d;    
    }

    public static int add(int a,int b,int c,int d)
    {
        int e=a+b+c+d;
        // System.out.println(e);
        return e;
    }

    public static int add(int a,int b,int c,int d,int e)
    {
        int f=a+b+c+d+e;
        // System.out.println(f);
        return f;
    }

    public static int add(int a,int b,int c,int d,int e,int f)
    {
        int g=a+b+c+d+e+f;
        // System.out.println(g);
        return g;
    }

    public static void main(String[] args)
    {
        System.out.println("Calculator starts");

        int c=10+20;
        System.out.println("Addition of two number :"+c);

        int d=10+20+30;
        System.out.println("Addition of three number :"+d);

        int e=10+20+30+40;
        System.out.println("Addition of four number :"+e);

        int f=10+20+30+40+50;
        System.out.println("Addition of five numbers :"+f);

        int g=10+20+30+40+50+60;
        System.out.println("Addition of six numbers :"+g);

        System.out.println("ME");

    }

}