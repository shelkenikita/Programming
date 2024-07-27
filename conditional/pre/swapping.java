class Swapping 
{
	public static void main(String[] args) 
	{
		int a=60;
		int b=40;---------------------------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		System.out.println("---------------------------");
		
		int c=0;
		
		//c=a;
		//a=b;
		//b=c;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}
}
