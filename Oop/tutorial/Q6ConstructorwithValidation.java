package tutorial;
/*
Write a Java program to create a class called Account with instance variables accountNumber and balance. 
Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
 */
class Account{
    String accountNumber;
    int balance;

    public Account(String accountNumber, int balance){
        // msut check first then put value inside
        if(accountNumber == null || accountNumber.isEmpty()){
            System.err.println("Validation fails");
            return;//means stop put value inside
        }

        if(balance <0){
            System.err.println("Validation fails");
            return;//means stop put value inside
        }
        
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
}

public class Q6ConstructorwithValidation {
    public static void main(String[] args) {
        
        System.out.println("For account 1 :");
        Account acc1 = new Account("12345",234);
        System.out.println("acc1 is "+ acc1.accountNumber +"\n"+"its balance is " + acc1.balance);
        
        System.out.println("For Account 2 :");
        Account acc2 = new Account(null, 23456);

        System.out.println("For Account 3 :");
        Account acc3 = new Account("124667", -3456);
    }
    
}
