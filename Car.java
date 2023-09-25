package codingExercise2;

public class Car {
    /*Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount*/
    private int carPrice;
    private String color;
    public Car(int carPrice,String color ){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice;
    }
}
class Truck extends Car{
    private double weigth;
    public Truck(int carPrice,String color,double weigth){
        super(carPrice,color);
        this.weigth=weigth;
    }

    @Override
    double calculateSalePrice() {
        if(weigth>2000){
            return super.calculateSalePrice()*0.10;
        }else {
            return super.calculateSalePrice()*0.20;
        }
    }
}
class Sedan extends Car{
    private int length;
    public Sedan(int carPrice,String color,int length){
        super(carPrice,color);
        this.length=length;
    }
    double calculateSalePrice(){
        if(length>20){
            return super.calculateSalePrice()*0.05;
        }else {
            return super.calculateSalePrice()*0.10;
        }
    }
}
class Tester{
    public static void main(String[] args) {
        Truck truck=new Truck(10000,"white",4000);
        System.out.println("Truck sale price "+ truck.calculateSalePrice());
        Sedan sedan=new Sedan(8000,"Black",20);
        System.out.println("Sedan sale price "+ sedan.calculateSalePrice());
    }
}