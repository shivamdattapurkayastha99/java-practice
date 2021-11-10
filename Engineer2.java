public class Engineer2 implements MyInterface{
    
    @Override
    public void constructHome(){
        System.out.println("hello");
    }
    @Override
    public void constructLawn(){
        System.out.println("shivam");
    }
    public static void main(String[] args) {
        Engineer2 e2=new Engineer2();
        e2.constructHome();
        e2.constructLawn();
        
    }
}
