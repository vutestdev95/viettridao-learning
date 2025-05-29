package oop3;

import java.util.Scanner;


public class ChoNhat extends Cho{


	public void anCucXuong(CucXuong cx) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sua() {
		System.out.println("sủa hây hây");
		
	}

	@Override
	public void nuoiConBangSua() {
		// TODO Auto-generated method stub
		
	}
	
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
