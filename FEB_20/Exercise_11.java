package FEB_20;
import java.util.*;
public class Exercise_11 {
	public static boolean squirrelPlay(int temperature,boolean isSummer)
	{
		int Number=(isSummer)?100:90;
		if(temperature>=60&&temperature<=Number)
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
		int temperature=input.nextInt();
		boolean isSummer=input.nextBoolean();
		System.out.println(squirrelPlay(temperature,isSummer));

	}

}
