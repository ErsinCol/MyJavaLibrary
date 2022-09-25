public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount) throws BalanceInsuficcentException {
        if(balance>=amount){
            balance-=amount;
        }
        else{
            throw new BalanceInsuficcentException("Bakiye yetersiz");
        }
    }

    public double getBalance(){
        return balance;
    }
}
