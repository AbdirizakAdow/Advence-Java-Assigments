public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(612847462, 100.0, "Mohamed Ahmed Khalifa");
        myAccount.deposit(200.0);
        myAccount.withdraw(100.0);
        System.out.println(myAccount.getAccountDetails());
    }
}