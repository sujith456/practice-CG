package FEB_20;
import java.util.Scanner;
import java.util.regex.*;

public class Exercise_7 {
	public static String repeatSeparator(String Str1)
	{

		if(Pattern.matches(".*(bread).*(bread).*", Str1))
		{
			String[] Str2=Str1.split("(bread)");
			return Str2[1];
		}
		else
		{
			return Str1.replace(Str1,"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		System.out.println(repeatSeparator(Str1));

	}

}