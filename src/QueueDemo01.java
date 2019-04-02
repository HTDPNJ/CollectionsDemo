import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo01
{
    public static void main(String[] args)
    {
        Queue<Request> que=new ArrayDeque<Request>();
        //模拟排队情况
        for(int i=0;i<10;i++){
            final int num=i;
            que.offer(new Request()
            {
                @Override
                public void depoist()
                {
                    System.out.println("第"+num+"个人，办理存款业务，存款额度为："+Math.random()*10000);
                }
            });
        }
        dealWith(que);
    }
    //办理业务
    public static void dealWith(Queue<Request>que){
        Request req=null;
        while(null!=(req=que.poll())){
            req.depoist();
        }
    }
}

interface Request{
    void depoist();
}
