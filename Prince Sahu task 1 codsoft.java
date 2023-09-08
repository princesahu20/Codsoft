import java.util.*;
import java.lang.Math;
class Guess_the_Number_Game
{
    public static void main(String[] args)
    {
          Scanner Sc=new Scanner(System.in);
          int number,randomnumber;
          randomnumber=(int)(100*Math.random()); //Generating Random Number
          
          int T=1;
          System.out.println("Enter a Number between 1 to 100");  
          
            do
            {
                 
                 number=Sc.nextInt();      //Enter a number for Guess
                if(number>randomnumber)
                {
                    System.out.println("Lower Number PLease");
                }
                else if(number<randomnumber)
                {
                    System.out.println("Higher Number please");
                }
                else
                {
                    System.out.println("Congratulations You Guessed the Number in "+T+" attempts");
                }
                T++;    
            }
            while(number!=randomnumber);
         }
}
       
