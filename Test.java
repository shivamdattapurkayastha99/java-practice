import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Shivam");
        Iterator<String> itr=ar.iterator();
        ar.forEach((n)->System.out.println(n));

    }
    
}
