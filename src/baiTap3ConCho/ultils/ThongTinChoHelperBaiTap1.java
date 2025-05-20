package baiTap3ConCho.ultils;

import baiTap3ConCho.beans.Cho;
import baiTap3ConCho.beans.ChoNhat;
import baiTap3ConCho.beans.ChoPhap;
import baiTap3ConCho.beans.ChoVietNam;

import java.util.ArrayList;
import java.util.Scanner;

public class ThongTinChoHelperBaiTap1 {
  private static final Scanner sc = new Scanner(System.in);
  
  public static Integer nhapTongSoLuongCho() {
    System.out.println("Nhập số lượng chó:");
    return sc.nextInt();
  }
  
  public static void nhapThongTinCho(ArrayList<Cho> danhSachCho) {
    for(int i = 0; i < danhSachCho.size(); i++) {
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
          //Upcasting ngầm khi đối tượng chó Việt Nam được thêm vào danh sách chó
          danhSachCho.set(i, choVietNam);
          break;
        case 2:
          ChoPhap choPhap = new ChoPhap();
          System.out.println("Nhập tên chó Pháp:");
          choPhap.setTen(sc.nextLine());
          System.out.println("Nhập tuổi chó Pháp:");
          choPhap.setTuoi(Integer.parseInt(sc.nextLine()));
          //Upcasting ngầm khi đối tượng chó Pháp được thêm vào danh sách chó
          danhSachCho.set(i, choPhap);
          break;
        default:
          ChoNhat choNhat = new ChoNhat();
          System.out.println("Nhập tên chó Nhật:");
          choNhat.setTen(sc.nextLine());
          System.out.println("Nhập tuổi chó Nhật:");
          choNhat.setTuoi(Integer.parseInt(sc.nextLine()));
          //Upcasting ngầm khi đối tượng chó Nhật được thêm vào danh sách chó
          danhSachCho.set(i, choNhat);
      }
    }
  }
  
  public static void suaTungCon(ArrayList<Cho> danhSachCho) {
    for(Cho conCho : danhSachCho) {
      if(conCho instanceof ChoVietNam) {
        //DownCasting từ đối tượng cha là chó sang đối tượng con là chó Việt Nam
        ChoVietNam choVietNam = (ChoVietNam) conCho;
        choVietNam.sua();
        choVietNam.danhHoiTimToiPham();
      } else if(conCho instanceof ChoPhap) {
        //DownCasting từ đối tượng cha là chó sang đối tượng con là chó Pháp
        ChoPhap choPhap = (ChoPhap) conCho;
        choPhap.sua();
        choPhap.danhHoiTimToiPham();
      } else {
        //DownCasting từ đối tượng cha là chó sang đối tượng con là chó Nhật
        ChoNhat choNhat = (ChoNhat) conCho;
        choNhat.sua();
      }
    }
  }
}
