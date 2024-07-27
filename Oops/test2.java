class test2
{
    String Brand;
    double Price;
    long Number;

    static
    {
        System.out.println("Static Initializer Block starts:");
    }

    static
    {
        System.out.println("Static Initializer Block ends.");
    }

    public void carDetails()
    {
         Brand="Toyota";
         Price=30000.0;
         Number=12345678901234567L;
         
        System.out.println("Brand: "+Brand);

        System.out.println("Price: $"+Price);

        System.out.println("Chassis Number: "+Number);
    }

    public static void main(String[]args)
    {
        System.out.println("Main Method of Car class begins..");

        test2 t1=new test2();
        System.out.println("Brand:"+t1.Brand);

        System.out.println("Price:$"+ t1.Price);

        System.out.println("Chassis Number:"+t1.Number);


        System.out.println("Car Details begins:");
        t1.carDetails();
        System.out.println("Car Details ends:");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   


        System.out.println("Main Method of Car class ends...");
    }
}