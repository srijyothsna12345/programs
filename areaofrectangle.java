class areaofrectangle
{
	public static void main(String args[])
	{

		
      		int length=5,breadth=4;

		int area =length*breadth;
		int perimeter= 2*(length+breadth);
		System.out.println(area);
		System.out.println(perimeter);
		if(area>perimeter)
		{
			System.out.println("area is greater");
		}
		else
		{
			System.out.println("perimeter is greater");
		}



		
	}
}