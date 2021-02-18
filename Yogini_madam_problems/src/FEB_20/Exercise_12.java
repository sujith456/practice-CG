package FEB_20;
import java.util.*;
public class Exercise_12
{
    public static int caughtSpeeding(int speed,boolean yourBirthday)
    {
        int number1=(yourBirthday)?5:0;
        if(speed<=60+number1)
        {
            return 0;
        }
        else if(speed>=61&&speed<=80+number1)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int speed=input.nextInt();
   boolean  yourBirthday=input.nextBoolean();
   System.out.println(caughtSpeeding(speed,yourBirthday));
//   System.out.println();

}
}
