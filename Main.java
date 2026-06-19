// STUDENT NAME: Sean Leblanc
// DATE: 6/19/2026

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int day = 2; // day of month
		int month = 2; // month of year
		int year = 2020; // year
		int dayOfBirth = 26; // day of birth
		int monthOfBirth = 8; // month of birth
		int yearOfBirth = 1918; // year of birth
		/***** INITIALIZATION SECTION *****/
		int a = (14 - month) / 12;
		int y = year + 4800 - a;
		int m = month + a * 12 - 3;
		int b = (14 - monthOfBirth) / 12;
		int by = yearOfBirth + 4800 - b;
		int bm = monthOfBirth + b * 12 - 3;

		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		int JDN = day + (153*m + 2)/5 + 365*y + y/4 - y/100 + y/400 - 32045; 
		int birthJDN = dayOfBirth + (153*bm + 2)/5 + 365*by + by/4 - by/100 + by/400 - 32045;
		int totalDays = JDN - birthJDN;
		int totalYears = totalDays / 365;
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, 2/20/2020, is " + JDN);
		System.out.println("Julian Day number for birthday, 8/26/1918, is " + birthJDN);
		System.out.println("The difference in days is, " + totalDays + ", which makes you approximately " + totalYears + " years old!");
  }
}