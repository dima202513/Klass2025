package Homework.Praktika_s_Yrij_homework.homework;

import java.util.*;

public class TestArrayList<E> implements List<E> {
    private final Object[] elements;
    private int size = 0;

    public TestArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        this.elements = new Object[capacity];
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
        return new Iterator<E>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return getElement(cursor++);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size >= elements.length) {
            throw new ListFullException("List is full. Cannot add new element.");
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        checkIndexForAdd(index);
        if (size >= elements.length) {
            throw new ListFullException("List is full. Cannot add new element.");
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) return false;
        remove(index);
        return true;
    }

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
    public E remove(int index) {
        checkIndex(index);
        E removed = getElement(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return removed;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return getElement(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E old = getElement(index);
        elements[index] = element;
        return old;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }
        return -1;
    }

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

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Index out of bounds: " + index);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException("Index out of bounds for add: " + index);
        }
    }

    @SuppressWarnings("unchecked")
    private E getElement(int index) {
        return (E) elements[index];
    }

    public static void main(String[] args) {
        TestArrayList<Integer> list = new TestArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List: " + list);
        list.remove(1);
        System.out.println("After removal: " + list);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("After adding more elements: " + list);
    }
}
