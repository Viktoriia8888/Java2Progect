package codingExercise2;


   public interface Shape{
      double CalArea();
      double CalPerimeter();
    }

class Circle implements Shape{
    double radius;
 public Circle(double radius){
     this.radius=radius;
 }

    public double CalArea(){
        double area=3.14*radius*radius;
        return area;
    }
    public double CalPerimeter(){
        double perimeter=2*3.14*radius;
        return perimeter;
    }
}
class Square implements Shape{
       double side;
       public Square(double side){
           this.side=side;
       }
       public double CalArea(){
           double area=side*side;
           return area;
       }
       public double CalPerimeter(){
           double perimeter=4*side;
           return perimeter;
       }
         public static void main(String[]args){
           Circle circle=new Circle(5.0);
           System.out.println("Circle area: "+ circle.CalArea());
           System.out.println("Circle perimeter: "+ circle.CalPerimeter());

           Square square=new Square(6.0);
             System.out.println("Square area: "+ square.CalArea());
             System.out.println("Square perimeter: "+ square.CalPerimeter());
         }
}