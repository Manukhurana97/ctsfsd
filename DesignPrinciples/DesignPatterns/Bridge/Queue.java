package DesignPattern;

public class Queue<T> implements FifoCollections<T> {

    private LinkedList<T> list;

    public Queue(LinkedList<T> list){
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
