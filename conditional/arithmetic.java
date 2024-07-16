class arithmetic
{
    public static int add(int a, int b,int c,int d) // called method
    {
        int e=a+b+c+d;
        // 10,20,30,40
        // System.out.println(e);
        return e; // control transfer statement 
    }

    public static void sub(int a, int b,int c,int d, int e)
    {
        int f=a-b-c-d-e;
        System.out.println(f);
    }

    public static void multiply(int a,int b,int c, int d,int e,int f)
    {
        int g=a*b*c*d*e*f;
        System.out.println(g);
    }

    public static void div(int a, int b)
    {
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) 
    {
        System.out.println("Begin the program....");
        add(10,20,30,40);
        sub(100,20,10,20,10);
        multiply(2,3,1,4,2,5);
        div(100,20);        
    } 
}