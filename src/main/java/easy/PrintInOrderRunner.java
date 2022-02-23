package easy;

import java.util.HashMap;

public class PrintInOrderRunner {

    public void run(Order order) {
        var printInOrder = new PrintInOrder();

        Thread thread1 = new CalcThread1(printInOrder);
        Thread thread2 = new CalcThread2(printInOrder);
        Thread thread3 = new CalcThread3(printInOrder);

        order.execute(thread1, thread2, thread3);
    }
}

class Order {
    int first;
    int second;
    int third;

    public Order(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void execute(Thread thread1, Thread thread2, Thread thread3) {
        var threadMap = new HashMap<Integer, Thread>();

        threadMap.put(1, thread1);
        threadMap.put(2, thread2);
        threadMap.put(3, thread3);

        threadMap.get(first).start();
        threadMap.get(second).start();
        threadMap.get(third).start();
    }
}

class CalcThread1 extends Thread {
    PrintInOrder printInOrder;

    public CalcThread1(PrintInOrder printInOrder) {
        this.printInOrder = printInOrder;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.print("1");
            printInOrder.first(() -> System.out.print("first"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CalcThread2 extends Thread {
    PrintInOrder printInOrder;

    public CalcThread2(PrintInOrder printInOrder) {
        this.printInOrder = printInOrder;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.print("2");
            printInOrder.second(() -> System.out.print("second"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CalcThread3 extends Thread {
    PrintInOrder printInOrder;

    public CalcThread3(PrintInOrder printInOrder) {
        this.printInOrder = printInOrder;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.print("3");
            printInOrder.third(() -> System.out.print("third"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

