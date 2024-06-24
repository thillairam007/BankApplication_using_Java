import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner sc = new Scanner(System.in);

        while (condition) {
            System.out.println("<<<<< Welcome to ROCK's Bank >>>>\n ------------------------------- \n select any operation \n 1. Account 2. Transaction 3. Display all account details 4.exit \n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account Section");
                    System.out.println("1. Create Account 2. Delete Account 3. Update Account");
                    int accChoice = sc.nextInt();
                    switch (accChoice) {
                        case 1:
                            System.out.println("Creating account.....");
                            System.out.println("Enter your name: ");
                            String name = sc.next();
                            System.out.println("Enter your age: ");
                            int age = sc.nextInt();
                            new Account(name, age);
                            System.out.println("Account created successfully");
                            break;
                        case 2:
                            System.out.println("Deleting Account....");
                            System.out.println("Enter your account number: ");
                            int accNoDel = sc.nextInt();
                            Account.deleteAccount(accNoDel);
                            break;
                        case 3:
                            System.out.println("Updating Account....");
                            System.out.println("Enter your account number: ");
                            int accNoUpdate = sc.nextInt();
                            Account.updateAcc(accNoUpdate);
                            break;
                        default:
                            System.out.println("Select valid options ... 1, 2, or 3 only");
                    }
                    break;
                case 2:
                    System.out.println("Transaction Section");
                    System.out.println("1. Deposit 2. Withdraw 3. Check Balance");
                    int transChoice = sc.nextInt();
                    switch (transChoice) {
                        case 1:
                            System.out.println("Deposit Section");
                            System.out.println("Enter your account number: ");
                            int accNoDep = sc.nextInt();
                            System.out.println("Enter Amount to Deposit : ");
                            int depBal = sc.nextInt();
                            Transaction.deposit(accNoDep,depBal);
                            break;
                        case 2:
                            System.out.println("Withdraw Section");
                            System.out.println("Enter your account number: ");
                            int accNoWith = sc.nextInt();
                            System.out.println("Enter Withdrawal Amount : ");
                            int accwith = sc.nextInt();
                            Transaction.withdraw(accNoWith,accwith);
                            break;
                        case 3:
                            System.out.println("Check Balance...");
                            System.out.println("Enter your account number: ");
                            int accNoCheck = sc.nextInt();
                            Transaction.checkBal(accNoCheck);
                            break;
                    }
                    break;
                case 3:
                Account.display();
                break;
                case 4:
                    System.out.println("Exited");
                    condition = false;
                    break;
                default:
                    System.out.println("Select valid options ... 1, 2, or 3 only");
            }
        }
        sc.close();
    }
}
