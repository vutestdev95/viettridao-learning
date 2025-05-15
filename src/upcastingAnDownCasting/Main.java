package upcastingAnDownCasting;

public class Main {
  public static void main(String[] args) {
    HocVien hocVien1 = new HocVien();
    HocVien hocVien2 = (SinhVien)  hocVien1;
    ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
    NhanVienChinhThuc hocVien4 = hocVien3;
    HocVien hocVien5 = hocVien3;
    HocVien hocVien6 = (HocVien) hocVien2;
    HocVien hocVien7 = (QuanLy) hocVien6;
    NhanVienChinhThuc hocVien8 = (NhanVienChinhThuc) hocVien7;
//    SinhVien hocVien9 = (SinhVien) hocVien3;
    HocVien hocVien10 = new SinhVien();
    ChuyenVien hocVien11 = (ChuyenVien) hocVien10;
    HocVien hocVien12 = (HocVien)new SinhVien();
    
    HocVien hocVien13 = new SinhVien();
    HocVien hocVien14 = (SinhVien) hocVien13;
//    SinhVien hocVien15 = new HocVien();
    SinhVien hocVien16 = (SinhVien) new HocVien();
  }
}
