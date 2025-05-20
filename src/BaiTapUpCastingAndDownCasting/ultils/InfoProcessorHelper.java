package BaiTapUpCastingAndDownCasting.ultils;

import BaiTapUpCastingAndDownCasting.abstracts.HocVien;

public class InfoProcessorHelper {
  public static HocVien[] getInfo(int numberOfHocViens) {
    HocVien[] hocVienList = new HocVien[numberOfHocViens];
    
    for(int i = 0; i < numberOfHocViens; i++) {
      int typeOfHocVienCode = InputHelper.inputTypeOfHocVien(i);
      HocVien hocVien = GetOrginalOfHocVienHelper.getHocVienIdentity(typeOfHocVienCode);
      GetOrginalOfHocVienHelper.logMessageByHocVienIdentity(hocVien, true);
      hocVien.addInfo();
      hocVienList[i] = hocVien;
    }
    
    return hocVienList;
  }
  
  public static void exportInfo(HocVien[] hocVienList) {
    for(HocVien hocVien : hocVienList) {
      GetOrginalOfHocVienHelper.logMessageByHocVienIdentity(hocVien, false);
      hocVien.showInfo();
    }
  }
}
