package baiTap3ConCho;

import baiTap3ConCho.ultils.DanhSachPhanLoaiCho;
import baiTap3ConCho.ultils.ThongTinChoHelperBaiTap2;

public class BaiTap2Main {
  public static void main(String[] args) {
    Integer n = ThongTinChoHelperBaiTap2.nhapTongSoLuongCho();
    DanhSachPhanLoaiCho danhSachPhanLoaiCho = ThongTinChoHelperBaiTap2.nhapThongTinCho(n);
    ThongTinChoHelperBaiTap2.suaTheoLoaiCho(danhSachPhanLoaiCho);
  }
}
