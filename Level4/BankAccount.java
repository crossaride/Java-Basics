
package com.example.Java_Basics.model.Level4;


public class BankAccount {
    
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    
    public double withdraw(double amount){
        
        System.out.println("You have selected to withdraw: RM " + amount);
        
        if(getBalance() != 0 && getBalance() > amount){
            setBalance(getBalance() - amount);
        }else{
            System.err.println("Insufficient amount! Unable to withdraw!");
            return getBalance();
        }
        return getBalance();
    }
    
    public double deposit(double amount){
         System.out.println("You have selected to deposit: RM " + amount);
        setBalance(getBalance() + amount);
        return getBalance();
    }
}
