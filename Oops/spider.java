class spider
{
    String brand;
    float price;
    long number;

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
        brand ="Toyota";
        price =30000.0F;
        number=12345678901234567L;

        System.out.println("Brand: "+brand);
        System.out.println("Price: $"+price);
        System.out.println("Chassis Number: "+number);
    }
     public static void main(String[]args)
     {
        System.out.println("Main Method of car class begins..");

        spider ref=new spider();
        System.out.println("Brand:"+ref.brand);
        System.out.println("Price: $"+ref.price);
        System.out.println("Chassis Number: "+ref.number);

        System.out.println("Car Details begins:");
        ref.carDetails();
        System.out.println("Car Details ends:");

        System.out.println("Main Method of Car class ends...");
     }
}