package baiTap3ConCho.ultils;

import baiTap3ConCho.beans.ChoNhat;
import baiTap3ConCho.beans.ChoPhap;
import baiTap3ConCho.beans.ChoVietNam;

import java.util.Scanner;

public class ThongTinChoHelperBaiTap2 {
  private static final Scanner sc = new Scanner(System.in);
  
  public static Integer nhapTongSoLuongCho() {
    System.out.println("Nhập số lượng chó:");
    return sc.nextInt();
  }
  
  public static DanhSachPhanLoaiCho nhapThongTinCho(Integer n) {
    DanhSachPhanLoaiCho danhSachPhanLoaiCho = new DanhSachPhanLoaiCho();
    for(int i = 0; i < n; i++) {
      System.out.println("Nhập thông tin cho con có thứ " + (i + 1));
      System.out.println("Vui lòng chọn loại chó cần nhập");
      System.out.println("======================");
      System.out.println("1. Chó Việt Nam");
      System.out.println("2. Chó Pháp");
      System.out.println("3. Chó Nhật");
      System.out.println("======================");
      
      Integer loaiCho = sc.nextInt();
      sc.nextLine();
      
      switch(loaiCho) {
        case 1:
          ChoVietNam choVietNam = new ChoVietNam();
          System.out.println("Nhập tên chó Việt Nam:");
          choVietNam.setTen(sc.nextLine());
          System.out.println("Nhập tuổi chó Việt Nam:");
          choVietNam.setTuoi(Integer.parseInt(sc.nextLine()));
          
          danhSachPhanLoaiCho.themChoVietNam(choVietNam);
          break;
        case 2:
          ChoPhap choPhap = new ChoPhap();
          System.out.println("Nhập tên chó Pháp:");
          choPhap.setTen(sc.nextLine());
          System.out.println("Nhập tuổi chó Pháp:");
          choPhap.setTuoi(Integer.parseInt(sc.nextLine()));
          
          danhSachPhanLoaiCho.themChoPhap(choPhap);
          break;
        default:
          ChoNhat choNhat = new ChoNhat();
          System.out.println("Nhập tên chó Nhật:");
          choNhat.setTen(sc.nextLine());
          System.out.println("Nhập tuổi chó Nhật:");
          choNhat.setTuoi(Integer.parseInt(sc.nextLine()));
          
          danhSachPhanLoaiCho.themChoNhat(choNhat);
      }
    }
    return danhSachPhanLoaiCho;
  }
  
  public static void suaTheoLoaiCho(DanhSachPhanLoaiCho danhSachCho) {
    danhSachCho.getDanhSachChoVietNam().forEach(ChoVietNam::sua);
    danhSachCho.getDanhSachChoPhap().forEach(ChoPhap::sua);
    danhSachCho.getDanhSachChoNhat().forEach(ChoNhat::sua);
  }
}
