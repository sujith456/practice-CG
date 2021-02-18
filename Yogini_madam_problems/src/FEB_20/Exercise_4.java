package FEB_20;
import java.util.*;
import java.lang.*;
public class Exercise_4 {
	public static String nTwice(String Str1,int Number)
	{
		StringBuilder Str2=new StringBuilder(Str1);
		Str2.delete(Number, Str1.length()-Number);
		return Str2.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		int Number=input.nextInt();
		System.out.println(nTwice(Str1,Number));
		

	}

}