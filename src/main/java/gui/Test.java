package gui;

public class Test {

  public static void main(String[] args) throws InterruptedException {

    String str = "abc";
    str = null;
    System.gc();
    Thread.sleep(1000);
    System.out.println("End");
  }

  protected void finalize() {
    System.out.println("finalize");
  }
}
