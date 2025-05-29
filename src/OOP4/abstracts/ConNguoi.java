package OOP4.abstracts;

public abstract class ConNguoi {
  private String hoVaTen;
  private String namSinh;
  private String gioiTinh;
  private String hoVaTenCha;
  
  protected ConNguoi() {
  
  }
  
  protected ConNguoi(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    this.hoVaTen = hoVaTen;
    this.namSinh = namSinh;
    this.gioiTinh = gioiTinh;
    this.hoVaTenCha = hoVaTenCha;
  }
  
  public String getHoVaTen() {
    return hoVaTen;
  }
  
  public void setHoVaTen(String hoVaTen) {
    this.hoVaTen = hoVaTen;
  }
  
  public String getNamSinh() {
    return namSinh;
  }
  
  public void setNamSinh(String namSinh) {
    this.namSinh = namSinh;
  }
  
  public String getGioiTinh() {
    return gioiTinh;
  }
  
  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }
  
  public String getHoVaTenCha() {
    return hoVaTenCha;
  }
  
  public void setHoVaTenCha(String hoVaTenCha) {
    this.hoVaTenCha = hoVaTenCha;
  }
}
