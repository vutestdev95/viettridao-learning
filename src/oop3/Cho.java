package oop3;


public abstract class Cho extends DVCoVu{
	
	private String tenCho;
	private String ngayNuoi;
	private float canNang;
	
	
	public void anCucXuong(){
		
	}
	public abstract void sua();
	public abstract void inputInfo();
	

	public String getTenCho() {
		return tenCho;
	}
	public void setTenCho(String tenCho) {
		this.tenCho = tenCho;
	}
	public String getNgayNuoi() {
		return ngayNuoi;
	}
	public void setNgayNuoi(String ngayNuoi) {
		this.ngayNuoi = ngayNuoi;
	}
	public float getCanNang() {
		return canNang;
	}
	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}

}
