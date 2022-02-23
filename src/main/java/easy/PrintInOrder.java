package easy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintInOrder {

    AtomicInteger counter;

    public PrintInOrder() {
        counter = new AtomicInteger(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        counter.getAndIncrement();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(counter.get() != 1) {

        }
        printSecond.run();
        counter.getAndIncrement();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(counter.get() != 2) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        counter.getAndIncrement();
    }
}
