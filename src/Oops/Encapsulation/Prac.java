package Oops.Encapsulation;

class Balance{
    private int bal;
    private String Name;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
            this.bal = bal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void depositt(int amount){
        bal=bal+amount;
        System.out.println(getBal());
    }
    public void withdraw(int amount){
        bal=bal-amount;
        System.out.println(getBal());
    }
}
public class Prac {
    public static void main(String[] args) throws Exception {
    Balance bala=new Balance();
    bala.depositt(2000);
    bala.withdraw(200);
    }
}
