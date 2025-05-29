package baiTap3ConCho.beans;

import baiTap3ConCho.interfaces.ChoAnShit;
import baiTap3ConCho.interfaces.ChoAnXuong;
import baiTap3ConCho.interfaces.ChoSan;

public class ChoVietNam extends Cho implements ChoAnXuong, ChoAnShit, ChoSan {
  public ChoVietNam() {
    super();
  }
  
  public ChoVietNam(String ten, Integer tuoi) {
    super(ten, tuoi);
  }
  
  @Override
  public void sua() {
    System.out.println("Gâu Gâu");
  }
  
  @Override
  //Overload phương thức anThucAn với tham số là cuc xương
  public void anThucAn(CucXuong cucXuong) {
    System.out.println("Con chó Việt Nam tên: " + this.getTen() + " đang ăn cục xương có nguồn gốc: " + cucXuong.getNguonGoc());
  }
  
  @Override
  //Overload phương thức anThucAn với tham số là cuc shit
  public void anThucAn(Shit shit) {
    System.out.println("Con chó Việt Nam tên: " + this.getTen() + " đang ăn cục shit có màu: " + shit.getMauSac());
  }
  
  @Override
  public void danhHoiTimToiPham() {
    System.out.println("Con chó Việt Nam tên: " + this.getTen() + " đang đánh hơi tìm tội pham");
  }
}
