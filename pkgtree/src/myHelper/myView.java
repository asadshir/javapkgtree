package myHelper;
import java.util.*;

public class myView
{
	public static void setText(String txt)
	{
		System.out.println(txt);
	}
	
	public static int getInt(String txt)
	{
		Scanner input = new Scanner(System.in);
		System.out.print(txt+": ");
		int number = (int) input.nextDouble();
		input.close();
		return number;
	}
	public static void showDemo()
	{
		setText("Hello World!");
		int number1= getInt("Enter a number");
		int number2=getInt("Enter second number");
		setText("The product of both numbers is: " +number1 * number2);
	}
}
