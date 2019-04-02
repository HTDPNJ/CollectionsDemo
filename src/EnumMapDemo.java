import java.util.EnumMap;

public class EnumMapDemo
{
    public static void main(String[] args)
    {
        EnumMap<Season,String> map=new EnumMap<Season,String>(Season.class);
        //存放值
        map.put(Season.SPRING,"春困");
        map.put(Season.SUMMER,"夏无力");
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
