
class Animal{
    public void listen(){
        System.out.println("Animal listening");
    }
    public void hunt(){
        System.out.println("Animal hunting");
    }
}
public class Lion extends Animal {
    
    public void hunt(){
        System.out.println("Lion hunting");
    }


    public static void main(String[] args) {
        Lion l=new Lion();
        // l.hunt();
        Animal a=new Animal();
       a.hunt();
       l.hunt();


    }
    
}
