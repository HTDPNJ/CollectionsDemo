import java.util.Enumeration;
import java.util.StringTokenizer;

public class EnumerationDemo02
{
    public static void main(String[] args)
    {
        String emailStr="12345qq.com;234@33.com;";
        StringTokenizer tokenizer=new StringTokenizer(emailStr,";");
        while(tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextElement());
        }
    }
}
