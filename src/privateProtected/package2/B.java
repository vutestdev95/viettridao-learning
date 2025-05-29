package privateProtected.package2;

import privateProtected.package1.A;

public class B extends A {
  public void methodB() {
    B b = new B();
    b.name = "name b";
  }
}
