package com.macross.utils;

public record Logger(String text) {
	
	public static void log(String text) {
		System.out.println(text);
	}
	
}
