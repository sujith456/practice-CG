package FEB_20;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise_9 {
	public static int countTriple(String Str1)
	{
		int count=0;
		if(Pattern.matches(".*.{3}.*", Str1))
		{
			char[] CharArray=Str1.toCharArray();
			for(int i=0;i<CharArray.length-2;i++)
			{
				if((CharArray[i]==CharArray[i+1])&&(CharArray[i+1]==CharArray[i+2]))
				{
					count++;
				}
				else
				{
					continue;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
//		countTriple(Str1);
		System.out.println(countTriple(Str1));

	}

}