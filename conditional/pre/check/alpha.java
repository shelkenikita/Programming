class alpha
{
    public static void main(String[]args)
    {
        char c='d';
         String r = (c>='A' && c<='Z') || (c>='a' && c<='z') ? "Alphabet" : "Not alphabet" ;
        // String res=c>='A' && c<='Z' ? "Alphabet" : "Not alphabet" ;
        System.out.println(r);
        // System.out.println(res);
    }
}