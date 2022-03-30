public class Banking {
    public static void main(String [] args){
        Accounting a1 = new Accounting();
        a1.setName("Jim");
        a1.deposit(500);
        System.out.println("Hello ",a1.getName()+" your current balance "+a1.getBalance());
    }
}
