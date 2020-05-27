package com.xbb.leetcode.learning.link;

/**
 * 双向链表
 *
 * @author x00444382
 * @since 2020-05-25
 */
public class DelinkedList {
    private int val;

    private DelinkedList next;

    private DelinkedList prev;

    private DelinkedList head;

    private DelinkedList tail;

    private int size;

    public DelinkedList() {
    }

    public int get(int index) {
        DelinkedList node = getNode(index);
        if (node == null) {
            return -1;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        DelinkedList node = new DelinkedList();
        node.val = val;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        DelinkedList node = new DelinkedList();
        node.val = val;
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index < size) {
            DelinkedList prevNode = getNode(index - 1);
            DelinkedList node = getNode(index);
            DelinkedList newNode = new DelinkedList();
            newNode.val = val;
            newNode.prev = prevNode;
            newNode.next = node;
            if (prevNode != null) {
                prevNode.next = newNode;
            }
            if (node != null) {
                node.prev = newNode;
            }
        }
        if (index <= size) {
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 && index >= size) {
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            DelinkedList node = getNode(index);
            if (node == null) {
                return;
            }
            if (node == head) {
                head = head.next;
                head.prev = null;
            } else if (node == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                DelinkedList prev = node.prev;
                DelinkedList next = node.next;
                prev.next = node.next;
                next.prev = node.prev;
            }
        }
        size--;
    }

    public void printDelinkedList() {
        DelinkedList node = head;
        StringBuilder nodes = new StringBuilder();
        while (node != null) {
            nodes.append(node.val).append(" <=> ");
            node = node.next;
        }
        nodes.append("null");
        System.out.println(nodes.toString());
    }

    private DelinkedList getNode(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        DelinkedList node = head;
        while (index != 0) {
            node = node.next;
            index--;
        }
        return node;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DelinkedList getNext() {
        return next;
    }

    public void setNext(DelinkedList next) {
        this.next = next;
    }

    public DelinkedList getPrev() {
        return prev;
    }

    public void setPrev(DelinkedList prev) {
        this.prev = prev;
    }

    public DelinkedList getHead() {
        return head;
    }

    public void setHead(DelinkedList head) {
        this.head = head;
    }

    public DelinkedList getTail() {
        return tail;
    }

    public void setTail(DelinkedList tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
