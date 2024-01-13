package access.b;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance=0;
    }
    public void deposit(int amount) {
        if (isAmountVaild((amount))) {

            balance += amount;
        }else {
            System.out.println("유효하지 않은 금액");
        }
    }
    private boolean isAmountVaild(int amount){
        return amount>0;
    }
    public void withdraw(int amount){
        if(isAmountVaild(amount)&& balance-amount>=0){
            balance-=amount;
        }else {
            System.out.println("유효하지 않은 금액");
        }
    }
    public int getBalance(){
        return balance;
    }
}

