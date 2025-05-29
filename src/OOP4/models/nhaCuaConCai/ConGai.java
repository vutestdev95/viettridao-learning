package OOP4.models.nhaCuaConCai;

import OOP4.interfaces.PhatTu;
import OOP4.models.MucRuoi;
import OOP4.models.nhaCuaChaVaChu.NguoiCha;

public final class ConGai extends NguoiCha implements PhatTu {
  private final MucRuoi mucRuoiBenTrai;
  
  public ConGai() {
    mucRuoiBenTrai = new MucRuoi();
  }
  
  public ConGai(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
    mucRuoiBenTrai = new MucRuoi();
  }
  
  @Override
  public void tungKinhSuotNgay() {
    System.out.println("Người con gái tên " + getHoVaTen() + " đang tụng kinh!!!");
  }
  
  public MucRuoi chiMucRuoiCuaConGai() {
    return mucRuoiBenTrai;
  }
  
  public MucRuoi chiMucRuoiCuaChaDeLai() {
    return mucRuoiBenPhai;
  }
}
