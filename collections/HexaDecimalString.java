package com.practise.collections;

import java.util.Scanner;

//A string is considered to hexadecimal if it contains only digits(0-9) and letters A-F(case insensitive)

public class HexaDecimalString {
	
	String str;
	
	

	public HexaDecimalString(String str) {
		super();
		this.str = str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a string ");
		String str=sc.next();
		
		HexaDecimalString hexadecimalstring=new HexaDecimalString(str);
		if(hexadecimalstring.isHexaDecimal()) {
			System.out.println("Given string is HexaDecimal");
		}
		else {
			System.out.println("Given string is not HexaDecimal");
		}
		
	}	
	
	public  boolean isHexaDecimalChar(char ch) {
		
		//valid HexaDecimalCharacter (A-F or a-f)
		return ((ch>='A'&&ch<='F')||(ch>='a'&&ch<='f'));
		
	}
	
	public  boolean  isHexaDecimal() {
		
		if(str==null&&str.equals("")) {
			return false;
		}
		for(char ch:str.toCharArray()) {
			//if string should not be between (A-F or a-f) and 0-9 digits. it is not hexadecimal
			if(!isHexaDecimalChar(ch)&&!Character.isDigit(ch)) {
				return false;
			}
			
		}
		return true;
		
	}
}
