import java.lang.ref.WeakReference;

public class RefDemo
{/*
引用分类：强、软、弱、虚*/
    public static void main(String[] args)
    {
        testweak();
    }
    public static void testweak(){
        //字符串常量池 共享（不能回收）
        String str=new String("hello world");
        //弱引用 管理对象
        WeakReference<String> wr=new WeakReference<String>(str);
        System.out.println("gc运行前："+wr.get());
        //断开引用
        str=null;
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println("gc运行后："+wr.get());   //回收了
    }
    public static void testStrong(){
        //字符串常量池 共享（不能回收）
        String str="hello world";
        //弱引用 管理对象
        WeakReference<String> wr=new WeakReference<String>(str);
        System.out.println("gc运行前："+wr.get());
        //断开引用
        str=null;
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println("gc运行后："+wr.get());   //回收不了
    }
}
