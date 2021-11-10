import java.util.Scanner;
class Car{
    Car(){
        System.out.println("Car constructor called");
    }
    void display(){
        System.out.println("Car");
    }
}
public class x1 extends Car{
    x1(){
        System.out.println("bmw car");
        

    }
    public static void main(String[] args) {
        Car c1=new Car();
        // ob1.display();
        Car c2=new Car();
        Car c3=c2;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        

    }
}