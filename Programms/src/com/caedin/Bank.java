package com.caedin;

import java.util.Scanner;

public class Bank {
    private long accNumber;
    private double balance;
    private long customerPhoneNumber;
    private String customerName;
    private String customerEmail;


    Scanner scanner = new Scanner(System.in);

    public void depositBalance() {
        System.out.println("How much would you like to deposit");
        setBalance(scanner.nextDouble() + balance);
        System.out.println("Your new balance is" + getBalance());
    }

    public void withdrawBalance() {
        if(balance == 0) {
            System.out.println("Insufficient funds!");
        }else {
            System.out.println("How much do you want to withdraw");
            double withdraw = scanner.nextDouble();
            if(withdraw <= balance) {
                setBalance(balance - withdraw);
                System.out.println("Your new balance is" + getBalance());
            }
        }
    }

    public void details() {
        System.out.println("AC:" +accNumber);
        System.out.println("Name:" +customerName);
        System.out.println("Email:" +customerEmail);
        System.out.println("Phone:" +customerPhoneNumber);
        System.out.println("Balance: $" +balance);
    }





//------------------Setters--------------------
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    //---------------Getters--------------------

    public long getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
