package com.market.member;

public class UserInIt {
	public static User mUser;
	
	public static void setmUser(User mUser) {
		UserInIt.mUser = mUser;
	}
	
	public static void init(String name, int phone) {
		mUser = new User(name, phone);
	}
	
	public static User getmUser() {
		return mUser;
	}
}
