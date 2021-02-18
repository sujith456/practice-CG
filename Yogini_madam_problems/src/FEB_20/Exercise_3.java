package FEB_20;
import java.util.*;
public class Exercise_3 {
	public static boolean endsLy(String Str1)
	{
//		String Str2=Str1.subSequence(Str1.length()-2, Str1.length()-1);
		if(Str1.endsWith("ly")||Str1.endsWith("LY"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		System.out.println(endsLy(Str1));
		
	}

}