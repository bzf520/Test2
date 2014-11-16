package com.idianjiang.www;

public class UserTest {
	public int add(int x,int y){
		return x+y;
	}


	public int divide(int x, int y){
		return x/y;
	}
	
	//public string 
	public static void main(String args[]){
		int z= new UserTest().add(3,5);
		System.out.println(z);
	}
}
