package BaiTapUpCastingAndDownCasting;

import BaiTapUpCastingAndDownCasting.abstracts.HocVien;
import BaiTapUpCastingAndDownCasting.ultils.InfoProcessorHelper;

public class UpDownCastingMain {
  private static final int numberOfHocViens = 10;
  
  public static void main(String[] args) {
    HocVien[] hocVienList = InfoProcessorHelper.getInfo(numberOfHocViens);
    InfoProcessorHelper.exportInfo(hocVienList);
  }
}
