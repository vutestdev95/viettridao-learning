package baiTap3ConCho.ultils;

import baiTap3ConCho.beans.ChoNhat;
import baiTap3ConCho.beans.ChoPhap;
import baiTap3ConCho.beans.ChoVietNam;

import java.util.ArrayList;

public class DanhSachPhanLoaiCho {
  private ArrayList<ChoVietNam> danhSachChoVietNam;
  private ArrayList<ChoPhap> danhSachChoPhap;
  private ArrayList<ChoNhat> danhSachChoNhat;
  
  public DanhSachPhanLoaiCho() {
    this.danhSachChoVietNam = new ArrayList<>();
    this.danhSachChoPhap = new ArrayList<>();
    this.danhSachChoNhat = new ArrayList<>();
  }
  
  public void themChoVietNam(ChoVietNam choVietNam) {
    danhSachChoVietNam.add(choVietNam);
  }
  
  public void themChoPhap(ChoPhap choPhap) {
    danhSachChoPhap.add(choPhap);
  }
  
  public void themChoNhat(ChoNhat choNhat) {
    danhSachChoNhat.add(choNhat);
  }
  
  public ArrayList<ChoVietNam> getDanhSachChoVietNam() {
    return danhSachChoVietNam;
  }
  
  public ArrayList<ChoPhap> getDanhSachChoPhap() {
    return danhSachChoPhap;
  }
  
  public ArrayList<ChoNhat> getDanhSachChoNhat() {
    return danhSachChoNhat;
  }
  
  public int getTongSoLuongCho() {
    return danhSachChoVietNam.size() + danhSachChoPhap.size() + danhSachChoNhat.size();
  }
  
  public int getSoLuongChoVietNam() {
    return danhSachChoVietNam.size();
  }
  
  public int getSoLuongChoPhap() {
    return danhSachChoPhap.size();
  }
  
  public int getSoLuongChoNhat() {
    return danhSachChoNhat.size();
  }
}
