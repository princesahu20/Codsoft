import java.util.*;
class ATM
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        int Balance=1000000,withdraw,deposit;
        while(true)
        {
           
        System.out.println("WELCOME TO ATM");
        System.out.println("For Withdrawing Click 1");
        System.out.println("For Depositing Click 2");
        System.out.println("To Check Balance Click 3");
        System.out.println("To EXIT click 4");
        System.out.println("Click the Operation YOu want to Perform");
        int choice=Sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter The Amout You want to Withdraw");
            withdraw=Sc.nextInt();
            if(withdraw<=Balance)
            {
                Balance=Balance-withdraw;
                System.out.println("Please Collect Your Money");
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
            System.out.println("");
            break;
            case 2:
            System.out.println("Enter Amount to Be Deposited");
            deposit=Sc.nextInt();
            Balance=Balance+deposit;
            System.out.println("Your Amount Has Been Successfully Deposited");
            System.out.println("");
            break;
            case 3:
            System.out.println("Balance is : "+Balance);
            System.out.println("");
            break;
            case 4:
            System.exit(0);
        }
    }
  }
}

            
