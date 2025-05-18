package BaiTapUpCastingAndDownCasting.Ultils;

import BaiTapUpCastingAndDownCasting.Abstracts.HocVien;
import BaiTapUpCastingAndDownCasting.Concretes.ChuyenVien;
import BaiTapUpCastingAndDownCasting.Concretes.NhanVienQuanLy;
import BaiTapUpCastingAndDownCasting.Concretes.NhanVienThuViec;
import BaiTapUpCastingAndDownCasting.Concretes.SinhVien;

public class GetOrginalOfHocVienHelper {
  public static HocVien getHocVienIdentity(int hocvienCode) {
    return switch(hocvienCode) {
      case 1 -> new SinhVien();
      case 2 -> new NhanVienThuViec();
      case 3 -> new NhanVienQuanLy();
      default -> new ChuyenVien();
    };
  }
  
  public static void logMessageByHocVienIdentity(HocVien hocvien, boolean isGetInfo) {
    if(hocvien instanceof SinhVien) {
      System.out.println((isGetInfo ? "Nhập thông tin cho " : "Đây là ") + "sinh viên");
    } else if(hocvien instanceof NhanVienThuViec) {
      System.out.println((isGetInfo ? "Nhập thông tin cho " : "Đây là ") + "nhân viên thử việc");
    } else if(hocvien instanceof NhanVienQuanLy) {
      System.out.println((isGetInfo ? "Nhập thông tin cho " : "Đây là ") + "nhân viên quản lý");
    } else {
      System.out.println((isGetInfo ? "Nhập thông tin cho " : "Đây là ") + "chuyên viên");
    }
  }
}
