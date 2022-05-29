package module04;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;



/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 一个简单的代码参考：
 */
public class Homework03_countdownlatch {
    
    public static void main(String[] args) throws InterruptedException {
        
        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        List<Integer> arr = new ArrayList<>(36);
        List<Integer> arr_switch = new ArrayList<>(36);


        int N = 36;

        CountDownLatch countDownLatch = new CountDownLatch(36);

        for(int i=0;i<N;i++){
            arr.add(i);
            arr_switch.add(0);
            new Thread(new readNum(i,countDownLatch, arr, arr_switch)).start();
        }


        countDownLatch.await(); // 注意跟CyclicBarrier不同，这里在主线程await


        System.out.println(arr);

        int result = arr.get(35); //这是得到的返回值
        
        // 确保  拿到result 并输出

        System.out.println("异步计算结果为："+result);
         
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        
        // 然后退出main线程
    }
    
    private static int sum() {
        return fibo_1(36);
    }

    private static int fibo(int a, List<Integer> arr, List<Integer> arr_switch) {
        if (a < 2) {
            return 1;
        }
        int arr_size = arr.size();
        if (a > 2) {
            int s1 = arr_switch.get(a - 1 - 1);
            int s2 = arr_switch.get(a - 2 - 1);
            if (s1 == 1 && s2 == 1) {
                int res1 = arr.get(a - 1 - 1);
                int res2 = arr.get(a - 2 - 1);
                return res1 + res2;
            } else if (s1 == 1 && s2 == 0) {
                int res1 = arr.get(a - 1 - 1);
                return res1 + fibo(a - 2, arr, arr_switch);
            } else if (s1 == 0 && s2 == 1) {
                int res2 = arr.get(a - 2 - 1);
                return fibo(a - 1, arr, arr_switch) + res2;
            }
            else{
                return fibo(a-1,arr, arr_switch) + fibo(a-2,arr, arr_switch);
            }
        }
        else{
            return fibo(a-1,arr, arr_switch) + fibo(a-2,arr, arr_switch);
        }

    }

    private static int fibo_1(int a) {
        if ( a < 2)
            return 1;
        return fibo_1(a-1) + fibo_1(a-2);
    }


    static class readNum  implements Runnable{
        private int num;
        private CountDownLatch latch;
        private List<Integer> arr;
        private List<Integer> arr_switch;

        public readNum(int num,CountDownLatch latch, List<Integer> arr, List<Integer> arr_switch){
            this.num = num;
            this.latch = latch;
            this.arr = arr;
            this.arr_switch = arr_switch;
        }
        @Override
        public void run() {
            synchronized (this){
                System.out.println("Current num:"+num+","+Thread.currentThread().getName());
                //latch.countDown();
                int result = fibo(num+1,arr,arr_switch);
                arr.set(this.num,result);
                arr_switch.set(this.num,1);
                //System.out.println("result "+result);

                System.out.println("线程组任务"+num+"结束，其他任务继续");
                latch.countDown();
            }
        }
    }
}
