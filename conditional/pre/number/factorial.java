// WAJP to print factorial number of 5 numbers
class factorial
{
    public static void main(String[]args)
    {
        int a=1;
        int fact=1;
        do
        {
            fact=fact*a;
            a++;
        }
        while(a<=5);
        {
            System.out.println("Factorial of 5 number is :"+fact);
        }
    }
}