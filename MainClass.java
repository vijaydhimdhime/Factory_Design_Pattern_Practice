package com.vijay.Factory_Design_Patter;

public class MainClass {
	public static void main(String[] args) {
		// manually creating object
		
		
//		Mobile mobile = new Apple_iphone15();
//		int price = mobile.price();
//		System.out.println("price : "+price);
//		Mobile mob = new Samsung_J7();
//		int price2 = mob.price();
//		System.out.println("price : "+price2);
//		Mobile mob1 = new Sony_Xperia10();
//		int price3 = mob1.price();
//		System.out.println("price : "+price3);
//		
		///Mobile_Factory creating automating object at runtime
		
		Mobile apple = Mobile_Factory.getMobile("apple_iphone15");
		int price = apple.price();
		System.out.println("price: "+price);
		System.out.println("======================================");
		Mobile samsung = Mobile_Factory.getMobile("samsung_J7");
		int price2 = samsung.price();
		System.out.println("price : "+price2);
		System.out.println("======================================");
		Mobile sony = Mobile_Factory.getMobile("sony_xperia10");
		int price3 = sony.price();
		System.out.println("price : "+price3);
		
	}
}
