import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dataCreated;

    public Account(){
        this(0,0);
    }

    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
        dataCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDataCreated() {
        return dataCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public boolean withDraw(double withdraw){
        if (balance>=withdraw){
            balance-=withdraw;
            return true;
        }
        else
            return false;
    }

    public boolean deposit(double deposit){
        if(deposit>=0){
            balance+=deposit;
            return true;
        }
        else
            return false;
    }

}
