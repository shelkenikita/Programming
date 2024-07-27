class practice
{
    public static void printmsg()
    {
        int t=add();
        System.out.println(t);
        System.out.println("Good morning");

    }

    public static void main(String[]args)
    {
        System.out.println("Main Start");
        printmsg();
        System.out.println(practice.add());
        practice.add();
        System.out.println("Main end");
    }

    public static int add()
    {
        int a=30;
        int b=40;
        int r=a+b;
        System.out.println(r);
        return a;
    }
}