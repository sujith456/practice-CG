package FEB_20;
import java.util.*;
import java.util.regex.Pattern;
public class Exercise_10 {
	public static int sumDigits(String Str1)
	{
		int Sum=0;
		if(Pattern.matches(".*\\d.*", Str1))
		{
			char[] CharArray=Str1.toCharArray();
			for(char i:CharArray)
			{
				int Number=Character.getNumericValue(i);
				if(Number<10)
				{
					Sum=Sum+Number;
				}
			}
	}
		return Sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
//		sumDigits(Str1);
		System.out.println(sumDigits(Str1));

	}

}