/*class operators
{
    public static void main(String[]args)
    {
        int a=100;
        int b=20;
        int c=30;
        int d=40;
        int e=50;

        int r1 =a>b?a:b;
        int r2 =d>e?d:e;
        int r3 =r1>r2?r1:r2;
        int r4 =r3>c?r3:c;

        System.out.println(r4);

    }
}*/

class operators
{
    public static void main(String[]args)
    {
        int a=100;
        int b=20;
        int c=300;
        int d=40;
        int e=50;

        System.out.println(a>b && a>c && a>d && a>e ? a: b>c && b>d && b>e ? b: c>d && c>e ? c : d>e ? d:e);
    }
}