package BaiTapUpCastingAndDownCasting.Ultils;

import BaiTapUpCastingAndDownCasting.Abstracts.HocVien;

import java.util.ArrayList;

public class InfoProcessorHelper {
  public static ArrayList<HocVien> getInfo(int numberOfHocViens) {
    ArrayList<HocVien> hocVienList = new ArrayList<>(numberOfHocViens);
    
    for(int i = 0; i < numberOfHocViens; i++) {
      int typeOfHocVienCode = InputHelper.inputTypeOfHocVien(i);
      HocVien hocVien = GetOrginalOfHocVienHelper.getHocVienIdentity(typeOfHocVienCode);
      GetOrginalOfHocVienHelper.logMessageByHocVienIdentity(hocVien, true);
      hocVien.addInfo();
      hocVienList.add(hocVien);
    }
    
    return hocVienList;
  }
  
  public static void exportInfo(ArrayList<HocVien> hocVienList) {
    for(HocVien hocVien : hocVienList) {
      GetOrginalOfHocVienHelper.logMessageByHocVienIdentity(hocVien, false);
      hocVien.showInfo();
    }
  }
}
