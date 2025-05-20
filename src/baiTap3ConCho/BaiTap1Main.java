package baiTap3ConCho;

import baiTap3ConCho.beans.Cho;
import baiTap3ConCho.ultils.ThongTinChoHelperBaiTap1;

import java.util.ArrayList;

public class BaiTap1Main {
  
  public static void main(String[] args) {
    Integer n = ThongTinChoHelperBaiTap1.nhapTongSoLuongCho();
    ArrayList<Cho> danhSachCho = new ArrayList<Cho>();
    
    for(int i = 0; i < n; i++) {
      danhSachCho.add(null);
    }
    
    System.out.println(danhSachCho);
    ThongTinChoHelperBaiTap1.nhapThongTinCho(danhSachCho);
    ThongTinChoHelperBaiTap1.suaTungCon(danhSachCho);
  }
}
