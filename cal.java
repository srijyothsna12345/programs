class cal
{
	public static void main(String args [])
	{
		

		char s='*';
		int n=5,m=6;
		switch(s)
		{
			
			case '+':
				System.out.println(n+m);break;
			case '-':
				System.out.println(n-m);break;
			case '*':
				System.out.println(n*m);break;
			case '/':
				System.out.println(n/m);break;
			case '%':
				System.out.println(n%m);break;
			default:
				System.out.println("invalid input");
		}
	}
}