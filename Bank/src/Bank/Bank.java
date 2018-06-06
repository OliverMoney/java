package Bank;

public class Bank {
    private double balance;
    public Bank(){
        balance=0.0;
    }
    public Bank(double balance){
        this.balance=balance;
    }
    public double getbalawal() {
        return balance;
    }
    public void deposit(double balance){
        this.balance+=balance;
    }
    public void withdraw(double money){
        try{
            if(balance<money){
                throw new BalaIsNotEnException();
            }
            balance-=money;
            System.out.println("取款成功");
        }
        catch(BalaIsNotEnException e){
                System.out.println("当前余额为 "+balance);
                System.out.println("无法取款");
        }
    }
    static public void main(String []args){
        Bank bank=new Bank(100);
        System.out.println("取款200元：");
        bank.withdraw(200);
        System.out.println();
        System.out.println("取款100元：");
        bank.withdraw(100);
    }
}