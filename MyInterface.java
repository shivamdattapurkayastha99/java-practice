public interface MyInterface {


    // public  void applyABS();
    // public void applyBrake();
    // public void changeGear();
    public void constructHome();
    public void constructLawn();
    // default void randomMethod(){
    //     System.out.println("Some random thing");
    // }

}

abstract class Car{
    String model;
    String regNo;
    String price;
    public void accelerate(){
        System.out.println("accelerate");
    }
    public void incognito(){
        System.out.println("incognito");
    }
    public abstract void applyABS();

}
