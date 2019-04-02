import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{/*
使用properties读取资源配置文件
*/
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        Properties pro=new Properties();
        /*pro.load(new FileReader("db.properties"));
        System.out.println(pro.getProperty("user","bjsxt"));*/

        /*使用类相对路径的*/
       // pro.load(ReadProperties.class.getResourceAsStream("db.properties"));

        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
        System.out.println(pro.getProperty("user","bjsxt"));
    }
}
