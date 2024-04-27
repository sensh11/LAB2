package datatypes;

import list.MyList;

public class MinHeap<T extends Comparable<T>> {
    private final MyList<T> list;

    public MinHeap(MyList<T> list) {
        this.list = list;
    }

    public void insert(T t) {
        list.addLast(t);
        heapifyAdd(t, list.size() - 1);
    }

    public T getMin() {
        return list.getFirst();
    }

    public T popMin() {
        T min = list.getFirst();
        list.removeFirst();
        list.set(0, list.getLast());
        list.removeLast();
        heapifyRemove(0);
        return min;
    }

    public void decrease() {

    }

    public void delete(int index) {
    }

    private void heapifyRemove(int index) {
        int l = (index + 1) * 2 - 1;
        int r = (index + 1) * 2;
        int go;
        if (l >= list.size()) {
            go = r;
        } else if (r >= list.size()) {
            go = l;
        } else {
            go = list.get(l).compareTo(list.get(r)) > 0 ? r : l;
            if (list.get(l).compareTo(list.get(r)) > 0) {
                T t = list.get(go);
                list.set(go, list.get(index));
                list.set(index, t);
                heapifyRemove(go);
            }
        }
    }


    private void heapifyAdd(T t, int index) {
        int parent = index / 2;
        if (list.get(parent).compareTo(t) > 0) {
            T temp = list.get(parent);
            list.set(parent, t);
            list.set(index, temp);
            heapifyAdd(t, parent);
        }
    }
}