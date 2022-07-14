package DesignPattern;

public class Client {

    public static void main(String[] args) {
        FifoCollections<Integer> collections = new Queue<>(new SingleListedList<>());

        collections.offer(10);
        collections.offer(20);
        collections.offer(30);

        System.out.println(collections.poll());
        System.out.println(collections.poll());
        System.out.println(collections.poll());
        System.out.println(collections.poll());

    }
}
