package datastructure.lists;

public class SinglyLinkedList {
  Node head;
  Node tail;
  int size;

  SinglyLinkedList() {}

  void addToHead(int data) {
    Node new_node = new Node(data);
    if (size == 0) {
      new_node.next = null;
      head = new_node;
      tail = new_node;
      size++;
      return;
    }
    new_node.next = head;
    head = new_node;
    size++;
  }

  void addToTail(int data) {
    Node new_node = new Node(data);
    if (size == 0) {
      new_node.next = null;
      head = new_node;
      tail = new_node;
      size++;
      return;
    }
    tail.next = new_node;
    tail = new_node;
    size++;
  }

  void traverseFromHead() {
    tranverseFromHead(head);
  }

  void tranverseFromHead(Node head) {
    if (head != null) {
      Node nodePointer = head;
      while (nodePointer != null) {
        System.out.print(nodePointer.data + " ");
        nodePointer = nodePointer.next;
      }
    }
  }

  int getDataFromEnd(int d) {
    int index = size - d;
    if (head != null) {
      Node nodePointer = head;
      while (nodePointer != null) {
        if (index == 0) {
          return nodePointer.data;
        }
        nodePointer = nodePointer.next;
        index--;
      }
    }
    return 0;
  }

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addToTail(1);
    list.addToTail(2);
    list.addToTail(3);
    list.addToTail(4);
    list.addToTail(5);
    list.traverseFromHead();
    System.out.println(list.getDataFromEnd(3));
    ;
  }
}
