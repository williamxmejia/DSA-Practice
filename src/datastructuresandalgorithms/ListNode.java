package datastructuresandalgorithms;

public class ListNode<E> {
    private E value;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(E value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
