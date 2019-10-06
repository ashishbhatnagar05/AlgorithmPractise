package geeksforgeeks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CheckIfLinkedListIsCircular {

  static class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }

  static <T> Node<T> createNode(T data) {
    Node<T> node = new Node<T>(data);
    return node;
  }

  static boolean isCircular(Node head) {
    if (head == null) {
      return true;
    }

    Node temp = head.getNext();
    while (temp != null && temp != head) {
      temp = temp.getNext();
    }
    return head == temp;
  }

  public static void main(String args[]) throws Exception {
    Node<Integer> head = createNode(1);
    head.next = createNode(2);
    head.next.next = createNode(3);
    head.next.next.next = head;
    System.out.println(isCircular(head));
  }
}
