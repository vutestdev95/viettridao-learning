package privateProtected.package1;

public class A {
  protected String name = "name a";
  
  public static void main(String[] args) {
    String name = "name a";
    System.out.println(name.concat("b"));
    System.out.println(name);
  }
}
