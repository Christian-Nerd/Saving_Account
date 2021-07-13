

import java.util.Scanner;
public class MySavingsAccount
{ // Hello Discord this is the application of a class that uses the compound intrest formula....
    public static void main(String [] args)
    {
        Scanner VI = new Scanner(System.in); // VI = variable input
        System.out.println("Hello User what is your principal for your savings account?");
        double P = VI.nextDouble();
        System.out.println("What intrest rate do you choose?");
        System.out.println("");
        System.out.println("8% intrest every 4 months or 1% intrest every 1 month?");
        System.out.println("");
        System.out.println("Type 8% to get 8% intrest every 4 months or");
        System.out.println("Type one percent to get 1% intrest every month");
        String VIN = VI.next();// VIN = variable input nextline
        double R = 0;// This is the variable for rate
        double T = 0;// This is the variable for Time In years for the compounf intrest formula
        double CompundIntrest = 0;// This is the rate which intrest compunds out of a year i.e 4 times a year or 365 times a year.......
        
        switch(VIN.toUpperCase())
        {
                case "8%":
                case "8 PERCENT":
                case "EIGHT PERCENT":
                R = 8;
                CompundIntrest = 3;
                System.out.println("Okay then......done");
                break;

                case "1%":
                case "1 PERCENT":
                case "ONE PERCENT":
                R = 1;
                CompundIntrest = 12;
                System.out.println("Okay then......done");
                break;
        }
        System.out.println("...User I'm your friend have a calulator for calulating your compound intrest!");// This runs the main part of the program the calulator for compound intrest.
        System.out.println("Do you want to use it? Y/N");
        Saving_Account SA = new Saving_Account(); // So main can access this code....https://pastebin.com/Zq6B67tU
        switch(VI.next().toUpperCase())
        {
            case "Y":
            case "YES":
            System.out.println("So how many years are you going to keep this money in the bank?");
            T = VI.nextDouble();
            SA.Intrest(P, R, CompundIntrest, T);
            System.out.println("");
            System.out.println("");
            break;

            case "N":
            case "NO":
            System.out.println("Okay then goodbye just use continue setting up your savings account");
            break;
        }
        System.out.println("....Now you can either stop by typing stop....");
        System.out.println("Alturnitively you can press withdrawl by typing Withdrawl");
        System.out.println("And just type Deposit to you know what....");
        String choice = VI.next();
        switch(choice.toUpperCase())
        {
            case "STOP":
            System.exit(0);
            break;

            case "WITHDRAWL":
            System.out.println("How much money do you want to withdrawl?");
            double W = VI.nextDouble();
            SA.Withdrawl(W);
            break;
            
            case "DEPOSIT":
            System.out.println("How much money to you want to deposit.");
            double D = VI.nextDouble();
            SA.Deposit(D);
            break;
        }
    }
}
  
