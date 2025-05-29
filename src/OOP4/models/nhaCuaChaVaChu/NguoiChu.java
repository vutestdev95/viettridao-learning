package OOP4.models.nhaCuaChaVaChu;

import OOP4.interfaces.NguoiChanNuoi;
import OOP4.interfaces.ThoDien;
import OOP4.models.nhaCuaOngNoi.OngNoi;

public class NguoiChu extends OngNoi implements ThoDien, NguoiChanNuoi {
  public NguoiChu() {
  }
  
  public NguoiChu(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
  }
  
  @Override
  public void thayBongDen() {
    System.out.println("Người chú tên " + getHoVaTen() + " đang thay bóng đèn!!!");
  }
  
  @Override
  public void lamRuong() {
    System.out.println("Người chú tên " + getHoVaTen() + " đang thay bóng đèn!!!");
  }
  
  @Override
  public void chanNuoiDongVat() {
    System.out.println("Người chú tên " + getHoVaTen() + " đang nuôi heo!!!");
  }
  
  void nguNgayToLam() {
    System.out.println("Người chú tên " + getHoVaTen() + " đang ngủ ngáy to lắm!!!");
  }
}
