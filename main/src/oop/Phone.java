package oop;

public class Phone {
    String name;
    String model;
    String color;
    int ram;

    public void call(){
        System.out.println("call Ishan's "+name+" "+model+" "+color+" Phone");
    }
    public void message(){
        System.out.println("message");
    }
    public static void main(String[] args){
        Phone phone1 = new Phone();
        phone1.name="samsung";
        phone1.model="A21s";
        phone1.color="blue";
        phone1.call();
    }
}
