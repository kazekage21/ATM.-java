
import java.util.Scanner;
public class ATM {
    //main methods starts
    public static void main(String args []){
        //declare initialize balance, withdraw,and deposit
        int balance=100000,withdraw,deposit;
       try (//create a scannerclass object 
        Scanner sc = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Automated teller machine");
                System.out.println("Choose 1 for withdrawal");
                System.out.println("Choose 2 for deposit ");
                System.out.println("Choose 3 for check balance");
                System.out.println("choose 4 for exit");
                System.out.println("Choose the operation you want");
                //get choice from the user
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                    System.out.println("Enter the amount to be withdrawn");
                    // get the amount from the user
                    withdraw=sc.nextInt();
                    //check whether the balance=>withdrawn amount
                    if(balance>=withdraw)
                    {
                        //get the new balance
                        balance=balance-withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;
                    //Enter parameters for case 2
                    case 2:
                    System.out.println("Enter money to be deposited");
                    deposit=sc.nextInt();
                    //get the new balance
                    balance=balance+deposit;
                    System.out.println("You have successfully deposited the money");
                    System.out.println("");
                    break;

                    case 3:
                    //display the clients total balance
                    System.out.println("Balance:"+balance);
                    System.out.println("");
                    break;

                    case 4:
                    //exit from the menu
                    System.exit(0);
                }
            }
        }
    }
}
