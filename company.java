class company
{
	public static void main(String args[])
	{
		String status="unmarried",gender="male";
		int age=40;

		if(status=="married")
			{
				System.out.println("he is married and  will get insurance");
			}

		else if(status=="unmarried")
			{
				if(gender=="male")
					{
						if(age>30)
							{	
								System.out.println("he is unmarried and male and above 30 years , will get insurance");
							}
					}
			}


		else if(status=="unmarried" && gender=="female" && age>25)
			

			{
				System.out.println("she  is yunmarried and female and above 25 years ,will get insurance");
			}
		else
				System.out.println("they will not get insurance");
	}
}


//output:-he is unmarried and male and above 30 years , will get insurance