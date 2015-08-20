import java.util.Scanner;

public class ChineseZodiac
{
   public static void main( String args[] )
   {
    	Scanner input = new Scanner( System.in );
   		//initialize year
    	int year;
		//while loop for menu, and stop
		System.out.println("\nWelcome to ChineseZodiac.java");
		System.out.println("programmed by: \nRene Jerez");
		
		do
		{
			System.out.println("\nEnter the year, or (-1) to quit");
			year = input.nextInt();

		if (year >=1000 && year <=2014)//switch
		{
			switch (year%12)
			{
				case 0:
				System.out.printf("%d was the year of Monkey\n", year);
				break;
				case 1:
				System.out.printf("%d was the year of Rooster\n", year);
				break;
				case 2:
				System.out.printf("%d was the year of Dog\n", year);
				break;
				case 3:
				System.out.printf("%d was the year of Pig\n", year);
				break;
				case 4:
				System.out.printf("%d was the year of Rat\n", year);
				break;
				case 5:
				System.out.printf("%d was the year of Ox\n", year);
				break;
				case 6:
				System.out.printf("%d was the year of Tiger\n", year);
				break;
				case 7:
				System.out.printf("%d was the year of Rabbit\n", year);
				break;
				case 8:
				System.out.printf("%d was the year of Dragon\n", year);
				break;
				case 9:
				System.out.printf("%d was the year of Dragon\n", year);
				break;
				case 10:
				System.out.printf("%d was the year of Snake\n", year);
				break;
				case 11:
				System.out.printf("%d was the year of Goat\n", year);
				break;
				default:
				break;
			}
				//end switch
		} else
			System.out.println("Bah bye! \n");
			
    	} while( year != -1);
	} 
}  
