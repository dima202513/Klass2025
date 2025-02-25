package Homework.Homezadacha_Metod;

import java.util.*;

import Homework.Homezadacha_Metod.InvalidIndexException;
import Homework.Homezadacha_Metod.ListFullException;

public class MyArrayList1 {

    public static class TestArrayList<E> implements List<E> {

        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;
        private int size = 0;

        public TestArrayList(int capacity) {
            if (capacity > 0) {
                elements = new Object[capacity];
            } else if (capacity == 0) {
                elements = new Object[DEFAULT_CAPACITY];
            } else {
                throw new IllegalArgumentException("Capacity must be greater than zero");
            }
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
                private int lastReturnedIndex = -1;  // Track the last returned index

                @Override
                public boolean hasNext() {
                    return cursor < size;
                }

                @Override
                public E next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    lastReturnedIndex = cursor;
                    return getElement(cursor++);
                }

                @Override
                public void remove() {
                    if (lastReturnedIndex == -1) {
                        throw new IllegalStateException("next() should be called before remove()");
                    }
                    TestArrayList.this.remove(lastReturnedIndex);
                    cursor = lastReturnedIndex;  // Move the cursor back to last removed index
                    lastReturnedIndex = -1;
                }
            };
        }

        @Override
        public boolean remove(Object o) {
            int index = indexOf(o);
            if (index != -1) {
                remove(index);
                return true;
            }
            return false;
        }

        @Override
        public Object[] toArray() {
            return Arrays.copyOf(elements, size);
        }

        @Override
        public <T> T[] toArray(T[] a) {
            if (a.length < size) {
                return (T[]) Arrays.copyOf(elements, size, a.getClass());
            }
            System.arraycopy(elements, 0, a, 0, size);
            if (a.length > size) {
                a[size] = null;
            }
            return a;
        }

        @Override
        public boolean add(E e) {
            if (size >= elements.length) {
                // Увеличиваем ёмкость массива на 1.5 раза
                int newCapacity = elements.length + (elements.length / 2);
                elements = Arrays.copyOf(elements, newCapacity);
            }
            elements[size++] = e;
            return true;
        }

        @Override
        public void add(int index, E element) {
            checkIndexForAdd(index);
            if (size >= elements.length) {
                int newCapacity = elements.length + (elements.length / 2);
                elements = Arrays.copyOf(elements, newCapacity);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return c.stream().allMatch(this::contains);
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            for (E e : c) {
                add(e);
            }
            return true;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            checkIndexForAdd(index);
            for (E e : c) {
                add(index++, e);
            }
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            boolean modified = false;
            for (Object o : c) {
                while (remove(o)) {
                    modified = true;
                }
            }
            return modified;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            boolean modified = false;
            for (int i = 0; i < size; i++) {
                if (!c.contains(elements[i])) {
                    remove(i);
                    modified = true;
                    i--;
                }
            }
            return modified;
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
            return null;
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
    }

    static class ListFullException extends RuntimeException {
        public ListFullException(String message) {
            super(message);
        }
    }

    static class InvalidIndexException extends RuntimeException {
        public InvalidIndexException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        TestArrayList<Integer> list = new TestArrayList<>(10);
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



