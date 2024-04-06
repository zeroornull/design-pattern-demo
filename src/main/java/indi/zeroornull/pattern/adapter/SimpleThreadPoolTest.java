package indi.zeroornull.pattern.adapter;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class SimpleThreadPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SimpleThreadPool simpleThreadPool = new SimpleThreadPool(2, new ArrayBlockingQueue<Runnable>(10));
        Future<String> task = simpleThreadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("Callable over");
                return "Hello World";
            }
        });

        log.info("准备获取结果");
        Object result = task.get();
        log.info("获取到结果：" + JSON.toJSONString(result));
    }
}