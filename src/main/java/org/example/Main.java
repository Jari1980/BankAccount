package org.example;


public class Main {
    public static void main(String[] args) {
        //Testing
        BankAccount myAcc = new BankAccount(1000.2, "Jari", "epost.adress", 111111);
        System.out.println("myAcc's name: " + myAcc.getName());
        System.out.println("Money in myAcc's account: " + myAcc.getBalance());
        myAcc.deposit(50.3);
        System.out.println("Money in myAcc's account: " + myAcc.getBalance());
        myAcc.withdraw(100);
        System.out.println("Money in myAcc's account: " + myAcc.getBalance());
        myAcc.withdraw(1000000000);
        System.out.println("Money in myAcc's account: " + myAcc.getBalance());
        System.out.println("My accs's internal account number: " + myAcc.getAccountNumber());
        BankAccount otherAcc = new BankAccount(10, "Billy Gate", "epost", 2222222);
        System.out.println("otherAcc's internal account number: " + otherAcc.getAccountNumber());

        //Seems ok
    }
}