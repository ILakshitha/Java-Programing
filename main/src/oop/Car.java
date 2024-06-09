package oop;

public class Car {
   protected String brand;
   protected String model;
   protected String color;

     public Car(){
        brand="Benz";
                model= "C250";
                color= "Black";
    }
    Car(String brand, String model, String color){
        this.brand=brand;
        this.model=model;
        this.color=color;

        System.out.println("Car is created");
        System.out.println("Brand: "+brand+" Model: "+model+" Color: "+color);
    }
    public void drive(){
        System.out.println("Car drive");

    }

    public static void main(String[] args){
        Car car = new Car();
        Car car1 = new Car("Range Rover", "Evoke", "Black");
        System.out.println(car.brand+" "+car.model+" "+car.color);


    }

}
