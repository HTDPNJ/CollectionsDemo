import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        //list可以同步
        List<String> synList=Collections.synchronizedList(list);

        //创建一个线程安全的list
    }
}
