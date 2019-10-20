public class SavingsAccount {

    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingBalance)
    {
        this.savingsBalance=savingBalance;
    }

    public double SavingsBalance()
    {
        return this.savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyI;
        monthlyI= (double)(this.savingsBalance*annualInterestRate/12);
        this.savingsBalance+=monthlyI;
    }


    public static void main(String[] args) {

        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.00);
        saver2= new SavingsAccount (3000.00);

        int total = 0;

        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("\nPrinting Balance for Saver 1\n");
        for(int i=0; i<12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.SavingsBalance()));
        }
        System.out.println("\nPrinting Balance for Saver 2\n");
        for(int i=0; i<12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.SavingsBalance()));
        }
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAnnual interest rate to 0.05 Printing Balance for Saver 1\n");
        for(int i=0; i<12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.SavingsBalance()));
        }
        System.out.println("\nAnnual interest rate to 0.05 Printing Balance for Saver 2\n");
        for(int i=0; i<12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.SavingsBalance()));
        }

    }
}