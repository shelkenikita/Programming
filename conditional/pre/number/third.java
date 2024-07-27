//WAJP to print the summation of 1st five number
class third
{
    /*public static void main(String[]args)
    {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int e=5;
        int sum=a+b+c+d+e;
        for(int i=1; i<=1; ++i)
        {
        System.out.println(sum);
        }
    }*/

public static void main(String[]args)
{
    int i=1;
    int sum=0;

    do
    {
        sum=sum+i;
        i++;
    }
    while(i<=5);
    {
        System.out.println("Summation of first 5 number is : "+sum);
    }


}

}