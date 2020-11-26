package oop.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void add(String info) {
        if (head == null) {
            Node temp = new Node(info);
            head = temp;
            tail = temp;
            size++;
            return;
        }
        Node tempN = new Node(info);
        tempN.setPrev(tail);
        tail.setNext(tempN);
        tail = tempN;
        size++;
    }

    public void add(int position, String info) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (position==0){
            if (size==0){
                add(info);
            }
            else {
                Node step = head;
                Node temp = new Node(step, step.getPrev(), info);
                step.setPrev(temp);
                head=temp;
            }

        }
        int count = 0;
        Node step = head;
        while (count!=position) {
            step = step.getNext();
            count++;
        }
        Node temp = new Node(step, step.getPrev(), info);
        step.setPrev(temp);
    }

    public String get(int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node step = head;
        while (count!=position) {
            step = step.getNext();
            count++;
        }
        return step.getInfo();
    }

    public void set(int position, String info)  {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node step = head;
        while (count!=position) {
            step = step.getNext();
            count++;
        }
        step.setInfo(info);
    }

    public void remove (int position)  {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size==0){
            throw new IndexOutOfBoundsException();
        }
        if (position==size-1){
            Node step = tail;
            tail = step.getPrev();
            tail.setNext(null);
        }
        int count = 0;
        Node step = head;
        while (count!=position) {
            step = step.getNext();
            count++;
        }
        step.getNext().setPrev(step.getPrev());
        step.getPrev().setNext(step.getNext());
    }
//    public Node getNode(int position) throws IndexOutOfBoundsException{
//        if (position < 0 || position > size) {
//            throw new IndexOutOfBoundsException();
//        }
//        Node step = head;
//        while (position != size) {
//            step = step.getNext();
//            size--;
//        }
//        return step;
//    }
}

