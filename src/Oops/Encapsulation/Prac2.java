package Oops.Encapsulation;

import java.lang.reflect.Field;

class AAA{
     private double balance;
    private String name;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println(getBalance());
        }
        else{
            System.out.println("NOOOOOOOOOO");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println(getBalance());
        }
        else{
            System.out.println("Insufficiemt");
        }
    }
}
public class Prac2 {
    public static void main(String[] args)  {
        AAA bb=new AAA();
        bb.deposit(2000);
        bb.withdraw(100);

    }
}
