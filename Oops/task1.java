class task1
{
    int a; //non static var
    int b;
    int c;
    static int d; //static var
    static int e;
    
    public void method1()
    {
        task1 obj=new task1();
        System.out.println("a: "+a); //directly non-static var inside non-static context
        System.out.println("b: "+b);
        System.out.println("c: "+this.c); //this ref non-static var inside non-static context

        System.out.println("d: "+d); // directly static var inside non-static context
        System.out.println("e: "+this.e);   //this ref static var inside non-static context

        System.out.println("d: "+task1.d); //classname static var inside non-static context

        System.out.println(obj.a);  //obj ref non-static var inside non-static context

        System.out.println(obj.e);   ///obj ref static var inside non-static context

    }
    public static void main(String[]args)
    {
        System.out.println("Main method....");
        task1 ref=new task1();
        ref.method1();
    }
}