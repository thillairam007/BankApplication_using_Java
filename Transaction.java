public class Transaction {
    public static void deposit(int accNo,int bal){
        if (bal > 0){
            Account dep_obj = Account.findAccount(accNo);
            if (dep_obj != null){
                dep_obj.setBalance(bal + dep_obj.getBalance());
                System.out.println("Account Balance is now : "+dep_obj.getBalance());
                System.out.println("Deposited Successfully....");
        }
        else{
            System.out.println("Account Number not found");
        }
    }
    else{
        System.out.println("Atleast enter minimum of Rs.1 or above...!");
    }
}

    public static void withdraw(int accNo, int bal){
        Account with_ob = Account.findAccount(accNo);
        if (with_ob != null){
            if(with_ob.getBalance()>=bal){
                with_ob.setBalance(with_ob.getBalance()-bal);
                System.out.println("Account Balance is now : "+with_ob.getBalance());
                System.out.println("Withdrawal Successful....");
            }
            else{
                System.out.println("Insufficient money...");
            }
        }
        else{
            System.out.println("Account Number not found");
        }
    }
    public static void checkBal(int accNoCheck){
        Account accCheck = Account.findAccount(accNoCheck);
        if (accCheck != null) {
            System.out.println("YOur Bank Balance is : " + accCheck.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }
}



