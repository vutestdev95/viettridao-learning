package OOP4.models.nhaCuaOngNoi;

import OOP4.abstracts.ConNguoi;

public class OngNoi extends ConNguoi {
  public OngNoi() {
    super();
  }
  
  public OngNoi(String hoVaTen, String namSinh, String gioiTinh, String hoVaTenCha) {
    super(hoVaTen, namSinh, gioiTinh, hoVaTenCha);
  }
  
  public void lamRuong() {
    System.out.println("Ông nội tên " + getHoVaTen() + " đang làm ruộng!!!");
  }
}
