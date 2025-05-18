package BaiTapUpCastingAndDownCasting.Concretes;

import BaiTapUpCastingAndDownCasting.Abstracts.HocVien;
import BaiTapUpCastingAndDownCasting.Ultils.InputHelper;

public class SinhVien extends HocVien {
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
    System.out.println("Quốc Gia: " + this.country);
  }
}
