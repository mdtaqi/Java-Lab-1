package com.practice;

public class PbvPbr {
	public static void main(String[] args) {
		Boondi boondi=new Boondi();
		boondi.setSize(10);
		System.out.println("Initial size of boondi..:"+boondi.getSize());
		
		PBV pbvObj=new PBV();
		pbvObj.modifySizeOfBoondi(boondi.size);
		
		System.out.println("Size of Boondi after PBV...:"+boondi.getSize());
		
		PBR pbrObj=new PBR();
		pbrObj.modifySizeOfBoondi(boondi);
		
		System.out.println("Sizeof Boondi after PBR...:"+boondi.getSize());
	}
}
class PBV{
	public void modifySizeOfBoondi(int size) {
		size=size-5;
	}
}
class PBR{
	public void modifySizeOfBoondi(Boondi boondi) {
		boondi.setSize(5);
	}
}
class Boondi{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return this.size;
	}
}
	

