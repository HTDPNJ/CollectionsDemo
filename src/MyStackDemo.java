public class MyStackDemo
{
    public static void main(String[] args)
    {
        MyStack<String>  backHis=new MyStack<>(3);
        backHis.push("baidu");
        backHis.push("ten");
        backHis.push("ali");
        System.out.println(backHis.size());
        String item=null;
        while(null!=(item=backHis.pop())){
            System.out.println(item);
        }
    }
}
