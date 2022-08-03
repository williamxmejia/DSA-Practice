package datastructuresandalgorithms;

public class MyLinkedList<E> {
    private ListNode<E> head;
    private ListNode<E> current;
    private ListNode<E> previous;


    public MyLinkedList() {
    }

    public void insertFirst(E value){
        ListNode<E> newNode = new ListNode<>(value, null);
        if(head == null){
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertLast(E value){
        ListNode<E> newNode = new ListNode<>(value, null);
        if(head == null){
            head = newNode;
        } else {
            current = head;
            while(current != null){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(newNode);
        }
    }

//    public void deleteFirst(){
//        if(head != null){
//            head = head.getNext();
//        }
//    }

    public ListNode<E> deleteFirst(){
        ListNode<E> remove = head;
        if(head != null){
            head = head.getNext();
        }
        return remove;
    }

//    public void deleteLast(){
//        if(head != null){
//            current = head;
//            while(current.getNext() != null){
//                previous = current;
//                current = current.getNext();
//            }
//            previous.setNext(null);
//        }
//    }

    public ListNode<E> deleteLast(){
        if(head != null){
            current = head;
            while (current.getNext() != null){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            return current;
        }
        return null;
    }



    public ListNode<E> getHead() {
        return head;
    }

    public void setHead(ListNode<E> head) {
        this.head = head;
    }

    public ListNode<E> getCurrent() {
        return current;
    }

    public void setCurrent(ListNode<E> current) {
        this.current = current;
    }

    public ListNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode<E> previous) {
        this.previous = previous;
    }
}
