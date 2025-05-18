package BaiTapUpCastingAndDownCasting;

import BaiTapUpCastingAndDownCasting.Abstracts.HocVien;
import BaiTapUpCastingAndDownCasting.Ultils.InfoProcessorHelper;

import java.util.ArrayList;

public class UpDownCastingMain {
  private static final int numberOfHocViens = 10;
  
  public static void main(String[] args) {
    ArrayList<HocVien> hocVienList = InfoProcessorHelper.getInfo(numberOfHocViens);
    InfoProcessorHelper.exportInfo(hocVienList);
  }
}
