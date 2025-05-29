package oop3;

import java.util.Scanner;


/**
 * Class
 * Created date: 2019/06/30
 * @author Diem
 *
 */
public class ChoNha extends Cho implements ChoSan{
	
	public void anShit(Shit shit) {
		
	}
	
	// over load
	/**
	 * 
	 * @param cx object contain cuc xuong information
	 * @return boolean true: khi cuc xuong thom
	 */
	public void anCucXuong(CucXuong cx) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Method display action bark.
	 * @param
	 * 
	 * 
	 */
	public void sua() {
		System.out.println("sủa gâu gâu");
		
	}

	public void nuoiConBangSua() {
		// TODO Auto-generated method stub
		
	}

	public void timToiPham() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ten con cho: ");
		setTenCho(scan.nextLine())	;	
		System.out.println("ngay nuoi cho: ");
		setNgayNuoi(scan.nextLine());
		System.out.println("can nang: ");
		setCanNang(scan.nextFloat())	;
	}
 
}
