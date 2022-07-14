package DesignPattern;

/**
 * abstraction
 * It represents a First in first out Collections
 */
public interface FifoCollections<T> {

    // add element
    void offer(T element);

    // remove & return first element;
    T poll();
}
