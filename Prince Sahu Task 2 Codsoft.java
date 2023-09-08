import java.util.*;
import java.lang.String;
class Grade_Calculator
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of Subject");
        int n=Sc.nextInt();
        int average,i;
        int Total=0;
        int a[]=new int[100];
        String Grade;
        System.out.println("Enter Marks Of Subject out of 100");
       
        for(i=1;i<=n;i++)
        {
            a[i]=Sc.nextInt();
        }
        for(i=1;i<=n;i++)
        {
            Total=Total+a[i];
        }
        average=Total/n;
        if(average>=90)
        {
            Grade="A+";
        }
        else if(average>=80&&average<90)
        {
            Grade="A";
        }
        else if(average>=70&&average<80)
        {
            Grade="B";
        }
        else if(average>=60&&average<70)
        {
            Grade="C";
        }
        else if(average>=50&&average<60)
        {
            Grade="D";
        }
        else if(average>=40&&average<50)
        {
            Grade="E";
        }
        else
        {
            Grade="F";
        }
        System.out.println("Total Marks is : "+Total);
        System.out.println("Average Percentage is : "+average);
        System.out.println("Grade is : "+Grade);
    }
    
}
           
           
        
        
        

