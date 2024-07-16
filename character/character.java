class character
{
    public static void printAtoZ(char a)
    {
        if(a<='Z')
        {
            System.out.println(a + "");
            printAtoZ((char)(a +1));
        }
               
    }
    public static void main(String[]args)
    {
        //char a=97;
        //printAtoZ(a);
        printAtoZ('A');
    }
}