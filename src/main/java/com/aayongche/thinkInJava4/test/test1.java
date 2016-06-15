package com.aayongche.thinkInJava4.test;



import java.util.LinkedList;

/**
 *
 * Created by lyj on 2016/5/24.
 */
public class test1 {

    public static void main(String[] args) {
        
    }

    class Stack<T> {
        private LinkedList<T> storage = new LinkedList<T>();
        public void push(T v) { storage.addFirst(v); }
        public T peek() { return storage.getFirst(); }
        public T pop() { return storage.removeFirst(); }
        public boolean empty() { return storage.isEmpty(); }
        public String toString() { return storage.toString(); }
        public void pushAll(Iterable<T> src){
            for(T t:src){
                push(t);
            }
        }
    }

}
