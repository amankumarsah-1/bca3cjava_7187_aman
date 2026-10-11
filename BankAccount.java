class InsBalException extends Exception{
    public InsBalException(String massage){
        super(massage);
    }
} 


public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdrow(double amount) throws InsBalException {
        if(amount > balance){
            throw new InsBalException("Insufficient balance in account");
        }else{
            balance -= balance;
            System.out.println("Withdrow Successeful :  \nRemining balance :  " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try{
            account.withdrow(600.0);
            account.withdrow(500.0);
        }catch(InsBalException e ){
            System.out.println("error ");
        }
    }
}
