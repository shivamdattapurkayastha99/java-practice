public class Calculator {
    public int add(){
        return 0;
    }
    public int add(int x){
        return x;
    }
    public int add(int x,int y){
        return x+y;

    }
    public int add(double x,double y){
        return (int)(x+y);
        
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(3);
        c.add(3.12,1.53);
        
    }
    
}
