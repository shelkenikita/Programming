class  Printing
{
	public static void main(String[] args) 
	{
		int hello=67;
		double java=10.3;
		char bye='A';
		double ok=7;
		
		ok = ++java + ok-- + ok;
		
		System.out.println(hello++ + java-- + ok++ + --bye);
		System.out.println(++java - java + bye);
		System.out.println(hello +" "+java+" "+bye+" "+ok);
	}
}
