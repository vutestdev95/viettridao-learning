package baiTap3ConCho.beans;

public class CucXuong extends ThucAnCuaCho {
  private String kichThuoc;
  private String thoiDiemRaDoi;
  
  public CucXuong() {
    super();
  }
  
  public CucXuong(String nguonGoc, String kichThuoc, String thoiDiemRaDoi) {
    super(nguonGoc);
    this.kichThuoc = kichThuoc;
    this.thoiDiemRaDoi = thoiDiemRaDoi;
  }
  
  public String getThoiDiemRaDoi() {
    return thoiDiemRaDoi;
  }
  
  public void setThoiDiemRaDoi(String thoiDiemRaDoi) {
    this.thoiDiemRaDoi = thoiDiemRaDoi;
  }
  
  public String getKichThuoc() {
    return kichThuoc;
  }
  
  public void setKichThuoc(String kichThuoc) {
    this.kichThuoc = kichThuoc;
  }
}
