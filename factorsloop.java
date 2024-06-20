class factorsloop
{
	public static void main(String args[])
	{

		int start=1, end =20 , sum =0,product=1;
		while(start <=end)
		{

			if(end%start ==0)
                 {
			System.out.println(start);
					
			if(start%2==0)
			{
				sum+=start;
			}
			else 
			{
				product*=start;
			}				
		}
			
			start++;
		}

			System.out.println( "sum ="+sum);
			System.out.println("product="+product);


	}

}
			