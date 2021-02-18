package FEB_20;
import java.util.*;
import java.util.regex.Pattern;
public class Exercise_8 {
	public static boolean sameStarChar(String Str1)
	{
		boolean b=false;
		if(Pattern.matches(".*[*].*", Str1))
		{
			String[] Str2=Str1.split("[*]");
			String Str3=Character.toString(Str2[1].charAt(0));
			b=(Str2[0].endsWith(Str3))?true:false;

		}
		return b;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();

		System.out.println(sameStarChar(Str1));

	}

}
