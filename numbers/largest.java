class largest
{
    static  int a =10; // global var
   // System.out.println(a);


    public static void printL() { //called method
        // int a=1; // local
             a=1222;
       System.out.println(a);   
    }
    
   public static void main(String[] args)
    {
        int a=55;
        int b=-55;
        int c=0;
        printL(); // calling method
        System.out.println(a);   
        // if(a>=b && a>=c)
        // System.out.println(a+" is largest number");
        // else if(b>=c && b>=a)
        // System.out.println(b+" is largest nuber");
        // else
        // System.out.println(c+" is largest number");
    }
    int s=10;


}