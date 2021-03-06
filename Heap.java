import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
    // Your task is to implement a heap using an ArrayList
    // by completing the specified methods

    // This is the underlying array
    // refer to the Chapter 6 slides if you forget
    // It's actually pretty easy if you follow the slides
    // Don't overthink it.
    private ArrayList<E> heap;
    private int size;

    public Heap(){
        this.heap = new ArrayList<E>();
        this.size = 0;
    }


    // Problem Heap 1 10 pt
    // write a method that finds the index of an item's left child.
    // The parameter parent in this method is the index of the parent element
    // The left child's index is twice the parent's plus 1
    private int leftIndex(int parent) {
        int leftIndex;
        leftIndex = (2*parent)+1;

        return  leftIndex;
    }

    // Problem Heap 2 10 pt
    // write a method that finds the index of an item's right child.
    // The parameter parent in this method is the index of the parent element
    // The right child's index is twice the parent's plus 2
    private int rightIndex(int parent) {
        int rightIndex;
        rightIndex = (2*parent)+2;

        return rightIndex;
    }


    // Problem Heap 3 10 pt
    // write a method that finds the index of an item's parent.
    // The parameter child in this method is the index of the child element
    // The parent's index is the child's -1   divided by two

    private int parentIndex(int child) {
        int parentIndex;
        parentIndex = (child -1) / 2;

        return parentIndex;

    }


    // Problem Heap 4 20 points
    // Write a method that adds an item to the heap.
    // To add an item to the heap, add it to the first empty spot in the arrayList
    // Then while the item is smaller than it's parent, swap it with it's parent

    // Remember, there are no gaps between items in the array
    // You will need to use compareTo
    // You do not need to worry about resizing the heap, since the ArrayList does that for you
    public void add(E item) {
        this.heap.add(item);

        int child = this.heap.size() - 1;
        int parent = parentIndex(child);

        while(parent >= 0 && (item.compareTo(this.heap.get(parent))) < 0) {
            this.heap.set(child, this.heap.get(parent));
            this.heap.set(parent, item);
            child = parent;
            parent = parentIndex(parent);
        }
        size++;
    }


    // use this main to test
    public static void main(String[] args) {
        Heap test = new Heap();

        test.add(5);
        test.add(1);
        test.add(8);
        test.add(13);
        test.add(7);
        test.add(3);
        test.add(17);

        System.out.println(test.heap);
    }

}
