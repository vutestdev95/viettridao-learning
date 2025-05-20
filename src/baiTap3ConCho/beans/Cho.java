package baiTap3ConCho.beans;

public class Cho {
  private String ten;
  private Integer tuoi;
  
  public Cho() {
  }
  
  public Cho(String ten, Integer tuoi) {
    this.ten = ten;
    this.tuoi = tuoi;
  }
  
  public String getTen() {
    return ten;
  }
  
  public void setTen(String ten) {
    this.ten = ten;
  }
  
  public Integer getTuoi() {
    return tuoi;
  }
  
  public void setTuoi(Integer tuoi) {
    this.tuoi = tuoi;
  }
  
  public void sua() {
    System.out.println("Chó sủa!!!");
  }
}
