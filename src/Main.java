import java.util.ArrayList;

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






    }


}