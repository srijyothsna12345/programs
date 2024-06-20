class age{
	public static void main(String args[]){
	
		int age =55, year=1998;
		if(age>=18)
		{
			System.out.println("the person is eligible for vote");
		}
		else
		 	System.out.println("the person is not eligible for voting");
		

		 if(age>=50)
		{
			System.out.println("senior citizen");
		}
		

		 else if(age>=25)
		{
			if(year>=2020)
			{	
				System.out.println("the person is graduated and eligible for MLC voting");
			}
		}
		else
			System.out.println("minor");
	}
}
