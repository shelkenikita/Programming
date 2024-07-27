class challenge
{
    static String name;
    static char ch;

    public static void qspider()
    {
        System.out.println("QSpider begin...");
        System.out.println("name:"+name);
        System.out.println("char:"+ch);
        System.out.println("QSpider end...");
    }

    static
    {
        System.out.println("SIB-1");
    }

    public static void main(String[]args)
    {
        System.out.println("MB");
        char ch='a';
        String name="Nikita";
        qspider();   
        
            
        System.out.println("name:"+name);
        System.out.println("char:"+ch);
        System.out.println("char :"+challenge.ch);
        System.out.println("ME");
        
    }

    static
    {
        System.out.println("SIB-2");
    }


}