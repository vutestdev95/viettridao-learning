package oop3;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	ArrayList<Cho> arrCho = new ArrayList<Cho>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("So luong  con cho can nhap: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			test.nhapConCho();
		}
		for (int i = 0; i < n; i++) {
			test.showConCho(i);
		}

	}

	private void nhapConCho() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi ban chon giong cho de nhap:");
		System.out.println("1: Giong cho nha");
		System.out.println("2: Giong cho Phap");
		System.out.println("3: Giong cho Nhat");
		
		String str = scan.nextLine();
		if("1".equalsIgnoreCase(str)) {
			ChoNha choNha = new ChoNha();
			System.out.println("Xin chao ban cho Nha");
			choNha.inputInfo();
			arrCho.add(choNha);
			
		}
		if("2".equalsIgnoreCase(str)) {
			ChoPhap choPhap = new ChoPhap();
			System.out.println("Xin chao ban cho Phap");
			choPhap.inputInfo();
			arrCho.add(choPhap);
			
		}
		if("3".equalsIgnoreCase(str)) {
			ChoNhat choNhat = new ChoNhat();
			System.out.println("Xin chao ban cho Nhat");
			choNhat.inputInfo();
			arrCho.add(choNhat);
			
		}
	}

	private void showConCho(int i) {
		
		if(arrCho.get(i) instanceof ChoNha) {
			ChoNha choNha = (ChoNha)arrCho.get(i);
			choNha.sua();
			
		}
		if(arrCho.get(i) instanceof ChoPhap) {
			ChoPhap choPhap = (ChoPhap)arrCho.get(i);
			choPhap.sua();
			
		}
		if(arrCho.get(i) instanceof ChoNhat) {
			ChoNhat choNhat = (ChoNhat)arrCho.get(i);
			choNhat.sua();
			
		}
	}


}
