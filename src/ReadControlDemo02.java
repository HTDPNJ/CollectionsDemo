import java.util.*;

public class ReadControlDemo02
{
    /*
    * emptyxxx() 空的不可变的集合
    * singletonxxx() 一个元素不可变的集合
    * unmodifiablexxx() 不可变容器
    * */
    public static void main(String[] args)
    {
        Map<String,String> map=new HashMap<String,String>();
        map.put("test","test");
        map.put("hello","hello");
        //只读控制
        Map<String,String>map2= Collections.unmodifiableMap(map);
        //一个元素的容器测试
        List<String> list=Collections.singletonList(new String());
        list.add("test");
        //list.add("test2");
    }
    public static Set<String> oper(Set<String> set){
        if(null==set){
            return Collections.EMPTY_SET;
        }
        return set;
    }
}
