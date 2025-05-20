package baiTap3ConCho.beans;

public class ChoNhat extends Cho {
  public ChoNhat() {
    super();
  }
  
  public ChoNhat(String ten, Integer tuoi) {
    super(ten, tuoi);
  }
  
  @Override
  public void sua() {
    System.out.println("Hêy Hêy");
  }
}