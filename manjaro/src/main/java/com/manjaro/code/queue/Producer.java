package com.manjaro.code.queue;

import java.util.concurrent.BlockingQueue;

/**
 * created by iriwen on 2020/10/22.
 */
public class Producer {

    private final int id;

    private final BlockingQueue<String> queue;

    public Producer(int id, BlockingQueue<String> queue) {
        this.id = id;
        this.queue = queue;
        System.out.println("创建了生产者" + id + "号");
    }

    public void produce(String message) {
        boolean add = this.queue.add(message);
        if (add) {
            System.out.println("生产者" + id + "号，生产了一条消息，" + message);
        }
    }

}
