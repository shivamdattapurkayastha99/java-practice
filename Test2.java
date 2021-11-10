// Multithreading
// public class Test2 extends Thread{
//     public void run(){
//         System.out.println("Thread is running");
//     }
//     public static void main(String[] args) {
//         Test2 t=new Test2();
//         t.run();


//     }
// }

class Myclass implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            if (Thread.currentThread().getName().equals("first")) {
                System.out.println(Thread.currentThread().getName()+"Thread is running"); 
                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException  e){
                    System.out.println(e);
                }
    
            }
        }
        
        
    }
}
public class Test2 implements Runnable{
    // public void run(){
    //     System.out.println("Thread is running");
    // }
    public static void main(String[] args) {
        // Test2 t=new Test2();
        // t.run();
        Myclass m=new Myclass();
        Thread t1=new Thread(m,"first");
        Thread t2=new Thread(m,"second");
        t1.start();
        t2.start();

        

    }
}