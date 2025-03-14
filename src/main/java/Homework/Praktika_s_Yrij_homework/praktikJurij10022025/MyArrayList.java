package Homework.Praktika_s_Yrij_homework.praktikJurij10022025;

import java.util.*;
import java.util.function.Consumer;

public class MyArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    Object[] elementData;
    private int size;
    private int maxSize;

    public MyArrayList(int maxSize) {
        this.maxSize = maxSize;
        elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0 ;

    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E o) {
        if (size == maxSize) {
            throw new IllegalArgumentException("List is full. The maximum capacity has been reached.");
        }
        if (size == elementData.length) {
            elementData = grow();

        }
        elementData[size++] = o;
        return true;
    }

    private Object[] grow() {
        Object[] newArr = new Object[elementData.length * 3 / 2];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        return newArr;
/*        int newLength = elementData.length * 3 / 2;
        return Arrays.copyOf(elementData, newLength);*/
    }


    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, Object element) {
        E old = (E)elementData[index];
        elementData[index] = element;
        return old;
    }

    @Override
    public void add(int index, Object element) {
        if (size == maxSize) {
            throw new IllegalArgumentException("List is full. The maximum capacity has been reached.");
        }
        if (size == elementData.length) {
            elementData = grow();

        }
        for (int i = size - 1; i >= index; i--) {
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
    }

    @Override
    public E remove(int index) {
        Object removingObject = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        elementData[size] = null;
        return (E) removingObject;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size -1; i >= 0; i--) {
                if (elementData[i] == null){
                    return i;
                }
            }
        }else{
            for (int i = size -1; i >= 0; i--) {
                if (o.equals(elementData[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]);
            if (i == size - 1) {
                break;
            }
            sb.append(", ");
        }
        return sb.append(']').toString();
    }

    private class Itr implements Iterator<E> {
        private int current = -1;

        @Override
        public boolean hasNext() {
            return current + 1 < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            current++;
            return (E) elementData[current];
        }

        @Override
        public void remove() {
            if (current < 0) {
                throw new IllegalStateException();
            }
            MyArrayList.this.remove(current);
            current--;
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

}

