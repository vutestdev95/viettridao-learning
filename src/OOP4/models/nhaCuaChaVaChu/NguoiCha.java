package OOP4.models.nhaCuaChaVaChu;

import OOP4.interfaces.NguoiChanNuoi;
import OOP4.models.MucRuoi;
import OOP4.models.nhaCuaOngNoi.OngNoi;

public class NguoiCha extends OngNoi implements NguoiChanNuoi {
  protected MucRuoi mucRuoiBenPhai;
  
  public NguoiCha() {
    mucRuoiBenPhai = new MucRuoi();
  }
  
  public NguoiCha(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
    mucRuoiBenPhai = new MucRuoi();
  }
  
  @Override
  public void lamRuong() {
    System.out.println("Người cha tên " + getHoVaTen() + " đang làm ruộng!!!");
  }
  
  @Override
  public void chanNuoiDongVat() {
    System.out.println("Người cha tên " + getHoVaTen() + " đang nuôi gà!!!");
  }
  
  protected void ngoayLoMui() {
    System.out.println("Người cha tên " + getHoVaTen() + " đang ngoáy lỗ mũi!!!");
  }
  
  public final void thichAnNhau() {
    System.out.println("Người cha tên " + getHoVaTen() + " thích ăn nhậu!!!");
  }
}
