package com.zhaowq.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhaowq
 * @date 2019/6/4
 */
public class TestThreadPool {
    public static void main(String[] args) {
        //(1)同步执行
        System.out.println("---sync execute---");
        //(2)异步执行操作one
        asynExecuteOne();
        //(3)异步执行操作two
        asynExecuteTwo();
        //(4)执行完毕
        System.out.println("---execute over---");
    }

    static void asynExecuteOne() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("--async execute one ---");
            }
        });
    }

    static void asynExecuteTwo() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("--async execute two ---");
            }
        });
    }
}
