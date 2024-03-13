package com.vijay.Factory_Design_Patter;

public class Mobile_Factory {
	public static Mobile getMobile(String mobileType) {
		if (mobileType == "Apple_iphone15") {
			return new Apple_iphone15();
		} else if (mobileType == "Samsung_J7") {
			return new Samsung_J7();
		} else if (mobileType == "Sony_Xperia10") {
			return new Sony_Xperia10();
		} else {
			return null;
		}
	}
}
