class Constructor
{
    Constructor()
    {
        System.out.println("No argument constructor..");
    }

    Constructor(int a)
    {
        System.out.println("one paramiterized constructor..");
    }

    Constructor(int a, int b)
    {
        System.out.println("Two paramiterized constructor..");
    }

    Constructor(int a, int b, int c)
    {
        System.out.println("Three paramiterized constructor..");
    }

    Constructor(int a, int b, int c, int d)
    {+
        System.out.println("Four paramiterized constructor..");
    }

    public static void main(String[]args)
    {
        System.out.println("Main method begin");
        Constructor obj= new Constructor();
        Constructor obj1= new Constructor(10);
        Constructor obj2= new Constructor(10,20);
        Constructor obj3= new Constructor(10,20,30);
        Constructor obj4= new Constructor(10,20,30,40);
        System.out.println("Main method end");
    }
}