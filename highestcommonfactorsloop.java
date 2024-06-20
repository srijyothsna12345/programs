class commonfactorsloop
{
	public static void main(String args[])
	{

		int n1=6,n2=12,i=1,j=1 ,h=0;
		while(i<=n1 && j<=n2)
		{
			if(n1%i==0 && n2%j==0)
			{
				if(i==j)
				{
					System.out.println(i);
	
						if(i>h)
						{
							h=i;
						}
				}
			}
				i++;
				j++;
		}
			System.out.println("highest common factor:"+ h);
	}
}


			