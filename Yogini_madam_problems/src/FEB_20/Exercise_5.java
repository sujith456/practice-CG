package FEB_20;
import java.util.*;
public class Exercise_5 {
	public static String middleThree(String Str1)
	{
		int Number=Str1.length();
		if(Number==1||Number==3)
		{
			return Str1;
		}
		return Str1.substring((Number-1)/2-1,(Number-1)/2+2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		System.out.println(middleThree(Str1));
	}

}