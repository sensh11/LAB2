import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
            arrayList.add(5);
            arrayList.add(2);
            arrayList.add(9);
            arrayList.add(7);
            System.out.println(arrayList.getFirst());
            System.out.println(arrayList.getLast());
            arrayList.remove(2);
            arrayList.printArr();
            arrayList.addLast(4);
            arrayList.printArr();

        MyList linkedList = new MyLinkedList<>();
            linkedList.add(4);
            linkedList.add(5);
            linkedList.add(4);
            linkedList.add(12);
            linkedList.add(3);
            linkedList.add(21);
            linkedList.removeFirst();
            linkedList.removeLast();
            linkedList.add(0,3);
            linkedList.addLast(4);
            linkedList.remove(0);
            linkedList.addFirst(12);
            linkedList.set(3, 22);
            System.out.println(linkedList.get(0));
            System.out.println(linkedList.getFirst());
            linkedList.addFirst(2);
            linkedList.size();
            linkedList.indexOf(12);
            linkedList.iterator();

        System.out.println(linkedList.toString());




    }


}