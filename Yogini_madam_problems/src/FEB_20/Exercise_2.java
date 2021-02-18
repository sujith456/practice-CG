package FEB_20;
import java.util.*;
public class Exercise_2 {
	public static String middleTwo(String Str1)
	{
		String Str2="";
		if(Str1.length()%2==0&&Str1.length()>2)
		{
				Str2=Str1.substring((Str1.length()/2)-1,(Str1.length()/2)+1);


		}
		return Str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String Str1=input.nextLine();
		System.out.println(middleTwo(Str1));
		

	}

}