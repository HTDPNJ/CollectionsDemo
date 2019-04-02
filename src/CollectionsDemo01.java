import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01
{
    public static void main(String[] args)
    {
        shuffle();
    }
    public static void shuffle(){
        List<Integer> cards=new ArrayList<>();
        for(int i=0;i<54;i++){
            cards.add(i);
        }
        Collections.shuffle(cards);
        List<Integer>p1=new ArrayList<>();
        List<Integer>p2=new ArrayList<>();
        List<Integer>p3=new ArrayList<>();
        List<Integer>last=new ArrayList<>();
        for(int i=0;i<51;i+=3){
            p1.add(cards.get(i));
            p2.add(cards.get(i+1));
            p3.add(cards.get(i+2));
        }
        System.out.println("第一个人"+p1);
        System.out.println("第二个让人"+p2);
        System.out.println("第三个人"+p3);
    }
    public static void reverse(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
