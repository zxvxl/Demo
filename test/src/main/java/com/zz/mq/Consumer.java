package com.zz.mq;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<KouZhao> blockingQueue;

    public Consumer(BlockingQueue<KouZhao> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                long startTime = System.currentTimeMillis(); // 获取开始时间
                KouZhao kouZhao = blockingQueue.take();
                long endTime = System.currentTimeMillis(); // 获取结束时间
                System.out.println("我消费了口罩：" + kouZhao + ", 等到货时我阻塞了" + (endTime - startTime) + "ms");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}