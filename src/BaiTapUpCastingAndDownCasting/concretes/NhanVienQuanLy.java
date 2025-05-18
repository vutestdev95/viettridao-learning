package BaiTapUpCastingAndDownCasting.concretes;

import BaiTapUpCastingAndDownCasting.abstracts.NhanVienChinhThuc;
import BaiTapUpCastingAndDownCasting.ultils.InputHelper;

public class NhanVienQuanLy extends NhanVienChinhThuc {
  private String name;
  private int age;
  private String country;
  
  @Override
  public void addInfo() {
    this.name = InputHelper.inputStringMethod("Nhập tên: ");
    this.age = InputHelper.inputIntMethod("Nhập tuổi: ");
    this.country = InputHelper.inputStringMethod("Nhập quốc gia: ");
  }
  
  @Override
  public void showInfo() {
    System.out.println("Tên: " + this.name);
    System.out.println("Tuổi: " + this.age);
    System.out.println("Quốc gia: " + this.country);
  }
}
