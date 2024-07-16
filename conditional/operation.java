class operations
{
   static int a =10;

    public static void add(int a, int b, int c, int d)
    {
        int e=a+b+c+d; // local
        System.out.println(e);
        System.out.println(operations.a);
    }

    public static void sub(int p, int q,int r,int s, int t) // formal argu
    {
        int u=p-q-r-s-t; // local
        // System.out.println(a);
        System.out.println(u);
    }

    public static void main(String[] args)
    {
        System.out.println("Program start....");
        add(10,20,30,40); // actual argu
        // int a;
        // a = 10;
        // System.out.println(a);


        sub(100,10,20,30,5); // actual argu
        System.out.println("Program end....");
    }
    



}