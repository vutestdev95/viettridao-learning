package baiTap3ConCho.beans;

public class Shit {
  private String mauSac;
  private double trongLuong;
  
  public Shit() {
  }
  
  public Shit(String mauSac, double trongLuong) {
    this.mauSac = mauSac;
    this.trongLuong = trongLuong;
  }
  
  public String getMauSac() {
    return mauSac;
  }
  
  
  public void setMauSac(String mauSac) {
    this.mauSac = mauSac;
  }
  
  public double getTrongLuong() {
    return trongLuong;
  }
  
  public void setTrongLuong(double trongLuong) {
    this.trongLuong = trongLuong;
  }
}
