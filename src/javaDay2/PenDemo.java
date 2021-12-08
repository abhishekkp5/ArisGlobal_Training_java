package javaDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pen {
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSize() {
		return Size;
	}
	public void setSize(double size) {
		Size = size;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	private int price;
	private String brandName;
	private double Size;
	private float length;
	private char logo;
	Pen(int price,String brandName,double Size,float length,char logo){
		this.price= price;
		this.brandName=brandName;
		this.Size=Size;
		this.length=length;
		this.logo=logo;
	}
	/**public int compareTo(Pen p) {
		if(this.price==p.price) {
			return 0;
		}else if(this.price>p.price) {
			return 1;
		}else {
			return -1;
		}
	}***/
//	public int compareTo(Pen p) {
//		return (this.brandName.toLowerCase().compareTo(p.brandName.toLowerCase())) ;
//	}	
//	
	public String toString() {
		return "\nBrandName:"+this.brandName+"||Price==>"+this.price+"//Size:"+this.Size+"!!length:"+this.length;
	}
	public char getLogo() {
		return logo;
	}
	public void setLogo(char logo) {
		this.logo = logo;
	}
	public float getLength() {
		// TODO Auto-generated method stub
		return this.length;
	}
  
}
class PriceCompare implements Comparator
{
public int compare(Object p1,Object p2) {
	Pen pen1 = (Pen)p1;
	Pen pen2 = (Pen)p2;
	
	if(pen1.getPrice()==pen2.getPrice()) {
		return 0;
	}else if(pen1.getPrice()>pen2.getPrice()) {
		return 1;
	}else {
		return -1;
	}
}
}

class BrandCompare implements Comparator{
	public int compare(Object p1,Object p2) {
		Pen pen1 = (Pen)p1;
		Pen pen2 = (Pen)p2;
		
		return pen1.getBrandName().compareTo(pen2.getBrandName());
}

	
	
	private String getBrandName() {
		// TODO Auto-generated method stub
		return null;
	}
}
class SizeCompare implements Comparator
{
public int compare(Object p1,Object p2) {
	Pen pen1 = (Pen)p1;
	Pen pen2 = (Pen)p2;
	
	if(pen1.getSize()==pen2.getSize()) {
		return 0;
	}else if(pen1.getSize()>pen2.getSize()) {
		return 1;
	}else {
		return -1;
	}
}
}
class LengthCompare implements Comparator
{
public int compare(Object p1,Object p2) {
	Pen pen1 = (Pen)p1;
	Pen pen2 = (Pen)p2;
	
	if(pen1.getLength()==pen2.getLength()) {
		return 0;
	}else if(pen1.getLength()>pen2.getLength()) {
		return 1;
	}else {
		return -1;
	}
}
}
 class LogoCompare implements Comparator {
	public int compare(Object p1,Object p2) {
	Pen pen1 = (Pen)p1;
	Pen pen2 = (Pen)p2;
	
	if(pen1.getLogo()==pen2.getLogo()) {
		return 0;
	}
	return 1;

}
 }

public class PenDemo {
	public static void main(String[] args) {
		Pen p1 = new Pen(20,"Cello",2.3121,(float)2.32,'w');
		Pen p2 = new Pen(10,"reylonds",0.5212,(float)3.12,'a');
		Pen p3 = new Pen(30,"flair",0.621,(float)1.33,'d');
		Pen p4 = new Pen(25,"Jkl", 0.7232,(float)1.32,'e');
		
		List<Pen> pen = new ArrayList<>();
		pen.add(p4);
		pen.add(p3);
		pen.add(p2);
		pen.add(p1);
		
		Collections.sort(pen,new BrandCompare());
		//Collections.sort(pen,Collections.reverseOrder());
		System.out.println(pen);
		
		
		
		
		
	}
}
