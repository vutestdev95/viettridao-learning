package baiTap3ConCho.beans;

import baiTap3ConCho.interfaces.ChoAnPate;
import baiTap3ConCho.interfaces.ChoAnXuong;
import baiTap3ConCho.interfaces.ChoSan;

public class ChoPhap extends Cho implements ChoAnXuong, ChoAnPate, ChoSan {
  public ChoPhap() {
    super();
  }
  
  public ChoPhap(String ten, Integer tuoi) {
    super(ten, tuoi);
  }
  
  @Override
  public void sua() {
    System.out.println("Ghê Ghê");
  }
  
  
  @Override
  //Overload phương thức anThucAn với tham số là hộp pate
  public void anThucAn(HopPate hopPate) {
    System.out.println("Con chó Pháp tên: " + this.getTen() + " Đang ăn hộp pate có nguồn gốc: " + hopPate.getNguonGoc());
  }
  
  @Override
  //Overload phương thức anThucAn với tham số là cục xương
  public void anThucAn(CucXuong cucXuong) {
    System.out.println("Con chó Pháp tên: " + this.getTen() + " Đang ăn cục xương có nguồn gốc: " + cucXuong.getNguonGoc());
  }
  
  @Override
  public void danhHoiTimToiPham() {
    System.out.println("Con chó Pháp tên: " + this.getTen() + " Đang đánh hơi tìm tội pham");
  }
}
