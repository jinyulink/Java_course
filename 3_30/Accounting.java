public class Accounting{
    private String name;
    private String AcctNo;
    private double balance;

    public void setName(String a){name = a;}
    public String getName(){ return name;}
    public void setAcctNo(String no){AcctNo = no;}
    public String getAcctNo(){ return AcctNo;}
    public void setBalance(double d){balance = d;}
    public double getBalance(){ return balance;}

    public void deposit(double money){
        if(money > 0)   balance += money;
    }
    public void withdraw(double money){
        if((money>0)&&(money<=balance)) balance -= money;
    }
}