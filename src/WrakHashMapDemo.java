import java.util.WeakHashMap;

public class WrakHashMapDemo
{
    /*WeakHashMap键为弱类型，gc运行立即回收*/
    public static void main(String[] args)
    {
        WeakHashMap<String,String> map=new WeakHashMap<String,String>();
        //测试次数
        map.put("abc","a");
        map.put("b","test");
        map.put(new String("c"),"he");
        map.put(new String("deg"),"g");
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println(map.size());

    }
}
