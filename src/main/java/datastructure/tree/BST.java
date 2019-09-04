package datastructure.tree;

public class BST {

  Node root;

  BST() {
    root = null;
  }

  void insert(int data) {
    root = insertRec(root, data);
  }

  Node insertRec(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (root.data < data) {
      root.left = insertRec(root.left, data);
    } else if (root.data > data) {
      root.right = insertRec(root.right, data);
    }
    return root;
  }

  void inorder() {
    inorderRec(root);
  }

  private void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.println(root.data + "");
      inorderRec(root.right);
    }
  }

  class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  public static void main(String[] args) {

    BST bst = new BST();
    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    bst.insert(5);
    bst.insert(6);

    bst.inorder();
  }
}
