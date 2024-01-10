package com.angelozero.java20.java_04_virtual_thread;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class VirtualThread {

    private final AtomicInteger count = new AtomicInteger(0);

    public void execute(int taskQuantity, ExecutorService executorService) throws InterruptedException {
        for (int x = 0; x < taskQuantity; x++) {
            executorService.execute(createTask());
        }
        executorService.shutdown();
        executorService.awaitTermination(180, TimeUnit.MINUTES);
    }

    private Runnable createTask() {
        long id = count.incrementAndGet();
        long timeout = (long) (Math.random() * 1000 + 100);
        return () -> {
            try {
                System.out.printf("\nTask %d is executing - %s", id, timeout);
                Thread.sleep(timeout);
                System.out.printf("Task %d finished \n", id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
