import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    public static int nextAccNum = 1;
    private int accNo;
    private int balance;
    private String name;
    private int age;

    public static ArrayList<Account> ACCOUNT_DETAILS = new ArrayList<>();


    public Account(String name, int age) {
        this.accNo = nextAccNum++;
        this.balance = 0;
        this.name = name;
        this.age = age;
        ACCOUNT_DETAILS.add(this);
        System.out.println("This is your account number - "+ this.accNo);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static Account findAccount(int accNo) {
        for (Account acc : ACCOUNT_DETAILS) {
            if (acc.accNo == accNo) {
                return acc;
            }
        }
        return null;
    }

    public static void deleteAccount(int accNo){
        Account accDel = Account.findAccount(accNo);
        if (accDel != null) {
            Account.ACCOUNT_DETAILS.remove(accDel);
            System.out.println("Account deleted successfully");
        } else {
            System.out.println("Account not found");
        }
    }

    public static void updateAcc(int accNoUpdate){
        Account upAcc = Account.findAccount(accNoUpdate);
        if(upAcc!= null){
            System.out.println("Enter updated Name :");
            Scanner sc = new Scanner(System.in);
            String upName = sc.nextLine();
            upAcc.setName(upName);
            System.out.println("Enter updated age : ");
            int upAge = sc.nextInt();
            upAcc.setAge(upAge);
            sc.close();
        }
        else{
            System.out.println("Account Not Found...!!");
        }
    }

    public static void display(){
        for (Account acc : Account.ACCOUNT_DETAILS) {
            System.out.println("Account Number: " + acc.accNo);
            System.out.println("Account Holder Name: " + acc.getName());
            System.out.println("Age: " + acc.getAge());
            System.out.println("Balance: " + acc.getBalance());
        }
    }
}
