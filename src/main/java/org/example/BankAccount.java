package org.example;

public class BankAccount {
    private static int counter = 1;
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public BankAccount(double balance, String name, String email, int phone) {
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.accountNumber = counter++;
    }

    public void deposit(double sum){
        balance = balance + sum;
    }
    public void withdraw(double sum){
        if(balance < sum){
            System.out.println("There is not enough money to make this withdraw.");
        }
        else{
            balance = balance - sum;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
