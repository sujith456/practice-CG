package FEB_20;
import java.util.Scanner;
public class Exercise_6 {
	public static String repeatSeparator(String Str1,String Str2,int Number)
	{
		StringBuilder Str3=new StringBuilder();
		int Count=Number-1;
		while((Number)>0)
		{
			Str3.append(Str1);
			if(Count>0)
			{
				Str3.append(Str2);
				Count--;
			}
			Number--;
		}
		return Str3.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		String Str2=input.nextLine();
		int Number=input.nextInt();
		System.out.println(repeatSeparator(Str1,Str2,Number));

	}

}