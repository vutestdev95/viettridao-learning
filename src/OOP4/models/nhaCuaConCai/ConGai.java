package OOP4.models.nhaCuaConCai;

import OOP4.interfaces.PhatTu;
import OOP4.models.nhaCuaChaVaChu.NguoiCha;

public final class ConGai extends NguoiCha implements PhatTu {
  public ConGai() {
  }
  
  public ConGai(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
  }
  
  @Override
  public void tungKinhSuotNgay() {
    System.out.println("Người con gái tên " + getHoVaTen() + " đang tụng kinh!!!");
  }
}
