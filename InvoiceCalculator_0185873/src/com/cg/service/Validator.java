package com.cg.service;

public interface Validator {
	
	String distence="[1-9][0-9]";///to validate distance less then 100km..........
	String weight="[0-9][0-9]*[.]*[0-9]*";//to validate weight more then 1g.......
	
	
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
