class bitwise
{
	public static void main(String args[])
	{

		int x=10,y=10;
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
	}
}