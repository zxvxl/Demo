package com.zz.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        ExecutorService excutor = Executors.newCachedThreadPool();

        excutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务执行了！！");
            }
        });
    }
}
