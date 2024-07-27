class nonstaticblock
{
   static
    {
        System.out.println("Non static block....");
        nonstaticblock ref1=new nonstaticblock();
    }

    public static void main(String[]args)
    {
        System.out.println("Main method...");
        nonstaticblock ref1=new nonstaticblock();
        

    }
}