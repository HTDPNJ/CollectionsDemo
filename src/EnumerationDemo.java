import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo
{
    public static void main(String[] args)
    {
        Vector<String> vector=new Vector<String>();
        vector.add("javase");
        vector.add("html");
        vector.add("oracle");
        Enumeration<String> enu=vector.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
    }
}
