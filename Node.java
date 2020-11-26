package oop.linkedList;

public class Node {
    private Node next;
    private Node prev;
    private String info;

    public Node(Node next, Node prev, String info) {
        this.next = next;
        this.prev = prev;
        this.info = info;
    }

    public Node(String info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public String getInfo() {
        return info;
    }
}
