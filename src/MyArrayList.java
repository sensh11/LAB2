import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {

    private T[] arr;
    private int size;

    public MyArrayList (){
        arr = (T[]) new Object[6];
        size = 0;
    }


    @Override
    public Iterator<T> iterator() {
        return iterator();

    }


    @Override
    public void add(T item) {
        if (size >= arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index is not correct");


        }
    }


    @Override
    public void set(int index, T item) {
        checkIndex(index);
        T old = arr[index];
        arr[index] = item;

    }


    @Override
    public void add(int index, T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        checkIndex(index);
        arr[index] = item;
    }


    @Override
    public void addFirst(T item) {
        add(0 , item);
    }


    @Override
    public void addLast(T item) {
        add(size- 1 , item);

    }


    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }


    @Override
    public T getFirst() {
        return arr[0];
    }


    @Override
    public T getLast() {
        return arr [size-1];
    }


    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1 ; i < size ; i++ ){
            arr[i-1] = arr[i];
        }
        size--;
    }


    @Override
    public void removeFirst() {
    remove(0);
    }


    @Override
    public void removeLast() {
        remove(size - 1);

    }


    @Override
    public void sort() {

    }


    @Override
    public int indexOf(Object object) {
        if (object == null) {
            for (int i = 0; i < size; i++)
                if (arr[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (object.equals(arr[i]))
                    return i;
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }


    @Override
    public boolean exists(Object object) {
        return indexOf(object ) >= 0;
    }


    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(arr , 0 , newArray,0,size);
        return newArray;
    }


    @Override
    public void clear() {
        arr = (T[]) new Object[6];
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    public void printArr (){
        for(int i = 0 ; size > i ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
