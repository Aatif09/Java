package Oops.Abstraction;

abstract public class Vehicle {
    int no_of_tyre;
    public void display(){
        System.out.println("Common msg");
    }
    abstract void start();

    public static void main(String[] args) {
        Vehicle vac=new Car();
        vac.no_of_tyre=4;
        vac.start();

        Vehicle vacs=new Bike();
        vac.no_of_tyre=2;
        vac.start();
    }
}
