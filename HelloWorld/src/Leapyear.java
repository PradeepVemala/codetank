
public class Leapyear {

	public static void main(String[] args) {

		int year;
		year = 2015;

		if(year%4==0)
		{
			
			if(year%100==0)
			{
				
				if(year%400==0)
				{	
				System.out.println("Year provided is a leap year");	
				}
				else 
				{
					System.out.println("Year provided is not a leap year");
				}
			
			}
			
			else 
			{
					System.out.println("Year provided is a leap year");
			}
			
		}
			
		else
		{
			
			System.out.println("Year provided is not a leap year");
		}
		
	}

}
