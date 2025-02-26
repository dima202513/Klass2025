package Homework.Homezadacha_Metod;

import java.util.*;
import java.util.function.Consumer;

public class MyArrayListEnd<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    Object[] elementData;
    private int size;
    private final int maxSize;

    public MyArrayListEnd(int maxSize) {
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
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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
/////*        int newLength = elementData.length * 3 / 2;
//        return Arrays.copyOf(elementData, newLength);
    }

    //
//    @Override
//    public boolean add(E o) {
//        if (size == maxSize) {
//            throw new ListFullException("List is full. The maximum capacity has been reached.");
//        }
//        ensureCapacity();
//        elementData[size++] = o;
//        return true;
//    }
//    private void ensureCapacity() {
//        if (size == elementData.length) {
//            int newCapacity = Math.min(maxSize, elementData.length * 3 / 2 + 1);
//            elementData = Arrays.copyOf(elementData, newCapacity);
//        }
//    }
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
//    @Override
//    public boolean remove(Object o) {
//        int index = indexOf(o);
//        if (index >= 0) {
//            remove(index);
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
//    @Override
//    public void clear() {
//        Arrays.fill(elementData, 0, size, null);
//        size = 0;
//    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E old = (E) elementData[index];
        elementData[index] = element;
        return old;
    }

    @Override
    public void add(int index, Object element) {
        if (size == maxSize) {
            throw new ListFullException("List is full. The maximum capacity has been reached.");
        }
        if (size == elementData.length) {
            elementData = grow();

        }
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
    }

    //    @Override
//    public void add(int index, E element) {
//        checkIndexForAdd(index);
//        if (size == maxSize) {
//            throw new ListFullException("List is full. The maximum capacity has been reached.");
//        }
//        ensureCapacity();
//        System.arraycopy(elementData, index, elementData, index + 1, size - index);
//        elementData[index] = element;
//        size++;
//    }
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

    //    @Override
//    public E remove(int index) {
//        checkIndex(index);
//        E removed = (E) elementData[index];
//        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
//        elementData[--size] = null;
//        return removed;
//    }
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

    //    @Override
//    public int indexOf(Object o) {
//        for (int i = 0; i < size; i++) {
//            if (Objects.equals(o, elementData[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }
    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
//    @Override
//    public int lastIndexOf(Object o) {
//        for (int i = size - 1; i >= 0; i--) {
//            if (Objects.equals(o, elementData[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException("Index: " + index + ", Size: " + size);
        }
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

    //    @Override
//    public String toString() {
//        return Arrays.toString(Arrays.copyOf(elementData, size));
//    }
//
//    private class Itr implements Iterator<E> {
//        private int cursor;
//        private int lastRet = -1;
//
//        @Override
//        public boolean hasNext() {
//            return cursor < size;
//        }
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
            MyArrayListEnd.this.remove(current);
            current--;
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

}

