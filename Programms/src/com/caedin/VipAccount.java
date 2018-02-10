package com.caedin;

public class VipAccount {
    private double creditLimit;
    private String accName;
    private String accEmail;

    public VipAccount() {
        this(2000, "Default Name", "default@bank.org");
    }
    public VipAccount(double creditLimit, String accName, String accEmail) {
        this.creditLimit = creditLimit;
        this.accName = accName;
        this.accEmail = accEmail;
    }

    public VipAccount(double creditLimit, String accName) {
        this.creditLimit = creditLimit;
        this.accName = accName;
    }
}

