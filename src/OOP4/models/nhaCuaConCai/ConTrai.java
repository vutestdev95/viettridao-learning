package OOP4.models.nhaCuaConCai;

import OOP4.models.MucRuoi;
import OOP4.models.nhaCuaChaVaChu.NguoiCha;

public class ConTrai extends NguoiCha {
  public ConTrai() {
  }
  
  public ConTrai(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
  }
  
  public void lamRuongTheoPhongCachCuaMinh() {
    System.out.println("Người con tên " + getHoVaTen() + " Đang làm ruộng theo phong cách của mình!!!");
  }
  
  public void lamRuongTheoLoaiRuong(boolean theoPhongCachNguoiCha) {
    if(theoPhongCachNguoiCha) {
      super.lamRuong();
    } else {
      lamRuongTheoPhongCachCuaMinh();
    }
  }
  
  public MucRuoi chiMucRuoiCuaConTrai() {
    return mucRuoiBenPhai;
  }
  
  public MucRuoi chiMucRuoiCuaChaDeLai() {
    return mucRuoiBenPhai;
  }
}
