package Oops.Encapsulation;

class AA1{
    private int balance=1000;
    private String name="AJ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >0) {
            this.balance = balance;
            System.out.println(balance);
        }
        else{
            System.out.println("Oyeeeeeeeee");
        }
    }
}
public class Bank1 {
    public static void main(String[] args) throws Exception {
        AA1 aa=new AA1();
        // aa.setName("AAA");
        aa.setBalance(-20000);
//        System.out.println(aa.getBalance());
    }
}

