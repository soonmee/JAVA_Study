package ShuJuJieGou;

import java.util.LinkedList;
import java.util.Queue;

public class DuiLie {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.add(1);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}
//队列
//class MyQueue {
//    // store elements
//    private List<Integer> data = new ArrayList<>();
//    // a pointer to indicate the start position
//    private int p_start = 0;
//    /** Insert an element into the queue. Return true if the operation is successful. */
//    public boolean enQueue(int x) {
//        data.add(x);
//        return true;
//    };
//    /** Delete an element from the queue. Return true if the operation is successful. */
//    public boolean deQueue() {
//        if (isEmpty() == true) {
//            return false;
//        }
//        p_start++;
//        return true;
//    }
//    /** Get the front item from the queue. */
//    public int Front() {
//        return data.get(p_start);
//    }
//    /** Checks whether the queue is empty or not. */
//    public boolean isEmpty() {
//        return p_start >= data.size();
//    }
//};

/**
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * Front: 从队首获取元素。如果队列为空，返回 -1 。
 * Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * isEmpty(): 检查循环队列是否为空。
 * isFull(): 检查循环队列是否已满
 */
//循环队列
//class MyCircularQueue {
//
//    private int[] data;
//    private int head;
//    private int tail;
//    private int size;
//
//    /** Initialize your data structure here. Set the size of the queue to be k. */
//    public MyCircularQueue(int k) {
//        data = new int[k];
//        head = -1;
//        tail = -1;
//        size = k;
//    }
//
//    /** Insert an element into the circular queue. Return true if the operation is successful. */
//    public boolean enQueue(int value) {
//        if (isFull() == true) {
//            return false;
//        }
//        if (isEmpty() == true) {
//            head = 0;
//        }
//        tail = (tail + 1) % size;
//        data[tail] = value;
//        return true;
//    }
//
//    /** Delete an element from the circular queue. Return true if the operation is successful. */
//    public boolean deQueue() {
//        if (isEmpty() == true) {
//            return false;
//        }
//        if (head == tail) {
//            head = -1;
//            tail = -1;
//            return true;
//        }
//        head = (head + 1) % size;
//        return true;
//    }
//
//    /** Get the front item from the queue. */
//    public int Front() {
//        if (isEmpty() == true) {
//            return -1;
//        }
//        return data[head];
//    }
//
//    /** Get the last item from the queue. */
//    public int Rear() {
//        if (isEmpty() == true) {
//            return -1;
//        }
//        return data[tail];
//    }
//
//    /** Checks whether the circular queue is empty or not. */
//    public boolean isEmpty() {
//        return head == -1;
//    }
//
//    /** Checks whether the circular queue is full or not. */
//    public boolean isFull() {
//        return ((tail + 1) % size) == head;
//    }
//}