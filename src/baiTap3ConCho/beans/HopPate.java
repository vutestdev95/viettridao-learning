package baiTap3ConCho.beans;

public class HopPate extends ThucAnCuaCho {
  private String ngayHetHan;
  
  public HopPate(String ngayHetHan) {
    super();
    this.ngayHetHan = ngayHetHan;
  }
  
  public HopPate(String nguonGoc, String ngayHetHan) {
    super(nguonGoc);
    this.ngayHetHan = ngayHetHan;
  }
  
  public String getNgayHetHan() {
    return ngayHetHan;
  }
  
  public void setNgayHetHan(String ngayHetHan) {
    this.ngayHetHan = ngayHetHan;
  }
}
