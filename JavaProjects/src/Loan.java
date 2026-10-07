import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberofyears;
    private double Loanamount;
    private Date loandate;

    public Loan(){
        annualInterestRate=2.5;
        numberofyears=1;
        Loanamount=1000;
        loandate=new Date();

    }
    public Loan(double annualInterestRate,int numberofyears,double Loanamount){
        this.annualInterestRate=annualInterestRate;
        this.numberofyears=numberofyears;
        this.Loanamount=Loanamount;
        this.loandate=new Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getNumberofyears(){
        return numberofyears;
    }
    public double getLoanamount(){
        return Loanamount;
    }
    public Date getLoandate(){
        return loandate;
    }
    //setters
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public void setNumberofyears(int numberofyears){
        this.numberofyears=numberofyears;
    }
    public void setLoanamount(double loanamount){
        this.Loanamount=Loanamount;
    }
    public void setLoandate(){
        this.loandate=loandate;
    }
    public double getMonthlyPayment() {

        double monthlyInterestRate =
                annualInterestRate / 1200;

        int numberOfMonths =
                numberofyears * 12;

        double monthlyPayment =
                Loanamount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

        return monthlyPayment;
    }

    //  total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberofyears * 12;
    }
}
