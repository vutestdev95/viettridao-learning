package BaiTapUpCastingAndDownCasting.ultils;

import java.util.Scanner;

public class InputHelper {
  private static final Scanner sc = new Scanner(System.in);
  
  public static String inputStringMethod(String message) {
    while(true) {
      System.out.println(message);
      String input = sc.nextLine();
      if(input.isEmpty()) {
        System.out.println("Vui lòng nhập lại, không được để trống!!!");
      } else {
        return input;
      }
    }
  }
  
  public static int inputIntMethod(String message) {
    while(true) {
      System.out.println(message);
      try {
        return Integer.parseInt(sc.nextLine());
      } catch(NumberFormatException e) {
        System.out.println("Vui lòng nhập lại số nguyên hợp lệ!!!");
      }
    }
  }
  
  public static int inputTypeOfHocVien(int indexOfHocVien) {
    while(true) {
      System.out.println("=======================");
      System.out.println("1. Sinh Viên");
      System.out.println("2. Nhân Viên Thử Việc");
      System.out.println("3. Nhân Viên Quản Lý");
      System.out.println("4. Chuyên Viên");
      System.out.println("=======================");
      int type = inputIntMethod("Vui lòng chọn loại học viên số thứ tự " + (indexOfHocVien + 1));
      if(type >= 1 && type <= 4) {
        return type;
      } else {
        System.out.println("Vui lòng nhập lại loại học viên hợp lệ!!!");
      }
    }
  }
}
