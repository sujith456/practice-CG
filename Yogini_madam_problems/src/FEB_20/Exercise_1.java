package FEB_20;
import java.util.*;
public class Exercise_1 {
	public static String withouEnd2(String Str1)
	{
		int length=Str1.length();
//		String Str2="";
//		if(length==2||length<2)
//		{
//			return Str2;
//		}
		return (Str1.substring(1,length-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		System.out.println(withouEnd2(Str1));

	}

}
