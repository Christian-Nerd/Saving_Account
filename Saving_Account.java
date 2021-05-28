
import java.util.Scanner;;
public class Saving_Account 
{
    double P; 
    double R;
    double Intrest;
    double T;
    double W=0;
    double F;
    Scanner Input = new Scanner(System.in);
    public Saving_Account(double Principle, double rate, double CI, double Time, double Wallet) // Wallet is for personal money
    {
        P = Principle;
        R = rate;
        Intrest = CI;
        Time = T;
        W=Wallet;
    }

    public Saving_Account() // For my object because laziness
    {

    }

    public static void Main(String [] args)
    {
        
    }

    public double Intrest(double Principle, double rate, double CI, double Time)//this is for the compound intrest formula.
    {   //  CI is amount of times per year your intrest compounds. 
        // And Time is the variable for how many years have passed in percentange
        double FV = Math.pow(Principle*(1 + rate/CI), Time * CI); //FV = future values in the formula P(r + n/r)
        System.out.println("" + FV);
        return F = FV;
    }

    public double Deposit(double D)
    {
        return P+=D;
    }

    public double Withdrawl(double WD)
    {
        WD=W;
        return P-=WD;
    }
}