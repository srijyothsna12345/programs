class Adsc
{
	public static void main(String args[])
	{


		char a='s';
		if ((a>=65 && a<=90) || ( a>=97 && a<=122))
		
			System.out.println(" It is a alphabet");

		else if(a>='0' && a<='9')
			System.out.println("It is a digit");

		else 
			System.out.println("Special characters");
	}
}
		
//output:- It is a alphabet