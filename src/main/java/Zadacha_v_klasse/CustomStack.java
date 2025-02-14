package Zadacha_v_klasse;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CustomStack <T>{

    private LinkedList <T> data = new LinkedList<>();

    public void push(T element){
        data.addFirst(element);
    }

    public T pop(){
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.pop();
    }

    public T peek(){
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.peek();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}